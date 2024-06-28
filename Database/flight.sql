-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 23, 2023 at 01:09 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airline`
--

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `flightid` varchar(255) NOT NULL,
  `flightname` varchar(255) NOT NULL,
  `source` varchar(255) NOT NULL,
  `departure` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `departuretime` varchar(255) NOT NULL,
  `arrivaltime` varchar(255) NOT NULL,
  `Flightcharge` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`flightid`, `flightname`, `source`, `departure`, `date`, `departuretime`, `arrivaltime`, `Flightcharge`) VALUES
('F0001', 'hk', 'hkhkh', 'khkh', '2023-11-03', 'hkhh', 'khh', 'khh'),
('F0002', 'dsfsdf', 'dsfsd', 'dsfsd', '2023-11-03', 'dfsd', 'dsfsd', 'dfsd'),
('F0003', 'starlight', 'India', 'SouthKorea', '2023-11-10', '4:00 am', '6:00 am', '3456'),
('F0004', 'Marine', 'India', 'Japan', '2023-12-13', '3:00 pm', '4:56 pm', '3456'),
('F0005', 'Raven', 'India', 'America', '2023-11-17', '5:00 PM', '12:00 AM', '3456'),
('F0006', 'heaven', 'India', 'Autralia', '2023-11-01', '5:00 PM', '4:00 AM', '5678'),
('jlabel2', 'galaxy', 'India', 'Europe', '2023-11-03', '4:00 am', '3:00 pm', '4567');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
