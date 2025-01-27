INSERT INTO tb_user (user_name, user_email, user_password) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO tb_user (user_name, user_email, user_password) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO tb_role_access (user_role_authorization) VALUES ('OPERATOR');
INSERT INTO tb_role_access (user_role_authorization) VALUES ('ADMIN');

INSERT INTO tb_user_role_access (user_id, role_access_id) VALUES (1, 1);
INSERT INTO tb_user_role_access (user_id, role_access_id) VALUES (2, 1);
INSERT INTO tb_user_role_access (user_id, role_access_id) VALUES (2, 2);