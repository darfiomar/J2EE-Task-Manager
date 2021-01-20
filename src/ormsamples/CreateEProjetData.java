/**
 * Licensee: nalini(University of Southern California)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateEProjetData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.xsoft.models.EProjetPersistentManager.instance().getSession().beginTransaction();
		try {
			com.xsoft.models.DAOFactory lDAOFactory = com.xsoft.models.DAOFactory.getDAOFactory();
			com.xsoft.models.dao.UtilisateurDAO lcomxsoftmodelsUtilisateurDAO = lDAOFactory.getUtilisateurDAO();
			com.xsoft.models.Utilisateur lcomxsoftmodelsUtilisateur = lcomxsoftmodelsUtilisateurDAO.createUtilisateur();
			// Initialize the properties of the persistent object here
			lcomxsoftmodelsUtilisateurDAO.save(lcomxsoftmodelsUtilisateur);
			com.xsoft.models.dao.TacheDAO lcomxsoftmodelsTacheDAO = lDAOFactory.getTacheDAO();
			com.xsoft.models.Tache lcomxsoftmodelsTache = lcomxsoftmodelsTacheDAO.createTache();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : duree
			lcomxsoftmodelsTacheDAO.save(lcomxsoftmodelsTache);
			com.xsoft.models.dao.ProjetDAO lcomxsoftmodelsProjetDAO = lDAOFactory.getProjetDAO();
			com.xsoft.models.Projet lcomxsoftmodelsProjet = lcomxsoftmodelsProjetDAO.createProjet();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : chargehoraire
			lcomxsoftmodelsProjetDAO.save(lcomxsoftmodelsProjet);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEProjetData createEProjetData = new CreateEProjetData();
			try {
				createEProjetData.createTestData();
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
