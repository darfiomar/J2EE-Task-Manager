/**
 * Licensee: nalini(University of Southern California)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateEProjetDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(com.xsoft.models.EProjetPersistentManager.instance());
			com.xsoft.models.EProjetPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
