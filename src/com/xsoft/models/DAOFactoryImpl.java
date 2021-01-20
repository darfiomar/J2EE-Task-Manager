/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: nalini(University of Southern California)
 * License Type: Academic
 */
package com.xsoft.models;

import com.xsoft.models.impl.*;
import com.xsoft.models.dao.*;

public class DAOFactoryImpl extends DAOFactory {
	private UtilisateurDAO _utilisateurDAO = new UtilisateurDAOImpl();
	public UtilisateurDAO getUtilisateurDAO() {
		return _utilisateurDAO;
	}
	
	private TacheDAO _tacheDAO = new TacheDAOImpl();
	public TacheDAO getTacheDAO() {
		return _tacheDAO;
	}
	
	private ProjetDAO _projetDAO = new ProjetDAOImpl();
	public ProjetDAO getProjetDAO() {
		return _projetDAO;
	}
	
}

