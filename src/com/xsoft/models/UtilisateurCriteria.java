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

public class UtilisateurCriteria extends AbstractORMCriteria {
	public final IntegerExpression numero;
	public final StringExpression nom;
	public final StringExpression prenom;
	public final StringExpression email;
	public final StringExpression motdepasse;
	public final StringExpression role;
	public final CollectionExpression tasks;
	
	public UtilisateurCriteria(Criteria criteria) {
		super(criteria);
		numero = new IntegerExpression("numero", this);
		nom = new StringExpression("nom", this);
		prenom = new StringExpression("prenom", this);
		email = new StringExpression("email", this);
		motdepasse = new StringExpression("motdepasse", this);
		role = new StringExpression("role", this);
		tasks = new CollectionExpression("ORM_Tasks", this);
	}
	
	public UtilisateurCriteria(PersistentSession session) {
		this(session.createCriteria(Utilisateur.class));
	}
	
	public UtilisateurCriteria() throws PersistentException {
		this(EProjetPersistentManager.instance().getSession());
	}
	
	public TacheCriteria createTasksCriteria() {
		return new TacheCriteria(createCriteria("ORM_Tasks"));
	}
	
	public Utilisateur uniqueUtilisateur() {
		return (Utilisateur) super.uniqueResult();
	}
	
	public Utilisateur[] listUtilisateur() {
		java.util.List list = super.list();
		return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
	}
}

