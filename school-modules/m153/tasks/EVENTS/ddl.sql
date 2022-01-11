-- --------------------------------------------------------
-- Host:                         localhost
-- Server Version:               10.6.5-MariaDB - mariadb.org binary distribution
-- Server Betriebssystem:        Win64
-- HeidiSQL Version:             11.1.0.6116
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Exportiere Datenbank Struktur für event
CREATE DATABASE IF NOT EXISTS `event` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */;
USE `event`;

-- Exportiere Struktur von Tabelle event.buchungbackup
CREATE TABLE IF NOT EXISTS `buchungbackup` (
  `produktcopy` varchar(50) COLLATE armscii8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Tabelle event.buchunglog
CREATE TABLE IF NOT EXISTS `buchunglog` (
  `timeBackup` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Tabelle event.buchungstabelle
CREATE TABLE IF NOT EXISTS `buchungstabelle` (
  `produkt` varchar(50) COLLATE armscii8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Ereignis event.eventone
DELIMITER //
CREATE EVENT `eventone` ON SCHEDULE EVERY 1 MINUTE STARTS '2022-01-11 15:09:53' ON COMPLETION NOT PRESERVE ENABLE DO BEGIN
CALL procedurecool;
END//
DELIMITER ;

-- Exportiere Struktur von Ereignis event.eventtwo
DELIMITER //
CREATE EVENT `eventtwo` ON SCHEDULE EVERY 5 MINUTE STARTS '2022-01-11 15:10:50' ON COMPLETION NOT PRESERVE ENABLE DO BEGIN
CALL procedurecool;
END//
DELIMITER ;

-- Exportiere Struktur von Tabelle event.logtable
CREATE TABLE IF NOT EXISTS `logtable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nameStoredProcedure` varchar(50) COLLATE armscii8_bin NOT NULL DEFAULT '0',
  `description` varchar(50) COLLATE armscii8_bin NOT NULL DEFAULT '0',
  `executionTime` time NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Prozedur event.procedurecool
DELIMITER //
CREATE PROCEDURE `procedurecool`()
BEGIN
INSERT INTO logtable (nameStoredProcedure, description, executionTime)
VALUES ("procedurecool", "cool description", NOW());
END//
DELIMITER ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
