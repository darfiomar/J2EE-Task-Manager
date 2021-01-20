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

public class Utilisateur {
	public Utilisateur() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_UTILISATEUR_TASKS) {
			return ORM_tasks;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int numero;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String motdepasse;
	
	private String role;
	
	private java.util.Set ORM_tasks = new java.util.HashSet();
	
	private void setNumero(int value) {
		this.numero = value;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getORMID() {
		return getNumero();
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setPrenom(String value) {
		this.prenom = value;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setMotdepasse(String value) {
		this.motdepasse = value;
	}
	
	public String getMotdepasse() {
		return motdepasse;
	}
	
	public void setRole(String value) {
		this.role = value;
	}
	
	public String getRole() {
		return role;
	}
	
	private void setORM_Tasks(java.util.Set value) {
		this.ORM_tasks = value;
	}
	
	private java.util.Set getORM_Tasks() {
		return ORM_tasks;
	}
	
	public final com.xsoft.models.TacheSetCollection tasks = new com.xsoft.models.TacheSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILISATEUR_TASKS, ORMConstants.KEY_TACHE_USER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getNumero());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("Utilisateur[ ");
			sb.append("Numero=").append(getNumero()).append(" ");
			sb.append("Nom=").append(getNom()).append(" ");
			sb.append("Prenom=").append(getPrenom()).append(" ");
			sb.append("Email=").append(getEmail()).append(" ");
			sb.append("Motdepasse=").append(getMotdepasse()).append(" ");
			sb.append("Role=").append(getRole()).append(" ");
			sb.append("Tasks.size=").append(tasks.size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
