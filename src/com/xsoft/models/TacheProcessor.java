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

import org.orm.PersistentException;
public class TacheProcessor {
	private int numero;
	
	private String description;
	
	private String statut;
	
	private int duree;
	
	private java.util.Date datefin;
	
	private java.util.Date datedebut;
	
	private String action="";
	
	public void setNumero(int value) {
		this.numero = value;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description == null ? "" : description;
	}
	
	public void setStatut(String value) {
		this.statut = value;
	}
	
	public String getStatut() {
		return statut == null ? "" : statut;
	}
	
	public void setDuree(int value) {
		this.duree = value;
	}
	
	public int getDuree() {
		return duree;
	}
	
	public void setDatefin(java.util.Date value) {
		this.datefin = value;
	}
	
	public java.util.Date getDatefin() {
		return datefin;
	}
	
	public void setDatedebut(java.util.Date value) {
		this.datedebut = value;
	}
	
	public java.util.Date getDatedebut() {
		return datedebut;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int user_utilisateurnumero;
	
	public void setUser_utilisateurnumero(int value) {
		this.user_utilisateurnumero = value;
	}
	
	public int getUser_utilisateurnumero() {
		return user_utilisateurnumero;
	}
	
	private int project_projetcode;
	
	public void setProject_projetcode(int value) {
		this.project_projetcode = value;
	}
	
	public int getProject_projetcode() {
		return project_projetcode;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				com.xsoft.models.Tache _tache = com.xsoft.models.DAOFactory.getDAOFactory().getTacheDAO().loadTacheByORMID(getNumero());
				if (_tache!= null) {
					copyFromBean(_tache);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				com.xsoft.models.Tache _tache = com.xsoft.models.DAOFactory.getDAOFactory().getTacheDAO().createTache();
				copyToBean(_tache);
				if (com.xsoft.models.DAOFactory.getDAOFactory().getTacheDAO().save(_tache)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				com.xsoft.models.Tache _tache= com.xsoft.models.DAOFactory.getDAOFactory().getTacheDAO().loadTacheByORMID(getNumero());
				if (_tache != null) {
					copyToBean(_tache);
					if (com.xsoft.models.DAOFactory.getDAOFactory().getTacheDAO().save(_tache)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				com.xsoft.models.Tache _tache = com.xsoft.models.DAOFactory.getDAOFactory().getTacheDAO().loadTacheByORMID(getNumero());
				if (_tache != null && com.xsoft.models.DAOFactory.getDAOFactory().getTacheDAO().deleteAndDissociate(_tache)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(com.xsoft.models.Tache _tache) {
		setDescription(_tache.getDescription());
		setStatut(_tache.getStatut());
		setDuree(_tache.getDuree());
		setDatefin(_tache.getDatefin());
		setDatedebut(_tache.getDatedebut());
		setNumero(_tache.getORMID());
		
		{
			com.xsoft.models.Utilisateur _utilisateur = _tache.getUser();
			if (_utilisateur != null) {
				setUser_utilisateurnumero(_utilisateur.getORMID());
			}
		}
		
		
		{
			com.xsoft.models.Projet _projet = _tache.getProject();
			if (_projet != null) {
				setProject_projetcode(_projet.getORMID());
			}
		}
		
	}
	
	private void copyToBean(com.xsoft.models.Tache _tache) {
		_tache.setDescription(getDescription());
		_tache.setStatut(getStatut());
		_tache.setDuree(getDuree());
		_tache.setDatefin(getDatefin());
		_tache.setDatedebut(getDatedebut());
		try  {
			com.xsoft.models.Utilisateur _user = com.xsoft.models.DAOFactory.getDAOFactory().getUtilisateurDAO().loadUtilisateurByORMID(getUser_utilisateurnumero());
			_tache.setUser(_user);
		}
		catch (PersistentException e) {
		}
		
		try  {
			com.xsoft.models.Projet _project = com.xsoft.models.DAOFactory.getDAOFactory().getProjetDAO().loadProjetByORMID(getProject_projetcode());
			_tache.setProject(_project);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

