CREATE DATABASE  IF NOT EXISTS `liga_es` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `liga_es`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: liga_es
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `arbrito`
--

DROP TABLE IF EXISTS `arbrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `arbrito` (
  `Id` int(11) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `apellidos` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `arbrito`
--

LOCK TABLES `arbrito` WRITE;
/*!40000 ALTER TABLE `arbrito` DISABLE KEYS */;
INSERT INTO `arbrito` VALUES (1,'Jaime','Garcia'),(2,'María','Gomez'),(3,'J.J.','Rodriguez'),(4,'Ángel','Alcaraz'),(5,'M.Jose','Lopez'),(6,'Oscar','Lacasa'),(7,'Jose','Jimenez');
/*!40000 ALTER TABLE `arbrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipo` (
  `Id` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `ciudad` varchar(20) DEFAULT NULL,
  `webOficial` varchar(200) DEFAULT NULL,
  `clasificacion` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
INSERT INTO `equipo` VALUES (1,'Regal Barcelona','Barcelona','http://www.fcbarcelona.com/web/index_idiomes.html',10),(2,'Real Madrid','Madrid','http://www.realmadrid.com/cs/Satellite/es/1193040472450/SubhomeEquipo/Baloncesto.htm',9),(3,'P.E. Valencia','Valencia','http://www.valenciabasket.com/',11),(4,'Cajal Laboral','Vitoria','http://www.baskonia.com/prehomes/prehomes.asp?id_prehomes=69',22),(5,'Gran Canaria','Las palmas','http://www.acb.com/club.php?id=CLA',14),(6,'CAI Zaragoza','Zaragoza','http://www.basketzaragoza.net/',23);
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugador` (
  `Id` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellidos` varchar(15) DEFAULT NULL,
  `posicion` int(11) DEFAULT NULL,
  `capitan` int(11) DEFAULT NULL,
  `fechaIncorporacion` date DEFAULT NULL,
  `salario` int(11) DEFAULT NULL,
  `equipo` int(11) DEFAULT NULL,
  `altura` decimal(3,2) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `jugador_FK_1` (`capitan`),
  KEY `jugador_FK_2` (`posicion`),
  KEY `jugador_FK_3` (`equipo`),
  CONSTRAINT `jugador_FK_1` FOREIGN KEY (`capitan`) REFERENCES `jugador` (`Id`),
  CONSTRAINT `jugador_FK_2` FOREIGN KEY (`posicion`) REFERENCES `posicion` (`Id`),
  CONSTRAINT `jugador_FK_3` FOREIGN KEY (`equipo`) REFERENCES `equipo` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
INSERT INTO `jugador` VALUES (1,'Juan Carlos','Navarro',2,1,'2010-01-10',130000,1,NULL),(2,'Felipe','Reyes',1,2,'2009-02-20',120000,2,2.04),(3,'Victor','Claver',3,3,'2009-03-08',90000,3,2.08),(4,'Rafa','Martinez',2,4,'2010-11-11',51000,3,1.91),(5,'Fernando','San Emeterio',3,NULL,'2008-09-22',60000,4,1.99),(6,'Mirza','Teletovic',1,6,'2010-05-13',70000,4,2.06),(7,'Sergio','Llull',2,2,'2011-10-29',100000,2,1.90),(8,'Victor','Sada',4,1,'2012-01-01',80000,1,1.92),(9,'Carlos','Suarez',3,2,'2011-02-19',60000,2,2.03),(10,'Xavi','Rey',1,NULL,'2008-10-12',95000,5,2.09),(11,'Carlos','Cabeza',4,NULL,'2012-01-21',105000,6,1.86),(12,'Pablo','Aguilar',3,NULL,'2011-06-14',47000,6,2.03),(13,'Rafa','Hettsheimeir',1,13,'2008-04-15',53000,6,2.08),(14,'Sitapha','Savané',1,14,'2011-07-27',60000,5,2.01);
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partido`
--

DROP TABLE IF EXISTS `partido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partido` (
  `equipoVisitante` int(11) NOT NULL,
  `equipoLocal` int(11) NOT NULL,
  `resultado` varchar(7) DEFAULT NULL,
  `fechaPartido` date DEFAULT NULL,
  `arbrito` int(11) DEFAULT NULL,
  PRIMARY KEY (`equipoVisitante`,`equipoLocal`),
  KEY `partido_FK_1` (`arbrito`),
  KEY `partido_FK_3` (`equipoLocal`),
  CONSTRAINT `partido_FK_1` FOREIGN KEY (`arbrito`) REFERENCES `arbrito` (`Id`),
  CONSTRAINT `partido_FK_2` FOREIGN KEY (`equipoVisitante`) REFERENCES `equipo` (`Id`),
  CONSTRAINT `partido_FK_3` FOREIGN KEY (`equipoLocal`) REFERENCES `equipo` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partido`
--

LOCK TABLES `partido` WRITE;
/*!40000 ALTER TABLE `partido` DISABLE KEYS */;
INSERT INTO `partido` VALUES (1,2,'100-100','2011-10-10',4),(1,6,'66-78','2011-11-30',6),(2,3,'90-91','2011-11-17',5),(2,4,'90-90','2012-01-12',7),(3,4,'88-77','2011-11-23',6),(3,6,'91-88','2012-02-22',3),(4,5,'79-83','2012-01-19',3),(5,4,'90-66','2012-04-27',2),(6,5,'110-70','2012-05-30',1);
/*!40000 ALTER TABLE `partido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `posicion`
--

DROP TABLE IF EXISTS `posicion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `posicion` (
  `Id` int(11) NOT NULL,
  `descripcion` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posicion`
--

LOCK TABLES `posicion` WRITE;
/*!40000 ALTER TABLE `posicion` DISABLE KEYS */;
INSERT INTO `posicion` VALUES (1,'Pivot'),(2,'Escolta'),(3,'Alero'),(4,'Base');
/*!40000 ALTER TABLE `posicion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-17 20:59:23