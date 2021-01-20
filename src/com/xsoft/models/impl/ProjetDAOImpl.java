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

public class ProjetDAOImpl implements com.xsoft.models.dao.ProjetDAO {
	public Projet loadProjetByORMID(int code) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadProjetByORMID(session, code);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet getProjetByORMID(int code) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return getProjetByORMID(session, code);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet loadProjetByORMID(int code, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadProjetByORMID(session, code, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet getProjetByORMID(int code, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return getProjetByORMID(session, code, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet loadProjetByORMID(PersistentSession session, int code) throws PersistentException {
		try {
			return (Projet) session.load(com.xsoft.models.Projet.class, new Integer(code));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet getProjetByORMID(PersistentSession session, int code) throws PersistentException {
		try {
			return (Projet) session.get(com.xsoft.models.Projet.class, new Integer(code));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet loadProjetByORMID(PersistentSession session, int code, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Projet) session.load(com.xsoft.models.Projet.class, new Integer(code), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet getProjetByORMID(PersistentSession session, int code, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Projet) session.get(com.xsoft.models.Projet.class, new Integer(code), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryProjet(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return queryProjet(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryProjet(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return queryProjet(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet[] listProjetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return listProjetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet[] listProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return listProjetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryProjet(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Projet as Projet");
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
	
	public List queryProjet(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Projet as Projet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Projet", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet[] listProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProjet(session, condition, orderBy);
			return (Projet[]) list.toArray(new Projet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet[] listProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProjet(session, condition, orderBy, lockMode);
			return (Projet[]) list.toArray(new Projet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet loadProjetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadProjetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet loadProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadProjetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet loadProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Projet[] projets = listProjetByQuery(session, condition, orderBy);
		if (projets != null && projets.length > 0)
			return projets[0];
		else
			return null;
	}
	
	public Projet loadProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Projet[] projets = listProjetByQuery(session, condition, orderBy, lockMode);
		if (projets != null && projets.length > 0)
			return projets[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateProjetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return iterateProjetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return iterateProjetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Projet as Projet");
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
	
	public java.util.Iterator iterateProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Projet as Projet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Projet", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet createProjet() {
		return new com.xsoft.models.Projet();
	}
	
	public boolean save(com.xsoft.models.Projet projet) throws PersistentException {
		try {
			EProjetPersistentManager.instance().saveObject(projet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(com.xsoft.models.Projet projet) throws PersistentException {
		try {
			EProjetPersistentManager.instance().deleteObject(projet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(com.xsoft.models.Projet projet)throws PersistentException {
		try {
			com.xsoft.models.Tache[] lTaskss = projet.tasks.toArray();
			for(int i = 0; i < lTaskss.length; i++) {
				lTaskss[i].setProject(null);
			}
			return delete(projet);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(com.xsoft.models.Projet projet, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.xsoft.models.Tache[] lTaskss = projet.tasks.toArray();
			for(int i = 0; i < lTaskss.length; i++) {
				lTaskss[i].setProject(null);
			}
			try {
				session.delete(projet);
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
	
	public boolean refresh(com.xsoft.models.Projet projet) throws PersistentException {
		try {
			EProjetPersistentManager.instance().getSession().refresh(projet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(com.xsoft.models.Projet projet) throws PersistentException {
		try {
			EProjetPersistentManager.instance().getSession().evict(projet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Projet loadProjetByCriteria(ProjetCriteria projetCriteria) {
		Projet[] projets = listProjetByCriteria(projetCriteria);
		if(projets == null || projets.length == 0) {
			return null;
		}
		return projets[0];
	}
	
	public Projet[] listProjetByCriteria(ProjetCriteria projetCriteria) {
		return projetCriteria.listProjet();
	}
}
