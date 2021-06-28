## 分库分表

create schema demo_ds_0;
create schema demo_ds_1;

CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_0
(
    order_id BIGINT NOT NULL AUTO_INCREMENT,
    user_id  INT    NOT NULL,
    status   VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_1
(
    order_id BIGINT NOT NULL AUTO_INCREMENT,
    user_id  INT    NOT NULL,
    status   VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_0
(
    order_id BIGINT NOT NULL AUTO_INCREMENT,
    user_id  INT    NOT NULL,
    status   VARCHAR(50),
    PRIMARY KEY (order_id)
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_1
(
    order_id BIGINT NOT NULL AUTO_INCREMENT,
    user_id  INT    NOT NULL,
    status   VARCHAR(50),
    PRIMARY KEY (order_id)
);

insert into t_order(user_id, status)
values (1, 'OK'),
       (1, 'FAIL');
insert into t_order(user_id, status)
values (2, 'OK'),
       (2, 'FAIL');


CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_item_0
(
    order_item_id BIGINT NOT NULL AUTO_INCREMENT,
    order_id      BIGINT NOT NULL,
    user_id       INT    NOT NULL,
    status        VARCHAR(50),
    PRIMARY KEY (order_item_id)
);
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_item_1
(
    order_item_id BIGINT NOT NULL AUTO_INCREMENT,
    order_id      BIGINT NOT NULL,
    user_id       INT    NOT NULL,
    status        VARCHAR(50),
    PRIMARY KEY (order_item_id)
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_item_0
(
    order_item_id BIGINT NOT NULL AUTO_INCREMENT,
    order_id      BIGINT NOT NULL,
    user_id       INT    NOT NULL,
    status        VARCHAR(50),
    PRIMARY KEY (order_item_id)
);
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_item_1
(
    order_item_id BIGINT NOT NULL AUTO_INCREMENT,
    order_id      BIGINT NOT NULL,
    user_id       INT    NOT NULL,
    status        VARCHAR(50),
    PRIMARY KEY (order_item_id)
);

