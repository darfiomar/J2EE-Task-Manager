<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: nalini(University of Southern California)
License Type: Academic-->
<html>
<head><title>Projet List</title>
</head>
<body>
<center>
<h1>Projet List</h1>
<table border="1" width="80%">
	<tr>
		<td>Code(PK)</td>
		<td>Intitule</td>
		<td>Description</td>
		<td>Statut</td>
		<td>Chargehoraire</td>
		<td></td>
	</tr>
<%
com.xsoft.models.Projet[] projets = com.xsoft.models.DAOFactory.getDAOFactory().getProjetDAO().listProjetByQuery(null, null);
for(int i = 0; i < projets.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(projets[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(projets[i].getIntitule());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getDescription());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getStatut());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getChargehoraire());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Projet.jsp?action=search&code=");
		out.print(projets[i].getORMID());
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
<a href="Projet.jsp">Add Projet</a>
</center>
</body>
</html>
