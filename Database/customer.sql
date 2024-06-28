-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 23, 2023 at 01:07 PM
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
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(255) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `PassportID` varchar(255) NOT NULL,
  `Address` text NOT NULL,
  `DOB` varchar(255) NOT NULL,
  `Country` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Contact` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `FirstName`, `LastName`, `PassportID`, `Address`, `DOB`, `Country`, `Gender`, `Contact`) VALUES
('CS001', 'ajay', 'joon', 'adfsdf', 'adsdfsd', '2023-11-03', 'india', 'male', '9170753256'),
('CS002', 'tae', 'ri', 'ajcdpa', 'lucknow', '2004-11-05', 'India', 'Male', '170753256'),
('CS003', 'shubham', 'mishra', 'ajc9n', 'gonda', '2011-11-03', 'india', 'male', '7898652345'),
('CS004', 'vipul', 'kumar', 'dffhhf', 'lucknow', '2019-11-07', 'india', 'male', '985632458'),
('CS005', 'vipul', 'Kumar', 'Dhankars', 'babri shamli uttar pradesh', '2023-11-15', 'india', 'male', '8650572222');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
