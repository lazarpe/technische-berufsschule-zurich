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

-- Dumping data for table db_company.abteilung: ~2 rows (approximately)
/*!40000 ALTER TABLE `abteilung` DISABLE KEYS */;
INSERT INTO `abteilung` (`Abteilung_ID`, `Abteilung_bezeichnung`) VALUES
	(1, 'Service'),
	(2, 'CEO');
/*!40000 ALTER TABLE `abteilung` ENABLE KEYS */;

-- Dumping data for table db_company.beruf: ~2 rows (approximately)
/*!40000 ALTER TABLE `beruf` DISABLE KEYS */;
INSERT INTO `beruf` (`Beruf_ID`, `Beruf_bezeichnung`) VALUES
	(1, 'KV'),
	(2, 'Elektroniker');
/*!40000 ALTER TABLE `beruf` ENABLE KEYS */;

-- Dumping data for table db_company.person: ~1 rows (approximately)
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` (`Personalnummer`, `Nachname_Person`, `Vorname_Person`, `Abteilung_FK`, `Beruf_FK`, `Vorgesetzter_FK`) VALUES
	('123.456.001', 'Petrovic', 'Lazar', 2, 1, NULL),
	('123.456.002', 'Moser', 'Timo', 1, 2, '123.456.001');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
