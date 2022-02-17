-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 25, 2021 at 03:31 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `store`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `idProduto` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `urlImg` varchar(255) DEFAULT NULL,
  `valor` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`idProduto`, `descricao`, `nome`, `urlImg`, `valor`) VALUES
(1, 'Cor: Cinza, Capacidade: 32GB', 'Celular Motorola Moto e6s', 'resources/images/celular.jpg', 899),
(2, 'Cor: Azul', 'Caneta Azul', 'resources/images/caneta.jpg', 2),
(3, 'Cor: Branca, Multifuncional', 'Impressora HP', 'resources/images/impressora.jpg', 499),
(4, 'Gabinete gamer', 'Gabinete', 'resources/images/computador.jpg', 524);

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `id` int(11) NOT NULL,
  `amount` double DEFAULT NULL,
  `buyerCreditCard` varchar(255) DEFAULT NULL,
  `buyerFullName` varchar(255) DEFAULT NULL,
  `buyerSecurityCode` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `productId` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `login` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `adminFlag` bit(1) NOT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `fullName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`login`, `address`, `adminFlag`, `cpf`, `fullName`, `password`, `phoneNumber`) VALUES
('jonh1036@hotmail.com', 'Rua Cento e Vinte e Cinco, 20, Timbó - Maracanaú', b'0', '07470085319', 'Jonathan de Pinho Silva', '123', '(85) 9853-12872'),
('ronaldo01@gmail.com', 'Rua Cento e Vinte e Cinco', b'0', '123.123.123-23', 'Ronaldinho Gaucho', '123', '(85) 9853-12872');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`idProduto`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`login`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
