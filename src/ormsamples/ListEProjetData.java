/**
 * Licensee: nalini(University of Southern California)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListEProjetData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		com.xsoft.models.DAOFactory lDAOFactory = com.xsoft.models.DAOFactory.getDAOFactory();
		System.out.println("Listing Utilisateur...");
		com.xsoft.models.Utilisateur[] comxsoftmodelsUtilisateurs = lDAOFactory.getUtilisateurDAO().listUtilisateurByQuery(null, null);
		int length = Math.min(comxsoftmodelsUtilisateurs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comxsoftmodelsUtilisateurs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tache...");
		com.xsoft.models.Tache[] comxsoftmodelsTaches = lDAOFactory.getTacheDAO().listTacheByQuery(null, null);
		length = Math.min(comxsoftmodelsTaches.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comxsoftmodelsTaches[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Projet...");
		com.xsoft.models.Projet[] comxsoftmodelsProjets = lDAOFactory.getProjetDAO().listProjetByQuery(null, null);
		length = Math.min(comxsoftmodelsProjets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comxsoftmodelsProjets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Utilisateur by Criteria...");
		com.xsoft.models.UtilisateurCriteria lcomxsoftmodelsUtilisateurCriteria = new com.xsoft.models.UtilisateurCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomxsoftmodelsUtilisateurCriteria.numero.eq();
		lcomxsoftmodelsUtilisateurCriteria.setMaxResults(ROW_COUNT);
		com.xsoft.models.Utilisateur[] comxsoftmodelsUtilisateurs = lcomxsoftmodelsUtilisateurCriteria.listUtilisateur();
		int length =comxsoftmodelsUtilisateurs== null ? 0 : Math.min(comxsoftmodelsUtilisateurs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comxsoftmodelsUtilisateurs[i]);
		}
		System.out.println(length + " Utilisateur record(s) retrieved."); 
		
		System.out.println("Listing Tache by Criteria...");
		com.xsoft.models.TacheCriteria lcomxsoftmodelsTacheCriteria = new com.xsoft.models.TacheCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomxsoftmodelsTacheCriteria.numero.eq();
		lcomxsoftmodelsTacheCriteria.setMaxResults(ROW_COUNT);
		com.xsoft.models.Tache[] comxsoftmodelsTaches = lcomxsoftmodelsTacheCriteria.listTache();
		length =comxsoftmodelsTaches== null ? 0 : Math.min(comxsoftmodelsTaches.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comxsoftmodelsTaches[i]);
		}
		System.out.println(length + " Tache record(s) retrieved."); 
		
		System.out.println("Listing Projet by Criteria...");
		com.xsoft.models.ProjetCriteria lcomxsoftmodelsProjetCriteria = new com.xsoft.models.ProjetCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomxsoftmodelsProjetCriteria.code.eq();
		lcomxsoftmodelsProjetCriteria.setMaxResults(ROW_COUNT);
		com.xsoft.models.Projet[] comxsoftmodelsProjets = lcomxsoftmodelsProjetCriteria.listProjet();
		length =comxsoftmodelsProjets== null ? 0 : Math.min(comxsoftmodelsProjets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comxsoftmodelsProjets[i]);
		}
		System.out.println(length + " Projet record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListEProjetData listEProjetData = new ListEProjetData();
			try {
				listEProjetData.listTestData();
				//listEProjetData.listByCriteria();
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
