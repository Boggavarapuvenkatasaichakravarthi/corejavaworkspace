-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2017 at 08:44 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: 'quiz'
--

-- --------------------------------------------------------

--
-- Table structure for table 'gk'
--

CREATE TABLE IF NOT EXISTS 'gk' (
'QId' int(11) NOT NULL,
  'QUESTION' varchar(100) NOT NULL,
  'A' varchar(50) NOT NULL,
  'B' varchar(50) NOT NULL,
  'C' varchar(50) NOT NULL,
  'D' varchar(50) NOT NULL,
  'ANSWER' varchar(5) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'gk'
--

INSERT INTO gk VALUES(1, 'What is the capital of India ?', 'Mumbai', 'Aurangabad', 'Chennai', 'Delhi', 'D');

INSERT INTO gk VALUES(2, 'What is the national bird of India ?', 'Sparrow', 'KingFisher', 'Peacock', 'Parrot', 'C');

INSERT INTO gk VALUES(3, 'What is national Animal of India', 'Dog', 'Elephant', 'Tiger', 'Lion', 'C');

INSERT INTO gk VALUES(4, 'What is the national language of India?', 'English', 'French', 'Marathi', 'Hindi', 'D');

INSERT INTO gk VALUES(5, 'The term Googly is associated with ?', 'Cricket', 'Football', 'Badminton', 'Hockey', 'A');

-- --------------------------------------------------------

--
-- Table structure for table 'login'
--

CREATE TABLE IF NOT EXISTS login (
  USERNAME varchar(20) NOT NULL,
  PASSWORD varchar(20) NOT NULL,
  PRIVILEGE varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'login'
--

INSERT INTO login VALUES
('admin', 'admin', 'admin'),
('user', 'user', 'user'),
('abc', 'abc', 'user');

-- --------------------------------------------------------

--
-- Table structure for table 'subjects'
--

CREATE TABLE IF NOT EXISTS subjects (
  id int(11) NOT NULL,
  name varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'subjects'
--

INSERT INTO subjects (id, name) VALUES
(1, 'gk');

--
-- Indexes for dumped tables
--

--
-- Indexes for table 'gk'
--
ALTER TABLE gk
 ADD PRIMARY KEY (QId);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table 'gk'
--
ALTER TABLE gk
MODIFY QId int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
