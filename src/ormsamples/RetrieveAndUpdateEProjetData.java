/**
 * Licensee: nalini(University of Southern California)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateEProjetData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.xsoft.models.EProjetPersistentManager.instance().getSession().beginTransaction();
		try {
			com.xsoft.models.DAOFactory lDAOFactory = com.xsoft.models.DAOFactory.getDAOFactory();
			com.xsoft.models.dao.UtilisateurDAO lcomxsoftmodelsUtilisateurDAO = lDAOFactory.getUtilisateurDAO();
			com.xsoft.models.Utilisateur lcomxsoftmodelsUtilisateur = lcomxsoftmodelsUtilisateurDAO.loadUtilisateurByQuery(null, null);
			// Update the properties of the persistent object
			lcomxsoftmodelsUtilisateurDAO.save(lcomxsoftmodelsUtilisateur);
			com.xsoft.models.dao.TacheDAO lcomxsoftmodelsTacheDAO = lDAOFactory.getTacheDAO();
			com.xsoft.models.Tache lcomxsoftmodelsTache = lcomxsoftmodelsTacheDAO.loadTacheByQuery(null, null);
			// Update the properties of the persistent object
			lcomxsoftmodelsTacheDAO.save(lcomxsoftmodelsTache);
			com.xsoft.models.dao.ProjetDAO lcomxsoftmodelsProjetDAO = lDAOFactory.getProjetDAO();
			com.xsoft.models.Projet lcomxsoftmodelsProjet = lcomxsoftmodelsProjetDAO.loadProjetByQuery(null, null);
			// Update the properties of the persistent object
			lcomxsoftmodelsProjetDAO.save(lcomxsoftmodelsProjet);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Utilisateur by UtilisateurCriteria");
		com.xsoft.models.UtilisateurCriteria lcomxsoftmodelsUtilisateurCriteria = new com.xsoft.models.UtilisateurCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomxsoftmodelsUtilisateurCriteria.numero.eq();
		System.out.println(lcomxsoftmodelsUtilisateurCriteria.uniqueUtilisateur());
		
		System.out.println("Retrieving Tache by TacheCriteria");
		com.xsoft.models.TacheCriteria lcomxsoftmodelsTacheCriteria = new com.xsoft.models.TacheCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomxsoftmodelsTacheCriteria.numero.eq();
		System.out.println(lcomxsoftmodelsTacheCriteria.uniqueTache());
		
		System.out.println("Retrieving Projet by ProjetCriteria");
		com.xsoft.models.ProjetCriteria lcomxsoftmodelsProjetCriteria = new com.xsoft.models.ProjetCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomxsoftmodelsProjetCriteria.code.eq();
		System.out.println(lcomxsoftmodelsProjetCriteria.uniqueProjet());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEProjetData retrieveAndUpdateEProjetData = new RetrieveAndUpdateEProjetData();
			try {
				retrieveAndUpdateEProjetData.retrieveAndUpdateTestData();
				//retrieveAndUpdateEProjetData.retrieveByCriteria();
			}
			finally {
				com.xsoft.models.EProjetPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
