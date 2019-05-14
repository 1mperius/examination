/*
Navicat MySQL Data Transfer

Source Server         : gcp
Source Server Version : 50725
Source Host           : www.znzn.me:3306
Source Database       : ex

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-04-09 21:10:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `ad_name` varchar(20) DEFAULT NULL,
  `ad_account` varchar(20) DEFAULT NULL,
  `ad_password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_college_info
-- ----------------------------
DROP TABLE IF EXISTS `t_college_info`;
CREATE TABLE `t_college_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `col_name` varchar(20) DEFAULT NULL,
  `col_type` varchar(10) DEFAULT NULL,
  `col_tel` varchar(20) DEFAULT NULL,
  `col_url` varchar(40) DEFAULT NULL,
  `col_address` varchar(40) DEFAULT NULL,
  `col_logo` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_college_recruitmen
-- ----------------------------
DROP TABLE IF EXISTS `t_college_recruitmen`;
CREATE TABLE `t_college_recruitmen` (
  `id` int(10) NOT NULL,
  `col_id` int(10) DEFAULT NULL,
  `years` varchar(10) DEFAULT NULL,
  `tittle` varchar(20) DEFAULT NULL,
  `contents` text,
  `creater` varchar(10) DEFAULT NULL,
  `date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `colid1` (`col_id`),
  CONSTRAINT `colid1` FOREIGN KEY (`col_id`) REFERENCES `t_college_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_college_score
-- ----------------------------
DROP TABLE IF EXISTS `t_college_score`;
CREATE TABLE `t_college_score` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `col_genera` varchar(10) DEFAULT NULL,
  `col_batch` varchar(10) DEFAULT NULL,
  `year` int(10) DEFAULT NULL,
  `col_max_score` int(10) DEFAULT NULL,
  `col_ave_score` int(10) DEFAULT NULL,
  `col_min_score` int(10) DEFAULT NULL,
  `col_number` int(20) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `col_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `colid` (`col_id`),
  CONSTRAINT `colid` FOREIGN KEY (`col_id`) REFERENCES `t_college_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_major_info
-- ----------------------------
DROP TABLE IF EXISTS `t_major_info`;
CREATE TABLE `t_major_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `maj_name` varchar(20) DEFAULT NULL,
  `col_id` int(10) DEFAULT NULL,
  `maj_date` date DEFAULT NULL,
  `maj_years` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `colid2` (`col_id`),
  CONSTRAINT `colid2` FOREIGN KEY (`col_id`) REFERENCES `t_college_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_major_score
-- ----------------------------
DROP TABLE IF EXISTS `t_major_score`;
CREATE TABLE `t_major_score` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `maj_max_score` int(10) DEFAULT NULL,
  `maj_ave_score` int(10) DEFAULT NULL,
  `maj_min_score` int(10) DEFAULT NULL,
  `maj_number` int(20) DEFAULT NULL,
  `year` int(10) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `maj_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `majid` (`maj_id`),
  CONSTRAINT `majid` FOREIGN KEY (`maj_id`) REFERENCES `t_major_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_rank
-- ----------------------------
DROP TABLE IF EXISTS `t_rank`;
CREATE TABLE `t_rank` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `years` int(10) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `score` int(10) DEFAULT NULL,
  `rank` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_student_info
-- ----------------------------
DROP TABLE IF EXISTS `t_student_info`;
CREATE TABLE `t_student_info` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(20) DEFAULT NULL,
  `stu_sex` varchar(10) DEFAULT NULL,
  `stu_province` varchar(20) DEFAULT NULL,
  `stu_score` int(10) DEFAULT NULL,
  `stu_mail` varchar(40) DEFAULT NULL,
  `stu_password` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
