CREATE DATABASE IF NOT EXISTS `pokemon_db`;
USE `pokemon_db`;

DROP TABLE IF EXISTS `pokemon`;

CREATE TABLE `pokemon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pokedex_number` int DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `level` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `pokemon` VALUES 
	(1, 25, 'Pikachu', 'Electric', 50),
	(2, 6, 'Charizard', 'Fire/Flying', 36),
	(3, 1, 'Bulbasaur', 'Grass/Poison', 15);