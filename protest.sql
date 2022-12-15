-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 15, 2022 at 01:29 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `protest`
--

-- --------------------------------------------------------

--
-- Table structure for table `workers`
--

CREATE TABLE `workers` (
  `id_worker` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `surname` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `departmant` varchar(25) NOT NULL,
  `age` int(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `adress` text NOT NULL,
  `tel_no` varchar(35) NOT NULL,
  `deposit` double DEFAULT NULL,
  `hourly_earning` double DEFAULT NULL,
  `mountly_time` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `workers`
--

INSERT INTO `workers` (`id_worker`, `name`, `surname`, `password`, `departmant`, `age`, `gender`, `adress`, `tel_no`, `deposit`, `hourly_earning`, `mountly_time`) VALUES
(1, 'bega', 'hac', 'hac', 'Assistant', 21, 'male', 'minsk', '111-11-111-11-112', NULL, NULL, NULL),
(3, 'beasa', 'bb', 'b', 'Worker', 22, 'male', 'minsk', '112-21-22-32', NULL, NULL, NULL),
(4, 'asd', 'hacaaa', 'h', 'Worker', 33, 'male', 'minsk', '111-11-111-11-112', NULL, NULL, NULL),
(5, 'Alex', 'Makenzie', 'mak', 'Accountant', 23, 'Male', 'Minsk-Yasenina', '+375-25-222-23-43', NULL, NULL, NULL),
(6, 'Alekey', 'Adenque', 'mac', 'Accountant', 25, 'Male', 'Minsk-Chachota', '+375-25-222-23-43', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `worker_withdraw_history`
--

CREATE TABLE `worker_withdraw_history` (
  `id_history` int(11) NOT NULL,
  `deposit` double NOT NULL,
  `hourly_earning` double NOT NULL,
  `mountly_time` double NOT NULL,
  `date_withdraw` date NOT NULL,
  `id_worker` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `workers`
--
ALTER TABLE `workers`
  ADD PRIMARY KEY (`id_worker`);

--
-- Indexes for table `worker_withdraw_history`
--
ALTER TABLE `worker_withdraw_history`
  ADD PRIMARY KEY (`id_history`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `workers`
--
ALTER TABLE `workers`
  MODIFY `id_worker` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `worker_withdraw_history`
--
ALTER TABLE `worker_withdraw_history`
  MODIFY `id_history` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
