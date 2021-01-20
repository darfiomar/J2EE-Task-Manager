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
public class UtilisateurProcessor {
	private int numero;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String motdepasse;
	
	private String role;
	
	private String action="";
	
	public void setNumero(int value) {
		this.numero = value;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom == null ? "" : nom;
	}
	
	public void setPrenom(String value) {
		this.prenom = value;
	}
	
	public String getPrenom() {
		return prenom == null ? "" : prenom;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
	}
	
	public void setMotdepasse(String value) {
		this.motdepasse = value;
	}
	
	public String getMotdepasse() {
		return motdepasse == null ? "" : motdepasse;
	}
	
	public void setRole(String value) {
		this.role = value;
	}
	
	public String getRole() {
		return role == null ? "" : role;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				com.xsoft.models.Utilisateur _utilisateur = com.xsoft.models.DAOFactory.getDAOFactory().getUtilisateurDAO().loadUtilisateurByORMID(getNumero());
				if (_utilisateur!= null) {
					copyFromBean(_utilisateur);
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
				com.xsoft.models.Utilisateur _utilisateur = com.xsoft.models.DAOFactory.getDAOFactory().getUtilisateurDAO().createUtilisateur();
				copyToBean(_utilisateur);
				if (com.xsoft.models.DAOFactory.getDAOFactory().getUtilisateurDAO().save(_utilisateur)) {
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
				com.xsoft.models.Utilisateur _utilisateur= com.xsoft.models.DAOFactory.getDAOFactory().getUtilisateurDAO().loadUtilisateurByORMID(getNumero());
				if (_utilisateur != null) {
					copyToBean(_utilisateur);
					if (com.xsoft.models.DAOFactory.getDAOFactory().getUtilisateurDAO().save(_utilisateur)) {
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
				com.xsoft.models.Utilisateur _utilisateur = com.xsoft.models.DAOFactory.getDAOFactory().getUtilisateurDAO().loadUtilisateurByORMID(getNumero());
				if (_utilisateur != null && com.xsoft.models.DAOFactory.getDAOFactory().getUtilisateurDAO().deleteAndDissociate(_utilisateur)) {
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
	
	private void copyFromBean(com.xsoft.models.Utilisateur _utilisateur) {
		setNom(_utilisateur.getNom());
		setPrenom(_utilisateur.getPrenom());
		setEmail(_utilisateur.getEmail());
		setMotdepasse(_utilisateur.getMotdepasse());
		setRole(_utilisateur.getRole());
		setNumero(_utilisateur.getORMID());
	}
	
	private void copyToBean(com.xsoft.models.Utilisateur _utilisateur) {
		_utilisateur.setNom(getNom());
		_utilisateur.setPrenom(getPrenom());
		_utilisateur.setEmail(getEmail());
		_utilisateur.setMotdepasse(getMotdepasse());
		_utilisateur.setRole(getRole());
	}
	
}

