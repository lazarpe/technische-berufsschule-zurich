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


-- Dumping database structure for firma
CREATE DATABASE IF NOT EXISTS `firma` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */;
USE `firma`;

-- Dumping structure for table firma.tbl_personen
CREATE TABLE IF NOT EXISTS `tbl_personen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nachname` varchar(50) NOT NULL,
  `Telefon` varchar(50) NOT NULL,
  `Umsatz` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf32;

-- Data exporting was unselected.

-- Dumping structure for table firma.tbl_personen_backup
CREATE TABLE IF NOT EXISTS `tbl_personen_backup` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nachname` varchar(50) NOT NULL,
  `Telefon` varchar(50) NOT NULL,
  `Umsatz` double DEFAULT NULL,
  `date_backup` datetime DEFAULT NULL,
  `Action` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf32;

-- Data exporting was unselected.

-- Dumping structure for trigger firma.before_personen_delete
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `before_personen_delete` BEFORE DELETE
ON `tbl_personen`
FOR EACH ROW
BEGIN
INSERT INTO tbl_personen_backup
SET ACTION = 'delete',
Nachname = OLD.Nachname,
Telefon = OLD.Telefon,
Umsatz = OLD.Umsatz,
date_backup = NOW();
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for trigger firma.before_personen_insert
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `before_personen_insert` BEFORE INSERT
ON `tbl_personen`
FOR EACH ROW
BEGIN
INSERT INTO tbl_personen_backup
SET ACTION = 'insert',
Nachname = NEW.Nachname,
Telefon = NEW.Telefon,
Umsatz = NEW.Umsatz,
date_backup = NOW();
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for trigger firma.before_personen_update
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `before_personen_update` BEFORE UPDATE
ON `tbl_personen`
FOR EACH ROW
BEGIN
INSERT INTO tbl_personen_backup
SET ACTION = 'update',
Nachname = OLD.Nachname,
Telefon = OLD.Telefon,
Umsatz = OLD.Umsatz,
date_backup = NOW();
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
