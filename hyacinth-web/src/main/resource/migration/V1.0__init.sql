-- Table: t_user
CREATE TABLE t_user (
  id            BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  loginName     VARCHAR(255),
  name          VARCHAR(255),
  salt          VARCHAR(255),
  password      VARCHAR(255),
  email         VARCHAR(255)
);

-- Table: t_role
CREATE TABLE t_role
(
  id          BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  code        VARCHAR(255),
  description VARCHAR(255)
);

-- Table: rt_user_role
CREATE TABLE rt_user_role
(
  user_id BIGINT NOT NULL,
  role_id BIGINT NOT NULL,
  PRIMARY KEY (user_id, role_id)
);


CREATE TABLE t_staff (
  id            BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  code          VARCHAR(255),
  name          VARCHAR(255),
  idCard        VARCHAR(255),
  phone         VARCHAR(255),
  email         VARCHAR(255)
);

INSERT INTO t_user (id, loginName, name, salt, password, email) VALUES (1, 'admin', 'Administrator', '', '123456', 'admin@admin.com');
INSERT INTO t_user (id, loginName, name, salt, password, email) VALUES (2, 'user', 'User', '', '123456', 'user@user.com');

INSERT INTO t_role (id, code, description) VALUES (1, 'admin', 'Administrator');
INSERT INTO t_role (id, code, description) VALUES (2, 'user', 'User');

INSERT INTO rt_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO rt_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO t_staff (id, code, name, idCard, phone, email) VALUES (1, 'DM10001', 'Peter', '1234567890', '1356666666', 'peter@cygia.com');
INSERT INTO t_staff (id, code, name, idCard, phone, email) VALUES (2, 'DM10002', 'Demo', '5656565656', '1355555555', 'demo@cygia.com');