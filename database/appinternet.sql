-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 24, 2016 at 10:00 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `appinternet`
--

-- --------------------------------------------------------

--
-- Table structure for table `dichvu`
--

CREATE TABLE `dichvu` (
  `iddv` int(11) NOT NULL,
  `tendichvu` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `dongia` int(11) NOT NULL,
  `donvi` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `soluong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `dichvu`
--

INSERT INTO `dichvu` (`iddv`, `tendichvu`, `dongia`, `donvi`, `soluong`) VALUES
(1, 'Sting', 9000, 'Chai', 24),
(2, 'Coca Cola', 7000, 'Chai', 44),
(3, 'Bohuc', 13000, 'Lon', 44),
(4, 'Yaourt Trái Cây', 15000, 'Ly', 21),
(5, 'Sinh Tố', 11000, 'Ly', 16),
(6, 'Cacao', 11000, 'Ly', 10),
(7, 'Bạc xỉu', 14000, 'Ly', 30),
(8, 'Cappuchino', 11000, 'Ly', 20),
(9, 'Frappuccino', 18000, 'Ly', 15);

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `id` int(11) NOT NULL,
  `thanhtien` int(11) NOT NULL,
  `idqtv` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `may`
--

CREATE TABLE `may` (
  `idm` int(100) NOT NULL,
  `tenmay` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tinhtrang` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  `mota` text COLLATE utf8_unicode_ci NOT NULL,
  `dongia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `may`
--

INSERT INTO `may` (`idm`, `tenmay`, `tinhtrang`, `trangthai`, `mota`, `dongia`) VALUES
(1, 'Máy 01', 'Bình Thường', 1, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(2, 'Máy 02', 'Bình Thường', 0, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(3, 'Máy 03', 'Bình Thường', 1, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(4, 'Máy 04', 'Bình Thường', 0, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(5, 'Máy 05', 'Bảo trì', 1, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(6, 'Máy 06', 'Bình Thường', 0, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(7, 'Máy 07', 'Bình Thường', 1, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(8, 'Máy 08', 'Bình Thường', 0, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(9, 'Máy 09', 'Bình Thường', 1, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(10, 'Máy 10', 'Bảo trì', 0, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000),
(11, 'Máy 11', 'Bình Thường', 1, 'Máy mới nhập hiệu Dell HD 1920*1080', 4000);

-- --------------------------------------------------------

--
-- Table structure for table `phiennguoidung`
--

CREATE TABLE `phiennguoidung` (
  `id` int(11) NOT NULL,
  `idm` int(11) NOT NULL,
  `thoigianbatdau` time NOT NULL,
  `tongthoigian` time NOT NULL,
  `thoigianchoi` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `quantrivien`
--

CREATE TABLE `quantrivien` (
  `idqt` int(100) NOT NULL,
  `tendangnhap` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `matkhau` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `hoten` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `isadmin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `quantrivien`
--

INSERT INTO `quantrivien` (`idqt`, `tendangnhap`, `matkhau`, `hoten`, `isadmin`) VALUES
(1, 'admin', '123456', 'Nguyễn Văn Vương', 1),
(2, 'admin1', '123456', 'Nguyễn Văn Lin', 0),
(3, 'admin2', 'abc@123', 'Lê Xuân Diệu', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dichvu`
--
ALTER TABLE `dichvu`
  ADD PRIMARY KEY (`iddv`);

--
-- Indexes for table `may`
--
ALTER TABLE `may`
  ADD PRIMARY KEY (`idm`);

--
-- Indexes for table `quantrivien`
--
ALTER TABLE `quantrivien`
  ADD PRIMARY KEY (`idqt`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dichvu`
--
ALTER TABLE `dichvu`
  MODIFY `iddv` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `may`
--
ALTER TABLE `may`
  MODIFY `idm` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `quantrivien`
--
ALTER TABLE `quantrivien`
  MODIFY `idqt` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
