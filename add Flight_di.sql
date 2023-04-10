CREATE DATABASE  IF NOT EXISTS `Flight_directory`;
USE `Flight_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `flight_log`;

CREATE TABLE `flight_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `flightID` varchar(45) DEFAULT NULL,
  `takeoff` varchar(45) DEFAULT NULL,
  `landing` varchar(45) DEFAULT NULL,
  `Duration` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;