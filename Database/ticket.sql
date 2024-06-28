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
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `id` varchar(255) NOT NULL,
  `flightid` varchar(255) NOT NULL,
  `customerid` varchar(255) NOT NULL,
  `class` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL,
  `seats` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`id`, `flightid`, `customerid`, `class`, `price`, `seats`, `date`) VALUES
('T0001', 'F0003', 'CS002', 'Economy', '3456', '1', '2023-11-03'),
('T0002', 'F0005', 'CS001', 'VIP special', '3456', '5', '2023-11-03'),
('T0003', 'F0006', 'CS003', 'VIP special', '5678', '2', '2023-11-10'),
('T0004', 'F0003', 'CS004', 'Business', '3456', '4', '2023-11-03'),
('T0005', 'F0005', 'CS004', 'Business', '3456', '0', '2023-11-03'),
('T0006', 'jlabel2', 'CS004', 'Economy', '4567', '0', '2023-11-02'),
('T0007', 'F0004', 'CS005', 'Business', '3456', '2', '2023-11-25'),
('T0008', 'F0004', 'CS004', 'Business', '3456', '2', '2023-11-14'),
('T0009', 'F0004', 'CS004', 'VIP special', '3456', '2', '2023-11-02'),
('T0010', 'F0004', 'CS004', 'Business', '3456', '4', '2023-11-08'),
('T0011', 'F0004', 'CS004', 'Business', '3456', '3', '2023-11-03'),
('T0012', 'jlabel2', 'CS003', 'VIP special', '4567', '33', '2023-11-02');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
