/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.49 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `test`;

/*Table structure for table `tstudent` */

DROP TABLE IF EXISTS `tstudent`;

CREATE TABLE `tstudent` (
  `student_id` int(200) NOT NULL,
  `sname` varchar(50) COLLATE utf8_bin NOT NULL,
  `password` int(3) NOT NULL,
  `sex` tinyint(2) NOT NULL,
  `note` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `tstudent` */

insert  into `tstudent`(`student_id`,`sname`,`password`,`sex`,`note`) values (1,'李白',123,1,'诗仙'),(2,'杜甫',123,1,'诗圣'),(3,'李清照',123,0,'无'),(9,'李贺',123,1,'诗鬼'),(10,'撒大苏打',123,1,'大苏打'),(12,'626',262,0,'326'),(33,'9',59,0,'11'),(36,'李白',123,1,'打赏');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
