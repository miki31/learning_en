drop database callan_vocabulary;
create database callan_vocabulary character set utf8;

use callan_vocabulary;

CREATE TABLE user
(
    id INT,
    email VARCHAR(50) UNIQUE,
    password VARCHAR(255) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    nick_name VARCHAR(50),
    birthday DATE,
    photo VARCHAR(255),
    PRIMARY KEY (id)
) ENGINE=INNODB CHARACTER SET=utf8;


CREATE TABLE role
(
    id INT AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=INNODB CHARACTER SET=utf8;


CREATE TABLE user_role
(
    user_id INTEGER NOT NULL,
    role_id INTEGER NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user (id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (role_id) REFERENCES user (id) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=INNODB CHARACTER SET=utf8;

CREATE TABLE word_en
(
    id INT AUTO_INCREMENT,
    word VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=INNODB CHARACTER SET=utf8;

CREATE TABLE word_ua
(
    id INT AUTO_INCREMENT,
    word VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
)ENGINE=INNODB CHARACTER SET=utf8;

CREATE TABLE example_en
(
    id INT AUTO_INCREMENT,
    example TEXT NOT NULL,
    PRIMARY KEY (id)
)ENGINE=INNODB CHARACTER SET=utf8;

CREATE TABLE en_ua_vocabulary
(
    id INT AUTO_INCREMENT,
    page INT,
    example_en_id INT,
    word_en_id INT,
    word_ua_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (example_en_id) REFERENCES example_en (id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (word_en_id) REFERENCES word_en (id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (word_ua_id) REFERENCES word_ua (id) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=INNODB CHARACTER SET=utf8;

CREATE TABLE hibernate_sequence
(
    next_val INT
) ENGINE=INNODB;
