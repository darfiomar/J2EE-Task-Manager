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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProjetDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression code;
	public final StringExpression intitule;
	public final StringExpression description;
	public final StringExpression statut;
	public final IntegerExpression chargehoraire;
	public final CollectionExpression tasks;
	
	public ProjetDetachedCriteria() {
		super(com.xsoft.models.Projet.class, com.xsoft.models.ProjetCriteria.class);
		code = new IntegerExpression("code", this.getDetachedCriteria());
		intitule = new StringExpression("intitule", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		statut = new StringExpression("statut", this.getDetachedCriteria());
		chargehoraire = new IntegerExpression("chargehoraire", this.getDetachedCriteria());
		tasks = new CollectionExpression("ORM_Tasks", this.getDetachedCriteria());
	}
	
	public ProjetDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.xsoft.models.ProjetCriteria.class);
		code = new IntegerExpression("code", this.getDetachedCriteria());
		intitule = new StringExpression("intitule", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		statut = new StringExpression("statut", this.getDetachedCriteria());
		chargehoraire = new IntegerExpression("chargehoraire", this.getDetachedCriteria());
		tasks = new CollectionExpression("ORM_Tasks", this.getDetachedCriteria());
	}
	
	public TacheDetachedCriteria createTasksCriteria() {
		return new TacheDetachedCriteria(createCriteria("ORM_Tasks"));
	}
	
	public Projet uniqueProjet(PersistentSession session) {
		return (Projet) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Projet[] listProjet(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Projet[]) list.toArray(new Projet[list.size()]);
	}
}

