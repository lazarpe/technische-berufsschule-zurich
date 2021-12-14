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


-- Dumping database structure for pruefung
CREATE DATABASE IF NOT EXISTS `pruefung` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `pruefung`;

-- Dumping structure for table pruefung.energieverbrauch
CREATE TABLE IF NOT EXISTS `energieverbrauch` (
  `Kennummer` int(11) NOT NULL,
  `GruppenNr` int(11) NOT NULL,
  `Nahrungsarten` varchar(60) COLLATE latin1_general_ci NOT NULL,
  `Verbrauch` float NOT NULL,
  PRIMARY KEY (`Kennummer`),
  KEY `idx_GruppenNr_Nahrungsarten` (`GruppenNr`,`Nahrungsarten`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci ROW_FORMAT=DYNAMIC;

-- Data exporting was unselected.

-- Dumping structure for table pruefung.lmgruppen
CREATE TABLE IF NOT EXISTS `lmgruppen` (
  `GruppenNr` int(11) NOT NULL,
  `GruppenName` varchar(50) COLLATE latin1_general_ci NOT NULL,
  PRIMARY KEY (`GruppenNr`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- Data exporting was unselected.

-- Dumping structure for table pruefung.naehrwerte
CREATE TABLE IF NOT EXISTS `naehrwerte` (
  `NWTNR` varchar(10) COLLATE latin1_general_ci NOT NULL,
  `LMName` varchar(60) COLLATE latin1_general_ci NOT NULL,
  `Prot` float NOT NULL,
  `Fett` float NOT NULL,
  `KH` float NOT NULL,
  `Alk` float NOT NULL,
  `Alter` int(11) DEFAULT 0,
  PRIMARY KEY (`NWTNR`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci ROW_FORMAT=DYNAMIC;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
