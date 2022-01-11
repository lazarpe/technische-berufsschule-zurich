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

-- Exportiere Daten aus Tabelle event.buchungbackup: ~0 rows (ungefähr)
/*!40000 ALTER TABLE `buchungbackup` DISABLE KEYS */;
/*!40000 ALTER TABLE `buchungbackup` ENABLE KEYS */;

-- Exportiere Daten aus Tabelle event.buchunglog: ~0 rows (ungefähr)
/*!40000 ALTER TABLE `buchunglog` DISABLE KEYS */;
/*!40000 ALTER TABLE `buchunglog` ENABLE KEYS */;

-- Exportiere Daten aus Tabelle event.buchungstabelle: ~0 rows (ungefähr)
/*!40000 ALTER TABLE `buchungstabelle` DISABLE KEYS */;
INSERT INTO `buchungstabelle` (`produkt`) VALUES
	('ABC'),
	('DEF');
/*!40000 ALTER TABLE `buchungstabelle` ENABLE KEYS */;

-- Exportiere Daten aus Tabelle event.logtable: ~1 rows (ungefähr)
/*!40000 ALTER TABLE `logtable` DISABLE KEYS */;
INSERT INTO `logtable` (`id`, `nameStoredProcedure`, `description`, `executionTime`) VALUES
	(1, 'procedurecool', 'cool description', '15:11:50');
/*!40000 ALTER TABLE `logtable` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
