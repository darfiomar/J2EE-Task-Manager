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

public class Projet {
	public Projet() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROJET_TASKS) {
			return ORM_tasks;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int code;
	
	private String intitule;
	
	private String description;
	
	private String statut;
	
	private int chargehoraire;
	
	private java.util.Set ORM_tasks = new java.util.HashSet();
	
	private void setCode(int value) {
		this.code = value;
	}
	
	public int getCode() {
		return code;
	}
	
	public int getORMID() {
		return getCode();
	}
	
	public void setIntitule(String value) {
		this.intitule = value;
	}
	
	public String getIntitule() {
		return intitule;
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
	
	public void setChargehoraire(int value) {
		this.chargehoraire = value;
	}
	
	public int getChargehoraire() {
		return chargehoraire;
	}
	
	private void setORM_Tasks(java.util.Set value) {
		this.ORM_tasks = value;
	}
	
	public java.util.Set getORM_Tasks() {
		return ORM_tasks;
	}
	
	public final com.xsoft.models.TacheSetCollection tasks = new com.xsoft.models.TacheSetCollection(this, _ormAdapter, ORMConstants.KEY_PROJET_TASKS, ORMConstants.KEY_TACHE_PROJECT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getCode());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("Projet[ ");
			sb.append("Code=").append(getCode()).append(" ");
			sb.append("Intitule=").append(getIntitule()).append(" ");
			sb.append("Description=").append(getDescription()).append(" ");
			sb.append("Statut=").append(getStatut()).append(" ");
			sb.append("Chargehoraire=").append(getChargehoraire()).append(" ");
			sb.append("Tasks.size=").append(tasks.size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
