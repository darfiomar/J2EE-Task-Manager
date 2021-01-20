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
package ormsamples;

import org.orm.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SampleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			if (action.equals("create")) {
				ORMDatabaseInitiator.createSchema(com.xsoft.models.EProjetPersistentManager.instance());
			}
			else if (action.equals("drop")) {
				ORMDatabaseInitiator.dropSchema(com.xsoft.models.EProjetPersistentManager.instance());
			}
			else {
				if (action.equals("insert")) {
					CreateEProjetData createEProjetData = new CreateEProjetData();
					createEProjetData.createTestData();
				}
				else if (action.equals("update")) {
					RetrieveAndUpdateEProjetData retrieveAndUpdateEProjetData = new RetrieveAndUpdateEProjetData();
					retrieveAndUpdateEProjetData.retrieveAndUpdateTestData();
				}
				else if (action.equals("delete")) {
					DeleteEProjetData deleteEProjetData = new DeleteEProjetData();
					deleteEProjetData.deleteTestData();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//***** To ensure persistent session is closed after every request, either add the following lines to "Web.xml" (recommended):
		//
		//<filter>
		//  <filter-name>ORMFilter</filter-name>
		//	<filter-class>ormsamples.EProjetFilter</filter-class>
		//</filter>
		//
		//<filter-mapping>
		//	<filter-name>ORMFilter</filter-name>
		//	<url-pattern>/*</url-pattern>
		//</filter-mapping>
		//
		//***** or add the following statement at the end of each servlet that used ORM:
		//
		//com.xsoft.models.EProjetPersistentManager.instance().getSession().close();", true);
		
		PrintWriter lWriter = response.getWriter();
		lWriter.println("Sample Servlet. Action = " + action);
		lWriter.close();
	}
}
