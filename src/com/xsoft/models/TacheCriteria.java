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

public class TacheCriteria extends AbstractORMCriteria {
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
	
	public TacheCriteria(Criteria criteria) {
		super(criteria);
		numero = new IntegerExpression("numero", this);
		projectId = new IntegerExpression("project.code", this);
		project = new AssociationExpression("project", this);
		userId = new IntegerExpression("user.numero", this);
		user = new AssociationExpression("user", this);
		description = new StringExpression("description", this);
		statut = new StringExpression("statut", this);
		duree = new IntegerExpression("duree", this);
		datefin = new DateExpression("datefin", this);
		datedebut = new DateExpression("datedebut", this);
	}
	
	public TacheCriteria(PersistentSession session) {
		this(session.createCriteria(Tache.class));
	}
	
	public TacheCriteria() throws PersistentException {
		this(EProjetPersistentManager.instance().getSession());
	}
	
	public ProjetCriteria createProjectCriteria() {
		return new ProjetCriteria(createCriteria("project"));
	}
	
	public UtilisateurCriteria createUserCriteria() {
		return new UtilisateurCriteria(createCriteria("user"));
	}
	
	public Tache uniqueTache() {
		return (Tache) super.uniqueResult();
	}
	
	public Tache[] listTache() {
		java.util.List list = super.list();
		return (Tache[]) list.toArray(new Tache[list.size()]);
	}
}

