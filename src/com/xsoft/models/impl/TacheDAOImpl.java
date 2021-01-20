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

public class TacheDAOImpl implements com.xsoft.models.dao.TacheDAO {
	public Tache loadTacheByORMID(int numero) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadTacheByORMID(session, numero);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache getTacheByORMID(int numero) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return getTacheByORMID(session, numero);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache loadTacheByORMID(int numero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadTacheByORMID(session, numero, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache getTacheByORMID(int numero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return getTacheByORMID(session, numero, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache loadTacheByORMID(PersistentSession session, int numero) throws PersistentException {
		try {
			return (Tache) session.load(com.xsoft.models.Tache.class, new Integer(numero));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache getTacheByORMID(PersistentSession session, int numero) throws PersistentException {
		try {
			return (Tache) session.get(com.xsoft.models.Tache.class, new Integer(numero));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache loadTacheByORMID(PersistentSession session, int numero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tache) session.load(com.xsoft.models.Tache.class, new Integer(numero), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache getTacheByORMID(PersistentSession session, int numero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tache) session.get(com.xsoft.models.Tache.class, new Integer(numero), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryTache(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return queryTache(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryTache(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return queryTache(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache[] listTacheByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return listTacheByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache[] listTacheByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return listTacheByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryTache(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Tache as Tache");
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
	
	public List queryTache(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Tache as Tache");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tache", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache[] listTacheByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTache(session, condition, orderBy);
			return (Tache[]) list.toArray(new Tache[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache[] listTacheByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTache(session, condition, orderBy, lockMode);
			return (Tache[]) list.toArray(new Tache[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache loadTacheByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadTacheByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache loadTacheByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return loadTacheByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache loadTacheByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tache[] taches = listTacheByQuery(session, condition, orderBy);
		if (taches != null && taches.length > 0)
			return taches[0];
		else
			return null;
	}
	
	public Tache loadTacheByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tache[] taches = listTacheByQuery(session, condition, orderBy, lockMode);
		if (taches != null && taches.length > 0)
			return taches[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateTacheByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return iterateTacheByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateTacheByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EProjetPersistentManager.instance().getSession();
			return iterateTacheByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateTacheByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Tache as Tache");
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
	
	public java.util.Iterator iterateTacheByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.xsoft.models.Tache as Tache");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tache", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache createTache() {
		return new com.xsoft.models.Tache();
	}
	
	public boolean save(com.xsoft.models.Tache tache) throws PersistentException {
		try {
			EProjetPersistentManager.instance().saveObject(tache);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(com.xsoft.models.Tache tache) throws PersistentException {
		try {
			EProjetPersistentManager.instance().deleteObject(tache);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(com.xsoft.models.Tache tache)throws PersistentException {
		try {
			if (tache.getProject() != null) {
				tache.getProject().tasks.remove(tache);
			}
			
			if (tache.getUser() != null) {
				tache.getUser().tasks.remove(tache);
			}
			
			return delete(tache);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(com.xsoft.models.Tache tache, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tache.getProject() != null) {
				tache.getProject().tasks.remove(tache);
			}
			
			if (tache.getUser() != null) {
				tache.getUser().tasks.remove(tache);
			}
			
			try {
				session.delete(tache);
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
	
	public boolean refresh(com.xsoft.models.Tache tache) throws PersistentException {
		try {
			EProjetPersistentManager.instance().getSession().refresh(tache);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(com.xsoft.models.Tache tache) throws PersistentException {
		try {
			EProjetPersistentManager.instance().getSession().evict(tache);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Tache loadTacheByCriteria(TacheCriteria tacheCriteria) {
		Tache[] taches = listTacheByCriteria(tacheCriteria);
		if(taches == null || taches.length == 0) {
			return null;
		}
		return taches[0];
	}
	
	public Tache[] listTacheByCriteria(TacheCriteria tacheCriteria) {
		return tacheCriteria.listTache();
	}
}
