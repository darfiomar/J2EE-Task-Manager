/**
 * Licensee: nalini(University of Southern California)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteEProjetData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.xsoft.models.EProjetPersistentManager.instance().getSession().beginTransaction();
		try {
			com.xsoft.models.DAOFactory lDAOFactory = com.xsoft.models.DAOFactory.getDAOFactory();
			com.xsoft.models.dao.UtilisateurDAO lcomxsoftmodelsUtilisateurDAO = lDAOFactory.getUtilisateurDAO();
			com.xsoft.models.Utilisateur lcomxsoftmodelsUtilisateur = lcomxsoftmodelsUtilisateurDAO.loadUtilisateurByQuery(null, null);
			// Delete the persistent object
			lcomxsoftmodelsUtilisateurDAO.delete(lcomxsoftmodelsUtilisateur);
			com.xsoft.models.dao.TacheDAO lcomxsoftmodelsTacheDAO = lDAOFactory.getTacheDAO();
			com.xsoft.models.Tache lcomxsoftmodelsTache = lcomxsoftmodelsTacheDAO.loadTacheByQuery(null, null);
			// Delete the persistent object
			lcomxsoftmodelsTacheDAO.delete(lcomxsoftmodelsTache);
			com.xsoft.models.dao.ProjetDAO lcomxsoftmodelsProjetDAO = lDAOFactory.getProjetDAO();
			com.xsoft.models.Projet lcomxsoftmodelsProjet = lcomxsoftmodelsProjetDAO.loadProjetByQuery(null, null);
			// Delete the persistent object
			lcomxsoftmodelsProjetDAO.delete(lcomxsoftmodelsProjet);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEProjetData deleteEProjetData = new DeleteEProjetData();
			try {
				deleteEProjetData.deleteTestData();
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
