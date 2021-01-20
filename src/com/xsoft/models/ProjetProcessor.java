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
public class ProjetProcessor {
	private int code;
	
	private String intitule;
	
	private String description;
	
	private String statut;
	
	private int chargehoraire;
	
	private String action="";
	
	public void setCode(int value) {
		this.code = value;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setIntitule(String value) {
		this.intitule = value;
	}
	
	public String getIntitule() {
		return intitule == null ? "" : intitule;
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
	
	public void setChargehoraire(int value) {
		this.chargehoraire = value;
	}
	
	public int getChargehoraire() {
		return chargehoraire;
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
				com.xsoft.models.Projet _projet = com.xsoft.models.DAOFactory.getDAOFactory().getProjetDAO().loadProjetByORMID(getCode());
				if (_projet!= null) {
					copyFromBean(_projet);
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
				com.xsoft.models.Projet _projet = com.xsoft.models.DAOFactory.getDAOFactory().getProjetDAO().createProjet();
				copyToBean(_projet);
				if (com.xsoft.models.DAOFactory.getDAOFactory().getProjetDAO().save(_projet)) {
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
				com.xsoft.models.Projet _projet= com.xsoft.models.DAOFactory.getDAOFactory().getProjetDAO().loadProjetByORMID(getCode());
				if (_projet != null) {
					copyToBean(_projet);
					if (com.xsoft.models.DAOFactory.getDAOFactory().getProjetDAO().save(_projet)) {
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
				com.xsoft.models.Projet _projet = com.xsoft.models.DAOFactory.getDAOFactory().getProjetDAO().loadProjetByORMID(getCode());
				if (_projet != null && com.xsoft.models.DAOFactory.getDAOFactory().getProjetDAO().deleteAndDissociate(_projet)) {
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
	
	private void copyFromBean(com.xsoft.models.Projet _projet) {
		setIntitule(_projet.getIntitule());
		setDescription(_projet.getDescription());
		setStatut(_projet.getStatut());
		setChargehoraire(_projet.getChargehoraire());
		setCode(_projet.getORMID());
	}
	
	private void copyToBean(com.xsoft.models.Projet _projet) {
		_projet.setIntitule(getIntitule());
		_projet.setDescription(getDescription());
		_projet.setStatut(getStatut());
		_projet.setChargehoraire(getChargehoraire());
	}
	
}

