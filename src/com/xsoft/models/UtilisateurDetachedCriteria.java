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

public class UtilisateurDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression numero;
	public final StringExpression nom;
	public final StringExpression prenom;
	public final StringExpression email;
	public final StringExpression motdepasse;
	public final StringExpression role;
	public final CollectionExpression tasks;
	
	public UtilisateurDetachedCriteria() {
		super(com.xsoft.models.Utilisateur.class, com.xsoft.models.UtilisateurCriteria.class);
		numero = new IntegerExpression("numero", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		motdepasse = new StringExpression("motdepasse", this.getDetachedCriteria());
		role = new StringExpression("role", this.getDetachedCriteria());
		tasks = new CollectionExpression("ORM_Tasks", this.getDetachedCriteria());
	}
	
	public UtilisateurDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.xsoft.models.UtilisateurCriteria.class);
		numero = new IntegerExpression("numero", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		prenom = new StringExpression("prenom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		motdepasse = new StringExpression("motdepasse", this.getDetachedCriteria());
		role = new StringExpression("role", this.getDetachedCriteria());
		tasks = new CollectionExpression("ORM_Tasks", this.getDetachedCriteria());
	}
	
	public TacheDetachedCriteria createTasksCriteria() {
		return new TacheDetachedCriteria(createCriteria("ORM_Tasks"));
	}
	
	public Utilisateur uniqueUtilisateur(PersistentSession session) {
		return (Utilisateur) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Utilisateur[] listUtilisateur(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
	}
}

