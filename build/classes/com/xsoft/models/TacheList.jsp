<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: nalini(University of Southern California)
License Type: Academic-->
<html>
<head><title>Tache List</title>
</head>
<body>
<center>
<h1>Tache List</h1>
<table border="1" width="80%">
	<tr>
		<td>Numero(PK)</td>
		<td>Description</td>
		<td>Statut</td>
		<td>Duree</td>
		<td>Datefin</td>
		<td>Datedebut</td>
		<td>User(FK)</td>
		<td>Project(FK)</td>
		<td></td>
	</tr>
<%
com.xsoft.models.Tache[] taches = com.xsoft.models.DAOFactory.getDAOFactory().getTacheDAO().listTacheByQuery(null, null);
for(int i = 0; i < taches.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(taches[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(taches[i].getDescription());
		out.println("</td>");
		out.print("<td>");
		out.print(taches[i].getStatut());
		out.println("</td>");
		out.print("<td>");
		out.print(taches[i].getDuree());
		out.println("</td>");
		out.print("<td>");
		out.print(taches[i].getDatefin());
		out.println("</td>");
		out.print("<td>");
		out.print(taches[i].getDatedebut());
		out.println("</td>");
		
		com.xsoft.models.Utilisateur user = taches[i].getUser();
		if(user != null) {
			out.print("<td>");
			out.print("<a href=\"Utilisateur.jsp?action=search&numero=");
			out.print(user.getORMID());
			out.print("\">");
			out.print(user.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		com.xsoft.models.Projet project = taches[i].getProject();
		if(project != null) {
			out.print("<td>");
			out.print("<a href=\"Projet.jsp?action=search&code=");
			out.print(project.getORMID());
			out.print("\">");
			out.print(project.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Tache.jsp?action=search&numero=");
		out.print(taches[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Tache.jsp">Add Tache</a>
</center>
</body>
</html>
