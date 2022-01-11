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

-- Dumping data for table firma.tbl_personen: ~1 rows (approximately)
/*!40000 ALTER TABLE `tbl_personen` DISABLE KEYS */;
INSERT INTO `tbl_personen` (`id`, `Nachname`, `Telefon`, `Umsatz`) VALUES
	(1, 'Kundert', '+49 456 78 99', 10000),
	(3, 'Petrovic', '+41 75 66 4644 ', 950);
/*!40000 ALTER TABLE `tbl_personen` ENABLE KEYS */;

-- Dumping data for table firma.tbl_personen_backup: ~5 rows (approximately)
/*!40000 ALTER TABLE `tbl_personen_backup` DISABLE KEYS */;
INSERT INTO `tbl_personen_backup` (`id`, `Nachname`, `Telefon`, `Umsatz`, `date_backup`, `Action`) VALUES
	(1, 'Meier', '+41 453 25 21', 500, '2022-01-10 20:56:56', 'update'),
	(2, 'Petrovic', '+41 75 66 4644 ', 700, '2022-01-10 21:04:24', 'insert'),
	(3, 'Petrovic', '+41 75 66 4644 ', 700, '2022-01-10 21:05:16', 'update'),
	(4, 'Petrovic', '+41 75 66 4644 ', 800, '2022-01-10 21:05:26', 'update'),
	(5, 'Meier', '+41 453 25 21', 600, '2022-01-10 21:08:51', 'delete');
/*!40000 ALTER TABLE `tbl_personen_backup` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
