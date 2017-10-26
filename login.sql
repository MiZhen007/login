/*
Navicat MySQL Data Transfer

Source Server         : 59DB
Source Server Version : 50719
Source Host           : xxxx:3306
Source Database       : xxxx

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(3) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `register_time` datetime NOT NULL,
  `last_login_time` datetime NOT NULL,
  `activation_code` char(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;



