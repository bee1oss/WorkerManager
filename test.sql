-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 30 Kas 2022, 19:27:47
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
-- Veritabanı: `test`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `worker`
--

CREATE TABLE `worker` (
  `id_worker` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `surname` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `departmant` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `worker`
--

INSERT INTO `worker` (`id_worker`, `name`, `surname`, `password`, `departmant`, `date`) VALUES
(1, 'bega', 'hac', 'hac', 'Assistant', '2022-11-28');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `worker_inf`
--

CREATE TABLE `worker_inf` (
  `id_worker` int(11) NOT NULL,
  `gender` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `age` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `adress` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `tel_no` varchar(50) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `worker_inf`
--

INSERT INTO `worker_inf` (`id_worker`, `gender`, `age`, `adress`, `tel_no`) VALUES
(1, 'male', '23', 'Minsk-Kosmos', '+375-25-258-23-23');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `worker`
--
ALTER TABLE `worker`
  ADD PRIMARY KEY (`id_worker`);

--
-- Tablo için indeksler `worker_inf`
--
ALTER TABLE `worker_inf`
  ADD PRIMARY KEY (`id_worker`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `worker`
--
ALTER TABLE `worker`
  MODIFY `id_worker` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `worker_inf`
--
ALTER TABLE `worker_inf`
  MODIFY `id_worker` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
