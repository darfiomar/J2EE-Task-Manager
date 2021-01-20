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

public interface ProjetDAO {
	public Projet loadProjetByORMID(int code) throws PersistentException;
	public Projet getProjetByORMID(int code) throws PersistentException;
	public Projet loadProjetByORMID(int code, org.hibernate.LockMode lockMode) throws PersistentException;
	public Projet getProjetByORMID(int code, org.hibernate.LockMode lockMode) throws PersistentException;
	public Projet loadProjetByORMID(PersistentSession session, int code) throws PersistentException;
	public Projet getProjetByORMID(PersistentSession session, int code) throws PersistentException;
	public Projet loadProjetByORMID(PersistentSession session, int code, org.hibernate.LockMode lockMode) throws PersistentException;
	public Projet getProjetByORMID(PersistentSession session, int code, org.hibernate.LockMode lockMode) throws PersistentException;
	public Projet[] listProjetByQuery(String condition, String orderBy) throws PersistentException;
	public Projet[] listProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryProjet(String condition, String orderBy) throws PersistentException;
	public java.util.List queryProjet(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateProjetByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Projet[] listProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Projet[] listProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryProjet(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryProjet(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Projet loadProjetByQuery(String condition, String orderBy) throws PersistentException;
	public Projet loadProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Projet loadProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Projet loadProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Projet createProjet();
	public boolean save(com.xsoft.models.Projet projet) throws PersistentException;
	public boolean delete(com.xsoft.models.Projet projet) throws PersistentException;
	public boolean deleteAndDissociate(com.xsoft.models.Projet projet) throws PersistentException;
	public boolean deleteAndDissociate(com.xsoft.models.Projet projet, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(com.xsoft.models.Projet projet) throws PersistentException;
	public boolean evict(com.xsoft.models.Projet projet) throws PersistentException;
	public Projet loadProjetByCriteria(ProjetCriteria projetCriteria);
	public Projet[] listProjetByCriteria(ProjetCriteria projetCriteria);
}
