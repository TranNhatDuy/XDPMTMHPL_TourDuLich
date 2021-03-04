-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2021 at 02:08 PM
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
-- Table structure for table `chitiet`
--

CREATE TABLE `chitiet` (
  `mact` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `matour` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madd` varchar(50) COLLATE utf8_unicode_ci NOT NULL
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
  `sotien` int(11) NOT NULL,
  `matour` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tungay` date NOT NULL,
  `denngay` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `makh` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tenkh` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngaysinh` date NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loai`
--

CREATE TABLE `loai` (
  `maloai` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tenloai` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `mota` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loaichiphi`
--

CREATE TABLE `loaichiphi` (
  `malcp` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tenlcp` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `mota` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nguoidi`
--

CREATE TABLE `nguoidi` (
  `mand` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `nguoidi_dsnhanvien` text COLLATE utf8_unicode_ci NOT NULL COMMENT 'lưu danh sách mã số nhân viên đi (json)',
  `nguoidi_dskhach` text COLLATE utf8_unicode_ci NOT NULL COMMENT 'lưu danh sách mã số khách hàng (json)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
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
  `mota` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `maloai` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `magia` varchar(50) COLLATE utf8_unicode_ci NOT NULL
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
-- Indexes for table `chitiet`
--
ALTER TABLE `chitiet`
  ADD PRIMARY KEY (`mact`),
  ADD KEY `tour_id` (`matour`,`madd`),
  ADD KEY `dd_id` (`madd`);

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
  ADD KEY `tour_id` (`matour`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`makh`);

--
-- Indexes for table `loai`
--
ALTER TABLE `loai`
  ADD PRIMARY KEY (`maloai`);

--
-- Indexes for table `loaichiphi`
--
ALTER TABLE `loaichiphi`
  ADD PRIMARY KEY (`malcp`);

--
-- Indexes for table `nguoidi`
--
ALTER TABLE `nguoidi`
  ADD PRIMARY KEY (`mand`,`madoan`),
  ADD KEY `doan_id` (`madoan`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manv`);

--
-- Indexes for table `tours`
--
ALTER TABLE `tours`
  ADD PRIMARY KEY (`matour`),
  ADD KEY `loai_id` (`maloai`),
  ADD KEY `gia_id` (`magia`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chiphi`
--
ALTER TABLE `chiphi`
  ADD CONSTRAINT `chiphi_ibfk_1` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`);

--
-- Constraints for table `chitiet`
--
ALTER TABLE `chitiet`
  ADD CONSTRAINT `chitiet_ibfk_1` FOREIGN KEY (`madd`) REFERENCES `diadiem` (`madd`),
  ADD CONSTRAINT `chitiet_ibfk_2` FOREIGN KEY (`matour`) REFERENCES `tours` (`matour`);

--
-- Constraints for table `doan`
--
ALTER TABLE `doan`
  ADD CONSTRAINT `doan_ibfk_1` FOREIGN KEY (`matour`) REFERENCES `tours` (`matour`);

--
-- Constraints for table `nguoidi`
--
ALTER TABLE `nguoidi`
  ADD CONSTRAINT `nguoidi_ibfk_1` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`);

--
-- Constraints for table `tours`
--
ALTER TABLE `tours`
  ADD CONSTRAINT `tours_ibfk_1` FOREIGN KEY (`maloai`) REFERENCES `loai` (`maloai`),
  ADD CONSTRAINT `tours_ibfk_2` FOREIGN KEY (`magia`) REFERENCES `gia` (`magia`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
