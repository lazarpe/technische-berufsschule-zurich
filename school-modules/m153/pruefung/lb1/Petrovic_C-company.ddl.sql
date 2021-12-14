-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.6.5-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.1.0.6116
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for db_company
CREATE DATABASE IF NOT EXISTS `db_company` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */;
USE `db_company`;

-- Dumping structure for table db_company.abteilung
CREATE TABLE IF NOT EXISTS `abteilung` (
  `Abteilung_ID` int(11) NOT NULL,
  `Abteilung_bezeichnung` varchar(50) COLLATE armscii8_bin NOT NULL DEFAULT '',
  PRIMARY KEY (`Abteilung_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Data exporting was unselected.

-- Dumping structure for table db_company.beruf
CREATE TABLE IF NOT EXISTS `beruf` (
  `Beruf_ID` int(11) NOT NULL,
  `Beruf_bezeichnung` varchar(50) COLLATE armscii8_bin NOT NULL DEFAULT '',
  PRIMARY KEY (`Beruf_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Data exporting was unselected.

-- Dumping structure for table db_company.person
CREATE TABLE IF NOT EXISTS `person` (
  `Personalnummer` varchar(50) COLLATE armscii8_bin NOT NULL,
  `Nachname_Person` varchar(50) COLLATE armscii8_bin NOT NULL DEFAULT '',
  `Vorname_Person` varchar(50) COLLATE armscii8_bin NOT NULL DEFAULT '',
  `Abteilung_FK` int(11) NOT NULL DEFAULT 0,
  `Beruf_FK` int(11) NOT NULL DEFAULT 0,
  `Vorgesetzter_FK` varchar(50) COLLATE armscii8_bin DEFAULT NULL,
  PRIMARY KEY (`Personalnummer`),
  KEY `Abteilung_FK` (`Abteilung_FK`),
  KEY `Beruf_FK` (`Beruf_FK`),
  KEY `Vorgesetzter_FK` (`Vorgesetzter_FK`),
  CONSTRAINT `Abteilung_FK` FOREIGN KEY (`Abteilung_FK`) REFERENCES `abteilung` (`Abteilung_ID`),
  CONSTRAINT `Beruf_FK` FOREIGN KEY (`Beruf_FK`) REFERENCES `beruf` (`Beruf_ID`),
  CONSTRAINT `Vorgesetzter_FK` FOREIGN KEY (`Vorgesetzter_FK`) REFERENCES `person` (`Personalnummer`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
