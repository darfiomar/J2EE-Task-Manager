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

public class Tache {
	public Tache() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TACHE_USER) {
			this.user = (com.xsoft.models.Utilisateur) owner;
		}
		
		else if (key == ORMConstants.KEY_TACHE_PROJECT) {
			this.project = (com.xsoft.models.Projet) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int numero;
	
	private com.xsoft.models.Projet project;
	
	private com.xsoft.models.Utilisateur user;
	
	private String description;
	
	private String statut;
	
	private int duree;
	
	private java.util.Date datefin;
	
	private java.util.Date datedebut;
	
	private void setNumero(int value) {
		this.numero = value;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getORMID() {
		return getNumero();
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setStatut(String value) {
		this.statut = value;
	}
	
	public String getStatut() {
		return statut;
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
	
	public void setUser(com.xsoft.models.Utilisateur value) {
		if (user != null) {
			user.tasks.remove(this);
		}
		if (value != null) {
			value.tasks.add(this);
		}
	}
	
	public com.xsoft.models.Utilisateur getUser() {
		return user;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_User(com.xsoft.models.Utilisateur value) {
		this.user = value;
	}
	
	private com.xsoft.models.Utilisateur getORM_User() {
		return user;
	}
	
	public void setProject(com.xsoft.models.Projet value) {
		if (project != null) {
			project.tasks.remove(this);
		}
		if (value != null) {
			value.tasks.add(this);
		}
	}
	
	public com.xsoft.models.Projet getProject() {
		return project;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Project(com.xsoft.models.Projet value) {
		this.project = value;
	}
	
	private com.xsoft.models.Projet getORM_Project() {
		return project;
	}
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getNumero());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("Tache[ ");
			sb.append("Numero=").append(getNumero()).append(" ");
			if (getProject() != null)
				sb.append("Project.Persist_ID=").append(getProject().toString(true)).append(" ");
			else
				sb.append("Project=null ");
			if (getUser() != null)
				sb.append("User.Persist_ID=").append(getUser().toString(true)).append(" ");
			else
				sb.append("User=null ");
			sb.append("Description=").append(getDescription()).append(" ");
			sb.append("Statut=").append(getStatut()).append(" ");
			sb.append("Duree=").append(getDuree()).append(" ");
			sb.append("Datefin=").append(getDatefin()).append(" ");
			sb.append("Datedebut=").append(getDatedebut()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
