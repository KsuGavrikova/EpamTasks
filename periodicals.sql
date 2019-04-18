-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: periodicals
-- ------------------------------------------------------
-- Server version	5.7.18-log

--
-- Table structure for table `editions`
--

DROP TABLE IF EXISTS `editions`;
CREATE TABLE `editions` (
  `idEditions` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `cost` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`idEditions`),
  UNIQUE KEY `idEditions_UNIQUE` (`idEditions`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `editions`
--

LOCK TABLES `editions` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `idPayment` int(11) NOT NULL AUTO_INCREMENT,
  `idUser` int(11) NOT NULL,
  `paymentAmount` decimal(10,0) NOT NULL,
  `paid` bit(1) NOT NULL,
  PRIMARY KEY (`idPayment`),
  UNIQUE KEY `idPayment_UNIQUE` (`idPayment`),
  KEY `paymentUserFK_idx` (`idUser`),
  CONSTRAINT `PaymentUserFK` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `subscription`
--

DROP TABLE IF EXISTS `subscription`;
CREATE TABLE `subscription` (
  `idSubscription` int(11) NOT NULL AUTO_INCREMENT,
  `idEditions` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `startSubscription` datetime NOT NULL,
  `stopSubscription` datetime NOT NULL,
  PRIMARY KEY (`idSubscription`),
  UNIQUE KEY `idSubscription_UNIQUE` (`idSubscription`),
  KEY `SubscriptionUserFK_idx` (`idUser`),
  KEY `SubscriptionEditionsFK_idx` (`idEditions`),
  CONSTRAINT `SubscriptionEditionsFK` FOREIGN KEY (`idEditions`) REFERENCES `editions` (`idEditions`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `SubscriptionUserFK` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `subscription`
--

LOCK TABLES `subscription` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `adress` varchar(45) DEFAULT NULL,
  `admin` bit(1) DEFAULT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `iduser_UNIQUE` (`idUser`),
  UNIQUE KEY `login_UNIQUE` (`login`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
UNLOCK TABLES;


-- Dump completed on 2019-04-18 23:07:35
