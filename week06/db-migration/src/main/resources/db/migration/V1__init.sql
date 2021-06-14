# 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint not null auto_increment comment 'id',
  `name` varchar(255) default null comment '姓名',
  `account` varchar(255) default null comment '账号',
  `password` varchar(255) default null comment '密码',
  `create_time` datetime default null comment '创建时间',
  `update_time` datetime default null comment '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


# 订单表
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(20) not null auto_increment comment 'id',
  `user_id` bigint not null comment '用户id',
  `name` varchar(255) not null comment '订单名称',
  `snapshot` varchar(255) not null comment '订单快照地址',
  `create_time` datetime default null comment '创建时间',
  `update_time` datetime default null comment '修改时间',
  `payment_time` datetime default null comment '付款时间',
  `delivery_time` datetime default null comment '发货时间',
  `receive_time` datetime default null comment '收货时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


# 商品表
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `id` bigint(20) not null auto_increment comment 'id',
  `name` varchar(255) not null comment '名称',
  `create_time` datetime default null comment '创建时间',
  `update_time` datetime default null comment '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
