# mavenspringmvc
基于maven的springmvc持续继承学习
#parent
主要用来消除模块间的版本依赖问题。
#entity
实体类，包括了mybatis的实体对象和Mapper的xml文件和对应的Mapper的Dao文件
#core
业务层的主要代码
#common
通用的一些工具类
#web
主要用来页面的显示
#sql语句
可能由于电脑问题还是mysql客户端什么问题，应该是版本问题吧，导致主外键失效所以sql语句只是简单的建表而已
/*
Navicat MySQL Data Transfer
Source Server Version : 50173
Source Database       : ajwy

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2015-07-09 09:28:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `c_content` varchar(200) DEFAULT NULL COMMENT '评论内容',
  `e__id` int(11) NOT NULL COMMENT '雇员id',
  `c_datatime` datetime DEFAULT NULL COMMENT '评论时间',
  `c_isdelete` tinyint(1) NOT NULL DEFAULT '1',
  `emp_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`c_id`),
  KEY `e__id` (`e__id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='评论\r\n';

-- ----------------------------
-- Table structure for t_employees
-- ----------------------------
DROP TABLE IF EXISTS `t_employees`;
CREATE TABLE `t_employees` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `e_name` varchar(20) NOT NULL,
  `e_age` int(11) NOT NULL COMMENT '年龄',
  `e_introduce` int(11) DEFAULT NULL COMMENT '介绍',
  `e_mvaddress` varchar(150) DEFAULT NULL COMMENT '服务评级(现为积分)',
  `e_phone` varchar(11) NOT NULL,
  `e_photoadd` varchar(150) DEFAULT NULL,
  `e_comments` int(11) DEFAULT NULL COMMENT '评论表（外键）',
  `e_type` varchar(255) DEFAULT NULL COMMENT '员工类别（工种）',
  `e_isDelete` tinyint(1) NOT NULL DEFAULT '1' COMMENT '1未删除',
  PRIMARY KEY (`e_id`),
  KEY `e_comments` (`e_comments`),
  KEY `e_type` (`e_type`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_emptype
-- ----------------------------
DROP TABLE IF EXISTS `t_emptype`;
CREATE TABLE `t_emptype` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类别id',
  `t_content` varchar(20) NOT NULL COMMENT '类别名字',
  `t_introduce` varchar(300) DEFAULT NULL COMMENT '类别介绍',
  `t_photoAdd` varchar(255) DEFAULT NULL COMMENT '类别图片',
  `t_other` varchar(255) DEFAULT NULL COMMENT '类别其他',
  `t_isDelete` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_masters
-- ----------------------------
DROP TABLE IF EXISTS `t_masters`;
CREATE TABLE `t_masters` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '雇主id',
  `emp_idcard` varchar(20) DEFAULT NULL COMMENT '身份证',
  `emp_name` varchar(30) DEFAULT NULL COMMENT '雇主姓名',
  `emp_phone` varchar(11) DEFAULT NULL COMMENT '雇主联系方式',
  `emp_pwd` varchar(50) NOT NULL COMMENT '雇主登录密码',
  `emp_other` varchar(200) DEFAULT NULL COMMENT '其他',
  `emp_role` varchar(50) DEFAULT 'ROLE_USER',
  `emp_phonetwo` varchar(255) DEFAULT NULL COMMENT '备用联系方式',
  `emp_isDelete` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `o_id` varchar(30) NOT NULL COMMENT '订单id',
  `o_starttime` datetime NOT NULL COMMENT '订单开始时间',
  `o_introduce` varchar(255) DEFAULT NULL COMMENT '订单介绍',
  `o_other` varchar(300) DEFAULT NULL COMMENT '其他',
  `o_status` int(11) NOT NULL COMMENT '订单状态，外键',
  `o_evaluation` varchar(300) DEFAULT NULL COMMENT '用户评价',
  `o_onwer` int(11) NOT NULL COMMENT '订单拥有者',
  `o_number` varchar(30) NOT NULL COMMENT '订单号',
  `o_isDelete` tinyint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`o_id`),
  KEY `o_status` (`o_status`),
  KEY `o_onwer` (`o_onwer`),
  CONSTRAINT `t_order_ibfk_1` FOREIGN KEY (`o_onwer`) REFERENCES `t_masters` (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_orderstatus
-- ----------------------------
DROP TABLE IF EXISTS `t_orderstatus`;
CREATE TABLE `t_orderstatus` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '状态id',
  `s_content` varchar(20) NOT NULL COMMENT '状态内容',
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) DEFAULT NULL,
  `user_password` varchar(100) DEFAULT NULL,
  `user_other` varchar(300) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

