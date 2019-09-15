CREATE USER 'callan_m_admin_db'@'localhost' IDENTIFIED BY 'callanA';
GRANT ALL PRIVILEGES ON * . * TO 'callan_m_admin_db'@'localhost';
FLUSH PRIVILEGES;


CREATE DATABASE callan_vocabulary CHARACTER SET utf8 COLLATE utf8_general_ci;
