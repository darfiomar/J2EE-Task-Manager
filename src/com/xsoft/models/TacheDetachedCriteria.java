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

public class TacheDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression numero;
	public final IntegerExpression projectId;
	public final AssociationExpression project;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final StringExpression description;
	public final StringExpression statut;
	public final IntegerExpression duree;
	public final DateExpression datefin;
	public final DateExpression datedebut;
	
	public TacheDetachedCriteria() {
		super(com.xsoft.models.Tache.class, com.xsoft.models.TacheCriteria.class);
		numero = new IntegerExpression("numero", this.getDetachedCriteria());
		projectId = new IntegerExpression("project.code", this.getDetachedCriteria());
		project = new AssociationExpression("project", this.getDetachedCriteria());
		userId = new IntegerExpression("user.numero", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		statut = new StringExpression("statut", this.getDetachedCriteria());
		duree = new IntegerExpression("duree", this.getDetachedCriteria());
		datefin = new DateExpression("datefin", this.getDetachedCriteria());
		datedebut = new DateExpression("datedebut", this.getDetachedCriteria());
	}
	
	public TacheDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.xsoft.models.TacheCriteria.class);
		numero = new IntegerExpression("numero", this.getDetachedCriteria());
		projectId = new IntegerExpression("project.code", this.getDetachedCriteria());
		project = new AssociationExpression("project", this.getDetachedCriteria());
		userId = new IntegerExpression("user.numero", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		statut = new StringExpression("statut", this.getDetachedCriteria());
		duree = new IntegerExpression("duree", this.getDetachedCriteria());
		datefin = new DateExpression("datefin", this.getDetachedCriteria());
		datedebut = new DateExpression("datedebut", this.getDetachedCriteria());
	}
	
	public ProjetDetachedCriteria createProjectCriteria() {
		return new ProjetDetachedCriteria(createCriteria("project"));
	}
	
	public UtilisateurDetachedCriteria createUserCriteria() {
		return new UtilisateurDetachedCriteria(createCriteria("user"));
	}
	
	public Tache uniqueTache(PersistentSession session) {
		return (Tache) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tache[] listTache(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tache[]) list.toArray(new Tache[list.size()]);
	}
}

