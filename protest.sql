-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 23 Ara 2022, 11:25:39
-- Sunucu sürümü: 10.4.25-MariaDB
-- PHP Sürümü: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `protest`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `workers`
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
  `hours` float DEFAULT NULL,
  `deposit` float DEFAULT NULL,
  `hourly_earning` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `workers`
--

INSERT INTO `workers` (`id_worker`, `name`, `surname`, `password`, `departmant`, `age`, `gender`, `adress`, `tel_no`, `hours`, `deposit`, `hourly_earning`) VALUES
(1, 'Quaresma', 'Gonzalez', 'hac', 'Assistant', 23, 'Male', 'minsk', '111-11-111-11-112', 100, 500, 5),
(3, 'Geralt', 'Jr', 'b', 'Manager', 22, 'Male', 'minsk', '112-21-22-32', 10, 25, 2.5),
(4, 'Thalia', 'Harrell', 'h', 'Worker', 33, 'Famale', 'minsk', '111-11-111-11-112', NULL, NULL, 2.5),
(5, 'Alex', 'Makenzie', 'mak', 'Accountant', 23, 'Male', 'Minsk-Yasenina', '+375-25-222-23-43', 0, 0, 6),
(6, 'Alekey', 'Adenque', 'mac', 'Accountant', 25, 'Male', 'Minsk-Chachota', '+375-25-222-23-43', NULL, NULL, 6),
(7, 'Sahar', 'Goodman', 'mac', 'Accountant', 25, 'Famale', 'Minsk-Chachota', '+375-25-222-23-43', NULL, NULL, 6),
(8, 'Luniz', 'Bekci', 'Bekci', 'Engineer', 38, 'Male', 'Minks-Schorsa', '+375-25-355-45-78', NULL, NULL, NULL),
(9, 'Sonya', 'Voldova', 'Voldova', 'Designer', 26, 'Famale', 'Minsk-Surganova', '+375-23-456-78-55', 0, 0, 6);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `worker_withdraw_history`
--

CREATE TABLE `worker_withdraw_history` (
  `id_history` int(11) NOT NULL,
  `withdraw` float NOT NULL,
  `hourly_earning` float NOT NULL,
  `hours` float NOT NULL,
  `id_worker` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `worker_withdraw_history`
--

INSERT INTO `worker_withdraw_history` (`id_history`, `withdraw`, `hourly_earning`, `hours`, `id_worker`) VALUES
(1, 150, 6, 15, 1),
(2, 150, 6, 15, 1);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `workers`
--
ALTER TABLE `workers`
  ADD PRIMARY KEY (`id_worker`);

--
-- Tablo için indeksler `worker_withdraw_history`
--
ALTER TABLE `worker_withdraw_history`
  ADD PRIMARY KEY (`id_history`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `workers`
--
ALTER TABLE `workers`
  MODIFY `id_worker` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Tablo için AUTO_INCREMENT değeri `worker_withdraw_history`
--
ALTER TABLE `worker_withdraw_history`
  MODIFY `id_history` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
