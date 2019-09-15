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
