-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `question_id` varchar(255) NOT NULL,
  `answera` varchar(255) DEFAULT NULL,
  `answerb` varchar(255) DEFAULT NULL,
  `answerc` varchar(255) DEFAULT NULL,
  `answerd` varchar(255) DEFAULT NULL,
  `question_name` varchar(255) DEFAULT NULL,
  `right_answer` varchar(255) DEFAULT NULL,
  `subject_id` int NOT NULL,
  PRIMARY KEY (`question_id`),
  KEY `FKkq1r812vkfk7eq4xxdn6k51qv` (`subject_id`),
  CONSTRAINT `FKkq1r812vkfk7eq4xxdn6k51qv` FOREIGN KEY (`subject_id`) REFERENCES `_subject` (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES ('005','Đa1','Đa2','Đa3','Đa4','Chuyển động?','Đa Đúng',1),('006','Đa1','Đa2','Đa3','Đa4','Chuyển động?','Đa Đúng',1),('007','Đa1','Đa2','Đa3','Đa4','Chuyển động?','Đa Đúng',1),('008','Đa1','Đa2','Đa3','Đa4','Chuyển động?','Đa Đúng',1),('009','Đa1','Đa2','Đa3','Đa4','Chuyển động?','Đa Đúng',2),('010','Đa1','Đa2','Đa3','Đa4','Chuyển động?','Đa Đúng',1),('1231131','1','2','3','4','123','1',2),('6',' A. Mặt Trăng quay quanh Trái Đất.','B. Đoàn tàu chuyển động trong sân ga.','C. Em bé trượt từ đỉnh đến chân cầu trượt.','D. Chuyển động tự quay của Trái Đất quanh trục.','Trong các ví dụ dưới đây, trường hợp nào vật chuyển động được coi như là chất điểm?','A',2),('7','A. Trái Đất quay quanh Mặt Trời.',' B. Mặt Trời quay quanh Trái Đất.','C. Mặt Trời đứng yên còn Trái Đất chuyển động.','D. Cả Mặt Trời và Trái Đất đều chuyển động.','Khi chọn Trái Đất làm vật mốc thì câu nói nào sau đây đúng?','B',2),('8','A. Trái Đất trong chuyển động tự quay quanh mình nó.','B. Hai hòn bi lúc va chạm với nhau.','C. Người nhảy cầu lúc đang rơi xuống nước.','D. Giọt nước mưa lúc đang rơi.','Trường hợp nào dưới đây có thể coi vật là chất điểm ?','D',2);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-16 11:13:10
