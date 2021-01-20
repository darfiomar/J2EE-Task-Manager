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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProjetCriteria extends AbstractORMCriteria {
	public final IntegerExpression code;
	public final StringExpression intitule;
	public final StringExpression description;
	public final StringExpression statut;
	public final IntegerExpression chargehoraire;
	public final CollectionExpression tasks;
	
	public ProjetCriteria(Criteria criteria) {
		super(criteria);
		code = new IntegerExpression("code", this);
		intitule = new StringExpression("intitule", this);
		description = new StringExpression("description", this);
		statut = new StringExpression("statut", this);
		chargehoraire = new IntegerExpression("chargehoraire", this);
		tasks = new CollectionExpression("ORM_Tasks", this);
	}
	
	public ProjetCriteria(PersistentSession session) {
		this(session.createCriteria(Projet.class));
	}
	
	public ProjetCriteria() throws PersistentException {
		this(EProjetPersistentManager.instance().getSession());
	}
	
	public TacheCriteria createTasksCriteria() {
		return new TacheCriteria(createCriteria("ORM_Tasks"));
	}
	
	public Projet uniqueProjet() {
		return (Projet) super.uniqueResult();
	}
	
	public Projet[] listProjet() {
		java.util.List list = super.list();
		return (Projet[]) list.toArray(new Projet[list.size()]);
	}
}

