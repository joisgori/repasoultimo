-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 20-06-2018 a las 06:12:11
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cinepolix`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movie`
--

CREATE TABLE `movie` (
  `idMovie` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `director` varchar(45) NOT NULL,
  `pais` varchar(10) NOT NULL,
  `clasificacion` varchar(5) NOT NULL,
  `anio` int(11) NOT NULL,
  `en_proyeccion` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `movie`
--

INSERT INTO `movie` (`idMovie`, `nombre`, `director`, `pais`, `clasificacion`, `anio`, `en_proyeccion`) VALUES
(1, 'Inception', 'Christopher Nolan', 'USA', 'PG-13', 2010, 1),
(2, 'Bastardos sin gloria', 'Quentin Tarantino', 'USA-GER', 'R', 2009, 1),
(3, 'Sobreviviendo Guazapa', 'Roberto Dávila', 'ESA', 'R', 2008, 1),
(4, 'Kimi no na wa', 'Makoto Shinkai', 'JAP', 'G', 2016, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`idMovie`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `movie`
--
ALTER TABLE `movie`
  MODIFY `idMovie` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
