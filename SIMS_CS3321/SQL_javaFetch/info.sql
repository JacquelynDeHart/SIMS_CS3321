DROP DATABASE IF EXISTS `info`;
CREATE DATABASE `info`;
USE `info`;

CREATE TABLE `student_info` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `birth_date` date DEFAULT NULL,
  `gpa` decimal(4,2) NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `student_info` VALUES (1,'Sean','Quintero', '1991-11-17', NULL);
INSERT INTO `student_info` VALUES (2,'Ines','Brushfield','1986-04-13', NULL);
INSERT INTO `student_info` VALUES (3,'Freddi','Boagey','1985-02-07',NULL);
INSERT INTO `student_info` VALUES (4,'Levy','Mynett','1969-10-13',NULL);

CREATE TABLE `courses` (
  `course_id` int(11) NOT NULL,
  `course_name` varchar(50) NULL,
  `student_id`int(11) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `exam_one` int(11) NULL,
  `exam_two` int(11) NULL,
  `final_exam` int(11) NULL,
  PRIMARY KEY (`course_id`), 
  FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `courses` VALUES (1,'Operating Systems',1,'Julio',NULL,NULL,NULL);

