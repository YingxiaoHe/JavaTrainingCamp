# 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`          bigint       not null auto_increment comment 'id',
    `name`        varchar(255) not null default '' comment '昵称',
    `account`     varchar(255) not null default '' comment '账号',
    `password`    varchar(255) not null default '' comment '密码',
    `create_time` datetime     not null default current_timestamp() comment '创建时间',
    `update_time` datetime              default current_timestamp() comment '修改时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# 用户地址表
drop table if exists `user_address`;
create table `user_address`
(
    `id`        bigint       not null auto_increment comment 'id',
    `user_id`   bigint       not null default -1 comment '用户id',
    `address`   varchar(255) not null default '' comment '详细地址',
    `contacts`  varchar(50)  not null default '' comment '联系人昵称',
    `telephone` varchar(20)  not null default '' comment '联系电话',
    `area_code` varchar(20)           default '000000' comment '地址所属地区行政编码',
    primary key (`id`),
    key `user_id` (`user_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# 订单表
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`
(
    `id`            varchar(255) not null comment 'id',
    `user_id`       bigint       not null default -1 comment '用户id',
    `name`          varchar(255) not null default '' comment '订单名称',
    `snapshot`      varchar(255) not null default '' comment '订单快照地址',
    `create_time`   datetime     not null default current_timestamp() comment '创建时间',
    `update_time`   datetime              default null comment '修改时间',
    `payment_time`  datetime              default null comment '付款时间',
    `delivery_time` datetime              default null comment '发货时间',
    `receive_time`  datetime              default null comment '收货时间',
    `status`        int                   default 0 comment '订单状态',
    primary key (`id`),
    key `user_id` (`user_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# 订单、商品关联表
drop table if exists `order_commodity_rel`;
create table `order_commodity_rel`
(
    `id`           varchar(255) not null comment 'id',
    `user_id`      bigint       not null default -1 comment '用户id',
    `order_id`     varchar(255) not null default '-1' comment '订单id',
    `commodity_id` varchar(255) not null default '-1' comment '商品id',
    primary key (`id`),
    key `full_key` (`user_id`, `order_id`, `commodity_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# 商品表
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`
(
    `id`          varchar(255) not null comment 'id',
    `name`        varchar(255) not null default '' comment '名称',
    `price`       int          not null default 0 comment '商品价格',
    `create_time` datetime     not null default current_timestamp() comment '创建时间',
    `update_time` datetime              default null comment '修改时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# 店铺表
drop table if exists `shop`;
create table `shop`
(
    `id`          bigint       not null auto_increment comment 'id',
    `name`        varchar(255) not null comment '名称',
    `create_time` datetime     not null default current_timestamp() comment '创建时间',
    `update_time` datetime              default null comment '修改时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# 店铺、商品关联表
drop table if exists `shop_commodity_rel`;
create table `shop_commodity_rel`
(
    `id`           varchar(255) not null comment 'id',
    `shop_id`      bigint       not null default -1 comment '店铺id',
    `commodity_id` bigint       not null default -1 comment '商品id',
    primary key (`id`),
    key `full_key` (`shop_id`, `commodity_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
