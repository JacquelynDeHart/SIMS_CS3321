DROP DATABASE IF EXISTS `info`;
CREATE DATABASE `info`;
USE `info`;

CREATE TABLE `student_info` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `birth_date` date DEFAULT NULL,
  `password` int (11) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `student_info` VALUES (1,'Sean','Quintero', '1991-11-17', 111);
INSERT INTO `student_info` VALUES (2,'Ines','Brushfield','1986-04-13', 222);
INSERT INTO `student_info` VALUES (3,'Freddi','Boagey','1985-02-07', 333);
INSERT INTO `student_info` VALUES (4,'Levy','Mynett','1969-10-13', 444);

CREATE TABLE `courses` (
  `course_id` int(11) NOT NULL,
  `course_name` varchar(50) NULL,
  `student_id`int(11) NOT NULL,
  `exam_one` int(11) NULL,
  `final_exam` int(11) NULL,
  -- PRIMARY KEY (`course_id`), 
  FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `courses` VALUES (4315,'Operating Systems',1, 77,80);
INSERT INTO `courses` VALUES (2302,'Digital Logic',1,100,100);
INSERT INTO `courses` VALUES (3308,'Numerical Methods',1, 80,90);
INSERT INTO `courses` VALUES (3321,'Software Engineering',2, 100,50);
INSERT INTO `courses` VALUES (3326,'Network Security',2, 25,50);
INSERT INTO `courses` VALUES (4328,'Parallel Computing',2,10,30);
INSERT INTO `courses` VALUES (3326,'Network Security',3, 30,60);
INSERT INTO `courses` VALUES (4315,'Operating Systems',3, 90,65);
INSERT INTO `courses` VALUES (2302,'Digital Logic',3, 100,96);
INSERT INTO `courses` VALUES (3326,'Network Security',4, 100,100);
INSERT INTO `courses` VALUES (2302,'Digital Logic',4, 98,87);
INSERT INTO `courses` VALUES (3308,'Numerical Methods',4, 100,89);

-- For GPA calculation 
-- SELECT student_id, (SUM(exam_one + final_exam)/6) as GPA
-- FROM courses
-- WHERE student_id = 1