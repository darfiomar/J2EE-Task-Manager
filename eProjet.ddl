CREATE TABLE Utilisateur (Numero int(10) NOT NULL AUTO_INCREMENT, Nom varchar(255), Prenom varchar(255), Email varchar(255) UNIQUE, Motdepasse varchar(255), Role varchar(255), PRIMARY KEY (Numero)) engine=InnoDB CHARACTER SET UTF8;
CREATE TABLE Tache (Numero int(10) NOT NULL AUTO_INCREMENT, ProjetCode int(11), UtilisateurNumero int(10), Description varchar(255), Statut varchar(255), Duree int(10) NOT NULL, Datefin date, Datedebut date, PRIMARY KEY (Numero)) engine=InnoDB CHARACTER SET UTF8;
CREATE TABLE Projet (Code int(11) NOT NULL AUTO_INCREMENT, Intitule varchar(255), Description varchar(255), Statut varchar(255), Chargehoraire int(10) NOT NULL, PRIMARY KEY (Code)) engine=InnoDB CHARACTER SET UTF8;
ALTER TABLE Tache ADD CONSTRAINT est_affecte FOREIGN KEY (UtilisateurNumero) REFERENCES Utilisateur (Numero);
ALTER TABLE Tache ADD CONSTRAINT appartient FOREIGN KEY (ProjetCode) REFERENCES Projet (Code);
