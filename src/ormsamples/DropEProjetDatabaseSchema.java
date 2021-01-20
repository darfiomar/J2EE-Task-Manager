/**
 * Licensee: nalini(University of Southern California)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DropEProjetDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(com.xsoft.models.EProjetPersistentManager.instance());
				com.xsoft.models.EProjetPersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
