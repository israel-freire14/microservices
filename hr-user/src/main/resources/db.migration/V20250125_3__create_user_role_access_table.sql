CREATE TABLE tb_user_role_access (
    user_id BIGINT NOT NULL,
    role_access_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, role_access_id),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES tb_user (id),
    CONSTRAINT fk_role FOREIGN KEY (role_access_id) REFERENCES tb_role_access (id)
);