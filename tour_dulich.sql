-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2021 at 06:55 AM
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
-- Database: `tour_dulich`
--

-- --------------------------------------------------------

--
-- Table structure for table `chiphi`
--

CREATE TABLE `chiphi` (
  `macp` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tongchiphi` int(11) NOT NULL,
  `chitiet` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT 'lưu danh sách chi phí (json)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `diadiem`
--

CREATE TABLE `diadiem` (
  `madd` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `thanhpho` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tendd` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `mota` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `doan`
--

CREATE TABLE `doan` (
  `madoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `matour` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tendoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngaydi` date NOT NULL,
  `ngayve` date NOT NULL,
  `chitietchuongtrinh` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `gia`
--

CREATE TABLE `gia` (
  `magia` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madd` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `sotien` int(11) NOT NULL,
  `tungay` date NOT NULL,
  `denngay` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `makh` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tenkh` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngaysinh` date NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madoan` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tennv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngaysinh` date NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `nhiemvu` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tours`
--

CREATE TABLE `tours` (
  `matour` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tentour` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madd` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `mota` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chiphi`
--
ALTER TABLE `chiphi`
  ADD PRIMARY KEY (`macp`,`madoan`),
  ADD KEY `doan_id` (`madoan`);

--
-- Indexes for table `diadiem`
--
ALTER TABLE `diadiem`
  ADD PRIMARY KEY (`madd`);

--
-- Indexes for table `doan`
--
ALTER TABLE `doan`
  ADD PRIMARY KEY (`madoan`),
  ADD KEY `tour_id` (`matour`);

--
-- Indexes for table `gia`
--
ALTER TABLE `gia`
  ADD PRIMARY KEY (`magia`),
  ADD KEY `madd` (`madd`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`makh`),
  ADD KEY `madoan` (`madoan`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manv`),
  ADD KEY `madoan` (`madoan`);

--
-- Indexes for table `tours`
--
ALTER TABLE `tours`
  ADD PRIMARY KEY (`matour`),
  ADD KEY `madd` (`madd`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chiphi`
--
ALTER TABLE `chiphi`
  ADD CONSTRAINT `chiphi_ibfk_1` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`);

--
-- Constraints for table `doan`
--
ALTER TABLE `doan`
  ADD CONSTRAINT `doan_ibfk_1` FOREIGN KEY (`matour`) REFERENCES `tours` (`matour`);

--
-- Constraints for table `gia`
--
ALTER TABLE `gia`
  ADD CONSTRAINT `gia_ibfk_1` FOREIGN KEY (`madd`) REFERENCES `diadiem` (`madd`);

--
-- Constraints for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`);

--
-- Constraints for table `tours`
--
ALTER TABLE `tours`
  ADD CONSTRAINT `tours_ibfk_3` FOREIGN KEY (`madd`) REFERENCES `diadiem` (`madd`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
