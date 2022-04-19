INSERT INTO tb_usuario (nome, email, password) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO tb_usuario (nome, email, password) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO tb_perfil (perfil_Name) VALUES ('PERFIL_OPERATOR');
INSERT INTO tb_perfil (perfil_Name) VALUES ('PERFIL_ADMIN');

INSERT INTO tb_usuario_perfil (usuario_id, perfil_id) VALUES (1, 1);
INSERT INTO tb_usuario_perfil (usuario_id, perfil_id) VALUES (2, 1);
INSERT INTO tb_usuario_perfil (usuario_id, perfil_id) VALUES (2, 2);
