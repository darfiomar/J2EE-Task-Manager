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
package com.xsoft.models.impl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;
import com.xsoft.models.*;

public class UtilisateurDAOImpl implements com.xsoft.models.dao.UtilisateurDAO {
	public Utilisateur loadUtilisateurByORMID(int numero) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadUtilisateurByORMID(session, numero);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur getUtilisateurByORMID(int numero) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return getUtilisateurByORMID(session, numero);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur loadUtilisateurByORMID(int numero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadUtilisateurByORMID(session, numero, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur getUtilisateurByORMID(int numero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return getUtilisateurByORMID(session, numero, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur loadUtilisateurByORMID(PersistentSession session, int numero) throws PersistentException {
		try {
			return (Utilisateur) session.load(com.xsoft.models.Utilisateur.class, new Integer(numero));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur getUtilisateurByORMID(PersistentSession session, int numero) throws PersistentException {
		try {
			return (Utilisateur) session.get(com.xsoft.models.Utilisateur.class, new Integer(numero));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur loadUtilisateurByORMID(PersistentSession session, int numero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilisateur) session.load(com.xsoft.models.Utilisateur.class, new Integer(numero), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur getUtilisateurByORMID(PersistentSession session, int numero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilisateur) session.get(com.xsoft.models.Utilisateur.class, new Integer(numero), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryUtilisateur(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return queryUtilisateur(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryUtilisateur(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return queryUtilisateur(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur[] listUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return listUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur[] listUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return listUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryUtilisateur(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryUtilisateur(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilisateur", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUtilisateur(session, condition, orderBy);
			return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUtilisateur(session, condition, orderBy, lockMode);
			return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur loadUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur loadUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Utilisateur[] utilisateurs = listUtilisateurByQuery(session, condition, orderBy);
		if (utilisateurs != null && utilisateurs.length > 0)
			return utilisateurs[0];
		else
			return null;
	}
	
	public Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Utilisateur[] utilisateurs = listUtilisateurByQuery(session, condition, orderBy, lockMode);
		if (utilisateurs != null && utilisateurs.length > 0)
			return utilisateurs[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return iterateUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return iterateUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilisateur", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur createUtilisateur() {
		return new com.xsoft.models.Utilisateur();
	}
	
	public boolean save(com.xsoft.models.Utilisateur utilisateur) throws PersistentException {
		try {
			EProjetPersistentManager.instance().saveObject(utilisateur);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(com.xsoft.models.Utilisateur utilisateur) throws PersistentException {
		try {
			EProjetPersistentManager.instance().deleteObject(utilisateur);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(com.xsoft.models.Utilisateur utilisateur)throws PersistentException {
		try {
			com.xsoft.models.Tache[] lTaskss = utilisateur.tasks.toArray();
			for(int i = 0; i < lTaskss.length; i++) {
				lTaskss[i].setUser(null);
			}
			return delete(utilisateur);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(com.xsoft.models.Utilisateur utilisateur, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.xsoft.models.Tache[] lTaskss = utilisateur.tasks.toArray();
			for(int i = 0; i < lTaskss.length; i++) {
				lTaskss[i].setUser(null);
			}
			try {
				session.delete(utilisateur);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(com.xsoft.models.Utilisateur utilisateur) throws PersistentException {
		try {
			EProjetPersistentManager.instance().getSession().refresh(utilisateur);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(com.xsoft.models.Utilisateur utilisateur) throws PersistentException {
		try {
			EProjetPersistentManager.instance().getSession().evict(utilisateur);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Utilisateur loadUtilisateurByCriteria(UtilisateurCriteria utilisateurCriteria) {
		Utilisateur[] utilisateurs = listUtilisateurByCriteria(utilisateurCriteria);
		if(utilisateurs == null || utilisateurs.length == 0) {
			return null;
		}
		return utilisateurs[0];
	}
	
	public Utilisateur[] listUtilisateurByCriteria(UtilisateurCriteria utilisateurCriteria) {
		return utilisateurCriteria.listUtilisateur();
	}
}
