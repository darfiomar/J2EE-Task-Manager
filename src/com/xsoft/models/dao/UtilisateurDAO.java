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

public interface UtilisateurDAO {
	public Utilisateur loadUtilisateurByORMID(int numero) throws PersistentException;
	public Utilisateur getUtilisateurByORMID(int numero) throws PersistentException;
	public Utilisateur loadUtilisateurByORMID(int numero, org.hibernate.LockMode lockMode) throws PersistentException;
	public Utilisateur getUtilisateurByORMID(int numero, org.hibernate.LockMode lockMode) throws PersistentException;
	public Utilisateur loadUtilisateurByORMID(PersistentSession session, int numero) throws PersistentException;
	public Utilisateur getUtilisateurByORMID(PersistentSession session, int numero) throws PersistentException;
	public Utilisateur loadUtilisateurByORMID(PersistentSession session, int numero, org.hibernate.LockMode lockMode) throws PersistentException;
	public Utilisateur getUtilisateurByORMID(PersistentSession session, int numero, org.hibernate.LockMode lockMode) throws PersistentException;
	public Utilisateur[] listUtilisateurByQuery(String condition, String orderBy) throws PersistentException;
	public Utilisateur[] listUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryUtilisateur(String condition, String orderBy) throws PersistentException;
	public java.util.List queryUtilisateur(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryUtilisateur(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryUtilisateur(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Utilisateur loadUtilisateurByQuery(String condition, String orderBy) throws PersistentException;
	public Utilisateur loadUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Utilisateur createUtilisateur();
	public boolean save(com.xsoft.models.Utilisateur utilisateur) throws PersistentException;
	public boolean delete(com.xsoft.models.Utilisateur utilisateur) throws PersistentException;
	public boolean deleteAndDissociate(com.xsoft.models.Utilisateur utilisateur) throws PersistentException;
	public boolean deleteAndDissociate(com.xsoft.models.Utilisateur utilisateur, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(com.xsoft.models.Utilisateur utilisateur) throws PersistentException;
	public boolean evict(com.xsoft.models.Utilisateur utilisateur) throws PersistentException;
	public Utilisateur loadUtilisateurByCriteria(UtilisateurCriteria utilisateurCriteria);
	public Utilisateur[] listUtilisateurByCriteria(UtilisateurCriteria utilisateurCriteria);
}
