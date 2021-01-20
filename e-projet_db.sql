-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  sam. 28 déc. 2019 à 17:12
-- Version du serveur :  5.7.21
-- Version de PHP :  7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `e-projet_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `projet`
--

DROP TABLE IF EXISTS `projet`;
CREATE TABLE IF NOT EXISTS `projet` (
  `Code` int(11) NOT NULL AUTO_INCREMENT,
  `Intitule` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Statut` varchar(255) DEFAULT NULL,
  `Chargehoraire` int(10) NOT NULL,
  PRIMARY KEY (`Code`)
) ENGINE=InnoDB AUTO_INCREMENT=1008 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `projet`
--

INSERT INTO `projet` (`Code`, `Intitule`, `Description`, `Statut`, `Chargehoraire`) VALUES
(1001, 'MarineFord', 'Save ace and run away', 'A faire', 50),
(1002, 'Falcon8', 'Make reusable rockets', 'En cours', 365),
(1003, 'Nour', 'Energy project', 'Realise', 730),
(1004, 'Cite Universitaire', 'ENSA project', 'A faire', 730),
(1005, 'E-Projet', 'Application de gestion de projets', 'Realise', 72),
(1007, 'ToDelete', 'todelete', 'En cours', 1);

-- --------------------------------------------------------

--
-- Structure de la table `tache`
--

DROP TABLE IF EXISTS `tache`;
CREATE TABLE IF NOT EXISTS `tache` (
  `Numero` int(10) NOT NULL AUTO_INCREMENT,
  `ProjetCode` int(11) DEFAULT NULL,
  `UtilisateurNumero` int(10) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Statut` varchar(255) DEFAULT NULL,
  `Duree` int(10) NOT NULL,
  `Datefin` date DEFAULT NULL,
  `Datedebut` date DEFAULT NULL,
  PRIMARY KEY (`Numero`),
  KEY `est_affecte` (`UtilisateurNumero`),
  KEY `appartient` (`ProjetCode`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `tache`
--

INSERT INTO `tache` (`Numero`, `ProjetCode`, `UtilisateurNumero`, `Description`, `Statut`, `Duree`, `Datefin`, `Datedebut`) VALUES
(1, 1001, 3, 'Prepare the weapons', 'A faire', 3, '2019-12-27', '2019-12-30'),
(2, 1002, 3, 'Test the rocket prototype', 'En cours', 2, '2019-01-26', '2019-01-29'),
(3, 1003, 5, 'Make a cup of coffee', 'Livre', 1, '2019-01-27', '2019-01-27'),
(4, 1001, 4, 'Crepe poulet', 'En cours', 1, '2019-01-28', '2019-01-28'),
(5, 1005, 3, 'Dev J2EE', 'Livre', 72, '2019-01-27', '2019-01-26'),
(7, 1007, 7, 'To delete', 'En cours', 1, '2019-01-31', '2019-01-28');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `Numero` int(10) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(255) DEFAULT NULL,
  `Prenom` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Motdepasse` varchar(255) DEFAULT NULL,
  `Role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Numero`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`Numero`, `Nom`, `Prenom`, `Email`, `Motdepasse`, `Role`) VALUES
(1, 'D.arfi', 'Omar', 'darfi.omar@gmail.com', '123', 'Administrateur'),
(2, 'Ed.', 'Newgate', 'chefprojets@gmail.com', '123', 'Chef de Projets'),
(3, 'Baggy', 'Clown', 'employe@gmail.com', '123', 'Employe'),
(4, 'New', 'User', 'newuser@gmail.com', '123', 'Employe'),
(5, 'New2', 'User2', 'new.user@gmail.com', '123', 'Employe'),
(7, 'To', 'Delete', 'todelete@gmail.com', '123', 'Employe');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `tache`
--
ALTER TABLE `tache`
  ADD CONSTRAINT `appartient` FOREIGN KEY (`ProjetCode`) REFERENCES `projet` (`Code`),
  ADD CONSTRAINT `est_affecte` FOREIGN KEY (`UtilisateurNumero`) REFERENCES `utilisateur` (`Numero`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
