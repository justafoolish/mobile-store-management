-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Apr 16, 2021 at 09:24 AM
-- Server version: 5.7.30
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `QLCH`
--

-- --------------------------------------------------------

--
-- Table structure for table `CHITIETGIAMGIA`
--

CREATE TABLE `CHITIETGIAMGIA` (
  `MAGIAMGIA` varchar(5) NOT NULL,
  `MASANPHAM` varchar(5) NOT NULL,
  `CHIETKHAU` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `CHITIETHOADON`
--

CREATE TABLE `CHITIETHOADON` (
  `MAHOADON` varchar(10) NOT NULL,
  `MASANPHAM` varchar(5) NOT NULL,
  `SOLUONG` int(11) NOT NULL,
  `THANHTIEN` int(11) NOT NULL,
  `CHIETKHAU` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `CHITIETPHIEUNHAP`
--

CREATE TABLE `CHITIETPHIEUNHAP` (
  `MAPHIEUNHAP` varchar(6) NOT NULL,
  `MASANPHAM` varchar(5) NOT NULL,
  `SOLUONG` int(11) NOT NULL,
  `DONGIA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `CHUONGTRINHGIAMGIA`
--

CREATE TABLE `CHUONGTRINHGIAMGIA` (
  `MAGIAMGIA` varchar(5) NOT NULL,
  `TENCHUONGTRINH` varchar(20) NOT NULL,
  `NGAYBATDAU` date NOT NULL,
  `NGAYKETTHUC` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `HOADON`
--

CREATE TABLE `HOADON` (
  `MAHOADON` varchar(10) NOT NULL,
  `MAKHACHHANG` varchar(5) NOT NULL,
  `MANHANVIEN` varchar(5) NOT NULL,
  `MAGIAMGIA` varchar(5) NOT NULL,
  `NGAYLAP` date NOT NULL,
  `TONGTIEN` int(11) NOT NULL,
  `TONGCHIETKHAU` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `KHACHHANG`
--

CREATE TABLE `KHACHHANG` (
  `MAKH` varchar(5) NOT NULL,
  `TENKH` varchar(10) NOT NULL,
  `HOKH` varchar(10) NOT NULL,
  `GIOITINH` varchar(5) NOT NULL,
  `DIACHI` varchar(255) NOT NULL,
  `SDT` varchar(15) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `TONGCHITIEU` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `LOAISANPHAM`
--

CREATE TABLE `LOAISANPHAM` (
  `MALOAI` varchar(5) NOT NULL,
  `TENLOAI` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `NHACUNGCAP`
--

CREATE TABLE `NHACUNGCAP` (
  `MANCC` varchar(5) NOT NULL,
  `TENNCC` varchar(25) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `DIACHI` varchar(255) NOT NULL,
  `SDT` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `NHANVIEN`
--

CREATE TABLE `NHANVIEN` (
  `MANHANVIEN` varchar(5) NOT NULL,
  `TENNV` varchar(10) NOT NULL,
  `HONV` varchar(10) NOT NULL,
  `GIOITINH` varchar(3) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `DIACHI` varchar(255) NOT NULL,
  `CHUCVU` varchar(25) NOT NULL,
  `SDT` varchar(15) NOT NULL,
  `LUONG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `NHASANXUAT`
--

CREATE TABLE `NHASANXUAT` (
  `MANSX` varchar(5) NOT NULL,
  `TENNSX` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `PHIEUNHAP`
--

CREATE TABLE `PHIEUNHAP` (
  `MAPHIEUNHAP` varchar(6) NOT NULL,
  `MANHANVIEN` varchar(5) NOT NULL,
  `MANCC` varchar(5) NOT NULL,
  `NGAYNHAP` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `SANPHAM`
--

CREATE TABLE `SANPHAM` (
  `MASANPHAM` varchar(5) NOT NULL,
  `TENSANPHAM` varchar(20) NOT NULL,
  `MALOAI` varchar(5) NOT NULL,
  `MANSX` varchar(5) NOT NULL,
  `SOLUONG` int(11) NOT NULL,
  `GIATIEN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `CHITIETGIAMGIA`
--
ALTER TABLE `CHITIETGIAMGIA`
  ADD PRIMARY KEY (`MAGIAMGIA`,`MASANPHAM`),
  ADD KEY `FK_MASP` (`MASANPHAM`);

--
-- Indexes for table `CHITIETHOADON`
--
ALTER TABLE `CHITIETHOADON`
  ADD PRIMARY KEY (`MAHOADON`,`MASANPHAM`),
  ADD KEY `FK_MASPHD` (`MASANPHAM`);

--
-- Indexes for table `CHITIETPHIEUNHAP`
--
ALTER TABLE `CHITIETPHIEUNHAP`
  ADD PRIMARY KEY (`MAPHIEUNHAP`,`MASANPHAM`),
  ADD KEY `FK_MASPPN` (`MASANPHAM`);

--
-- Indexes for table `CHUONGTRINHGIAMGIA`
--
ALTER TABLE `CHUONGTRINHGIAMGIA`
  ADD PRIMARY KEY (`MAGIAMGIA`);

--
-- Indexes for table `HOADON`
--
ALTER TABLE `HOADON`
  ADD PRIMARY KEY (`MAHOADON`),
  ADD KEY `FK_MAKH` (`MAKHACHHANG`),
  ADD KEY `FK_MAGG` (`MAGIAMGIA`),
  ADD KEY `FK_MANVHD` (`MANHANVIEN`);

--
-- Indexes for table `KHACHHANG`
--
ALTER TABLE `KHACHHANG`
  ADD PRIMARY KEY (`MAKH`);

--
-- Indexes for table `LOAISANPHAM`
--
ALTER TABLE `LOAISANPHAM`
  ADD PRIMARY KEY (`MALOAI`);

--
-- Indexes for table `NHACUNGCAP`
--
ALTER TABLE `NHACUNGCAP`
  ADD PRIMARY KEY (`MANCC`);

--
-- Indexes for table `NHANVIEN`
--
ALTER TABLE `NHANVIEN`
  ADD PRIMARY KEY (`MANHANVIEN`);

--
-- Indexes for table `NHASANXUAT`
--
ALTER TABLE `NHASANXUAT`
  ADD PRIMARY KEY (`MANSX`);

--
-- Indexes for table `PHIEUNHAP`
--
ALTER TABLE `PHIEUNHAP`
  ADD PRIMARY KEY (`MAPHIEUNHAP`),
  ADD KEY `FK_MANV` (`MANHANVIEN`),
  ADD KEY `FK_MANCC` (`MANCC`);

--
-- Indexes for table `SANPHAM`
--
ALTER TABLE `SANPHAM`
  ADD PRIMARY KEY (`MASANPHAM`),
  ADD KEY `FK_MANSX` (`MANSX`),
  ADD KEY `FK_MALOAI` (`MALOAI`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `CHITIETGIAMGIA`
--
ALTER TABLE `CHITIETGIAMGIA`
  ADD CONSTRAINT `FK_MASP` FOREIGN KEY (`MASANPHAM`) REFERENCES `SANPHAM` (`MASANPHAM`),
  ADD CONSTRAINT `FK_MGG` FOREIGN KEY (`MAGIAMGIA`) REFERENCES `CHUONGTRINHGIAMGIA` (`MAGIAMGIA`);

--
-- Constraints for table `CHITIETHOADON`
--
ALTER TABLE `CHITIETHOADON`
  ADD CONSTRAINT `FK_MAHOADON` FOREIGN KEY (`MAHOADON`) REFERENCES `HOADON` (`MAHOADON`),
  ADD CONSTRAINT `FK_MASPHD` FOREIGN KEY (`MASANPHAM`) REFERENCES `SANPHAM` (`MASANPHAM`);

--
-- Constraints for table `CHITIETPHIEUNHAP`
--
ALTER TABLE `CHITIETPHIEUNHAP`
  ADD CONSTRAINT `FK_MAPN` FOREIGN KEY (`MAPHIEUNHAP`) REFERENCES `PHIEUNHAP` (`MAPHIEUNHAP`),
  ADD CONSTRAINT `FK_MASPPN` FOREIGN KEY (`MASANPHAM`) REFERENCES `SANPHAM` (`MASANPHAM`);

--
-- Constraints for table `HOADON`
--
ALTER TABLE `HOADON`
  ADD CONSTRAINT `FK_MAGG` FOREIGN KEY (`MAGIAMGIA`) REFERENCES `CHUONGTRINHGIAMGIA` (`MAGIAMGIA`),
  ADD CONSTRAINT `FK_MAKH` FOREIGN KEY (`MAKHACHHANG`) REFERENCES `KHACHHANG` (`MAKH`),
  ADD CONSTRAINT `FK_MANVHD` FOREIGN KEY (`MANHANVIEN`) REFERENCES `NHANVIEN` (`MANHANVIEN`);

--
-- Constraints for table `PHIEUNHAP`
--
ALTER TABLE `PHIEUNHAP`
  ADD CONSTRAINT `FK_MANCC` FOREIGN KEY (`MANCC`) REFERENCES `NHACUNGCAP` (`MANCC`),
  ADD CONSTRAINT `FK_MANV` FOREIGN KEY (`MANHANVIEN`) REFERENCES `NHANVIEN` (`MANHANVIEN`);

--
-- Constraints for table `SANPHAM`
--
ALTER TABLE `SANPHAM`
  ADD CONSTRAINT `FK_MALOAI` FOREIGN KEY (`MALOAI`) REFERENCES `LOAISANPHAM` (`MALOAI`),
  ADD CONSTRAINT `FK_MANSX` FOREIGN KEY (`MANSX`) REFERENCES `NHASANXUAT` (`MANSX`);
