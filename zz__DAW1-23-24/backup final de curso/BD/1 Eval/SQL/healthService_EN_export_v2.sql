CREATE DATABASE  IF NOT EXISTS `healthservice` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `healthservice`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: healthservice
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `admission`
--

DROP TABLE IF EXISTS `admission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admission` (
  `REGISTRATION` int NOT NULL,
  `HOSPITAL_COD` tinyint NOT NULL,
  `ROOM_COD` tinyint NOT NULL,
  `BED` smallint unsigned DEFAULT NULL,
  PRIMARY KEY (`REGISTRATION`),
  KEY `IDX_ADMISSION_REGISTRATION` (`REGISTRATION`),
  KEY `IDX_ADMISSION_HOSP_ROOM` (`HOSPITAL_COD`,`ROOM_COD`),
  KEY `ADMISSION_HOSP_ROOM` (`HOSPITAL_COD`,`ROOM_COD`),
  CONSTRAINT `admission_ibfk_1` FOREIGN KEY (`REGISTRATION`) REFERENCES `patient` (`REGISTRATION`),
  CONSTRAINT `admission_ibfk_2` FOREIGN KEY (`HOSPITAL_COD`, `ROOM_COD`) REFERENCES `room` (`HOSPITAL_COD`, `ROOM_COD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admission`
--

LOCK TABLES `admission` WRITE;
/*!40000 ALTER TABLE `admission` DISABLE KEYS */;
INSERT INTO `admission` VALUES (10995,13,3,1),(14024,13,3,3),(18004,13,3,2),(36658,18,4,1),(38702,18,4,2),(39217,22,6,1),(59076,22,6,2),(63827,22,6,3),(64823,22,2,1);
/*!40000 ALTER TABLE `admission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `HOSPITAL_COD` tinyint NOT NULL,
  `DOCTOR_NO` smallint NOT NULL,
  `SURNAME` varchar(13) NOT NULL,
  `SPECIALTY` varchar(16) NOT NULL,
  PRIMARY KEY (`HOSPITAL_COD`,`DOCTOR_NO`),
  KEY `IDX_DOCTOR_HOSP` (`HOSPITAL_COD`),
  KEY `DOCTOR_ESP_HOSP` (`SPECIALTY`,`HOSPITAL_COD`),
  KEY `DOCTOR_HOSP_ESP` (`HOSPITAL_COD`,`SPECIALTY`),
  CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`HOSPITAL_COD`) REFERENCES `hospital` (`HOSPITAL_COD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (13,435,'López A.','Cardiology'),(18,585,'Miller G.','Gynecology'),(18,982,'Cajal R.','Cardiology'),(22,386,'Cabeza D.','Psiquiatria'),(22,398,'Best K.','Urology'),(22,453,'Galo D.','Paediatrics'),(45,522,'Adams C.','Neurology'),(45,607,'Nico P.','Paediatrics');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospital`
--

DROP TABLE IF EXISTS `hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospital` (
  `HOSPITAL_COD` tinyint NOT NULL,
  `NAME` varchar(10) NOT NULL,
  `ADDRESS` varchar(20) DEFAULT NULL,
  `TELEPHONE` varchar(8) DEFAULT NULL,
  `QTY_BEDS` smallint unsigned DEFAULT '0',
  PRIMARY KEY (`HOSPITAL_COD`),
  KEY `HOSPITAL_NAME` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospital`
--

LOCK TABLES `hospital` WRITE;
/*!40000 ALTER TABLE `hospital` DISABLE KEYS */;
INSERT INTO `hospital` VALUES (13,'Provincial','O Donell 50','964-4264',88),(18,'General','Atocha s/n','595-3111',63),(22,'La Paz','Castellana 1000','923-5411',162),(45,'San Carlos','Ciudad Universitaria','597-1500',92);
/*!40000 ALTER TABLE `hospital` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `REGISTRATION` int NOT NULL,
  `SURNAME` varchar(15) NOT NULL,
  `ADDRESS` varchar(20) DEFAULT NULL,
  `DATE_OF_BIRTH` date DEFAULT NULL,
  `SEX` char(1) NOT NULL,
  `SSN` char(9) DEFAULT NULL,
  PRIMARY KEY (`REGISTRATION`),
  KEY `PATIENT_DoB_SURNAME` (`DATE_OF_BIRTH`,`SURNAME`),
  KEY `PATIENT_SURNAME_DoB` (`SURNAME`,`DATE_OF_BIRTH`),
  CONSTRAINT `patient_chk_1` CHECK (((`SEX` = _utf8mb4'H') or (`SEX` = _utf8mb4'D')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (10995,'Laguía M.','Goya 20','1956-05-16','H','280862482'),(14024,'Fernández M.','Recoletos 50','1967-06-23','D','321790059'),(18004,'Serrano V.','Alcala 12','1960-05-21','D','284991452'),(36658,'Domin S.','Mayor 71','1942-01-01','H','160657471'),(38702,'Neal R.','Orense 11','1940-06-18','D','380010217'),(39217,'Cervantes M.','Peron 38','1952-02-29','H','440294390'),(59076,'Miller G.','Lopez de Hoyos 2','1945-09-16','D','311969044'),(63827,'Ruíz P.','Esquerdo 103','1980-12-26','H','100973253'),(64823,'Fraser A.','Soto 3','1980-07-10','D','285201776'),(74835,'Benítez E.','Argentina 5','1957-10-05','H','154811767');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `HOSPITAL_COD` tinyint NOT NULL,
  `ROOM_COD` tinyint NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `QTY_BEDS` smallint unsigned DEFAULT '0',
  PRIMARY KEY (`HOSPITAL_COD`,`ROOM_COD`),
  KEY `IDX_ROOM_HOSPITAL_COD` (`HOSPITAL_COD`),
  KEY `ROOM_HOSP_NAME` (`HOSPITAL_COD`,`NAME`),
  CONSTRAINT `room_ibfk_1` FOREIGN KEY (`HOSPITAL_COD`) REFERENCES `hospital` (`HOSPITAL_COD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (13,3,'Infirmary',21),(13,6,'Psychiatry',67),(18,3,'Infirmary',10),(18,4,'Cardiology',53),(22,1,'Recovery',10),(22,2,'Maternity',34),(22,6,'Psychiatry',118),(45,1,'Recovery',13),(45,2,'Maternity',24),(45,4,'Cardiology',55);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `HOSPITAL_COD` tinyint NOT NULL,
  `ROOM_COD` tinyint NOT NULL,
  `EMPLOYEE_NO` smallint NOT NULL,
  `SURNAME` varchar(15) NOT NULL,
  `ROLE` varchar(10) DEFAULT NULL,
  `SHIFT` varchar(1) DEFAULT NULL,
  `SALARY` int DEFAULT NULL,
  PRIMARY KEY (`HOSPITAL_COD`,`ROOM_COD`,`EMPLOYEE_NO`),
  KEY `IDX_STAFF_HOSP_ROOM` (`HOSPITAL_COD`,`ROOM_COD`),
  KEY `STAFF_HOSP_SURNAME` (`HOSPITAL_COD`,`SURNAME`),
  KEY `STAFF_HOSP_ROLE` (`HOSPITAL_COD`,`ROLE`),
  KEY `STAFF_ROLE_HOSP_ROOM` (`ROLE`,`HOSPITAL_COD`,`ROOM_COD`),
  CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`HOSPITAL_COD`, `ROOM_COD`) REFERENCES `room` (`HOSPITAL_COD`, `ROOM_COD`),
  CONSTRAINT `staff_chk_1` CHECK ((`SHIFT` in (_utf8mb4'M',_utf8mb4'T',_utf8mb4'N')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (13,6,3106,'Hernández J.','Nurse','T',2755000),(13,6,3754,'Díaz B.','Nurse','T',2262000),(18,4,6357,'Karplus W.','Intern','T',3379000),(22,1,6065,'Rivera G.','Nurse','N',1626000),(22,1,7379,'Carlos R.','Nurse','T',2119000),(22,2,9901,'Adams C.','Intern','M',2210000),(22,6,1009,'Higueras D.','Nurse','T',2005000),(22,6,8422,'Bocina G.','Nurse','M',1638000),(45,1,8526,'Frank H.','Nurse','T',2522000),(45,4,1280,'Amigó R.','Intern','N',2210000);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'healthservice'
--

--
-- Dumping routines for database 'healthservice'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-17 10:59:39
