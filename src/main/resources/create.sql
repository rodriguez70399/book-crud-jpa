CREATE TABLE `book` (
  `isbn` int NOT NULL,
  `title` varchar(100) COLLATE armscii8_bin NOT NULL,
  `genre` varchar(100) COLLATE armscii8_bin DEFAULT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;