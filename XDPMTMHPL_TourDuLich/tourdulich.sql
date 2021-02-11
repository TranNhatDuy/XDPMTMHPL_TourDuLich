-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 03, 2021 at 10:55 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tourdulich`
--

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKH` varchar(50) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `SDT` varchar(10) NOT NULL,
  `Diachi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `khachsan`
--

CREATE TABLE `khachsan` (
  `MaKS` varchar(50) NOT NULL,
  `TenKS` varchar(50) NOT NULL,
  `Gia` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `phuongtien`
--

CREATE TABLE `phuongtien` (
  `MaPT` varchar(50) NOT NULL,
  `TenPT` varchar(50) NOT NULL,
  `Gia` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tour`
--

CREATE TABLE `tour` (
  `MaTour` varchar(50) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `NgayBD` date NOT NULL,
  `NgayKT` date NOT NULL,
  `Gia` float NOT NULL,
  `Soluong` int(11) NOT NULL,
  `MaPT` varchar(50) NOT NULL,
  `MaKS` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ve`
--

CREATE TABLE `ve` (
  `MaVe` varchar(50) NOT NULL,
  `MaTour` varchar(50) NOT NULL,
  `MaKH` varchar(50) NOT NULL,
  `Thoigiandat` date NOT NULL,
  `Trangthai` varchar(50) NOT NULL,
  `Gia` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKH`);

--
-- Indexes for table `khachsan`
--
ALTER TABLE `khachsan`
  ADD PRIMARY KEY (`MaKS`);

--
-- Indexes for table `phuongtien`
--
ALTER TABLE `phuongtien`
  ADD PRIMARY KEY (`MaPT`);

--
-- Indexes for table `tour`
--
ALTER TABLE `tour`
  ADD PRIMARY KEY (`MaTour`),
  ADD KEY `MaPT` (`MaPT`),
  ADD KEY `MaKS` (`MaKS`);

--
-- Indexes for table `ve`
--
ALTER TABLE `ve`
  ADD PRIMARY KEY (`MaVe`),
  ADD KEY `MaTour` (`MaTour`,`MaKH`),
  ADD KEY `MaKH` (`MaKH`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tour`
--
ALTER TABLE `tour`
  ADD CONSTRAINT `tour_ibfk_1` FOREIGN KEY (`MaKS`) REFERENCES `khachsan` (`MaKS`),
  ADD CONSTRAINT `tour_ibfk_2` FOREIGN KEY (`MaPT`) REFERENCES `phuongtien` (`MaPT`);

--
-- Constraints for table `ve`
--
ALTER TABLE `ve`
  ADD CONSTRAINT `ve_ibfk_1` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`),
  ADD CONSTRAINT `ve_ibfk_2` FOREIGN KEY (`MaTour`) REFERENCES `tour` (`MaTour`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
