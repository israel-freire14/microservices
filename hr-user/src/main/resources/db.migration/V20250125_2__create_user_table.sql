CREATE TABLE tb_user(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(100) NOT NULL,
    user_email VARCHAR(200) NOT NULL,
    user_password VARCHAR(100) NOT NULL
);