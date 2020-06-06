-- 单库下的水平分表数据库脚本.
create database `single-db-level-table`;
use `single-db-level-table`;
create table user_1
(
    id   bigint auto_increment not null
        primary key,
    name varchar(255) default '' not null comment '名称',
    age  int          default 0  not null comment '年龄',
    sex  varchar(20)  default '' not null comment '性别'
);
create table user_2
(
    id   bigint auto_increment not null
        primary key,
    name varchar(255) default '' not null comment '名称',
    age  int          default 0  not null comment '年龄',
    sex  varchar(20)  default '' not null comment '性别'
);