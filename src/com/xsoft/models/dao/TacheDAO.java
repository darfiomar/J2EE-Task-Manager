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
package com.xsoft.models.dao;

import org.orm.*;
import org.hibernate.LockMode;
import com.xsoft.models.*;

public interface TacheDAO {
	public Tache loadTacheByORMID(int numero) throws PersistentException;
	public Tache getTacheByORMID(int numero) throws PersistentException;
	public Tache loadTacheByORMID(int numero, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tache getTacheByORMID(int numero, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tache loadTacheByORMID(PersistentSession session, int numero) throws PersistentException;
	public Tache getTacheByORMID(PersistentSession session, int numero) throws PersistentException;
	public Tache loadTacheByORMID(PersistentSession session, int numero, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tache getTacheByORMID(PersistentSession session, int numero, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tache[] listTacheByQuery(String condition, String orderBy) throws PersistentException;
	public Tache[] listTacheByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryTache(String condition, String orderBy) throws PersistentException;
	public java.util.List queryTache(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateTacheByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateTacheByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tache[] listTacheByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tache[] listTacheByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryTache(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryTache(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateTacheByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateTacheByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tache loadTacheByQuery(String condition, String orderBy) throws PersistentException;
	public Tache loadTacheByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tache loadTacheByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Tache loadTacheByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Tache createTache();
	public boolean save(com.xsoft.models.Tache tache) throws PersistentException;
	public boolean delete(com.xsoft.models.Tache tache) throws PersistentException;
	public boolean deleteAndDissociate(com.xsoft.models.Tache tache) throws PersistentException;
	public boolean deleteAndDissociate(com.xsoft.models.Tache tache, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(com.xsoft.models.Tache tache) throws PersistentException;
	public boolean evict(com.xsoft.models.Tache tache) throws PersistentException;
	public Tache loadTacheByCriteria(TacheCriteria tacheCriteria);
	public Tache[] listTacheByCriteria(TacheCriteria tacheCriteria);
}
