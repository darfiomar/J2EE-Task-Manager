<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: nalini(University of Southern California)
License Type: Academic-->
<html>
<head><title>Utilisateur List</title>
</head>
<body>
<center>
<h1>Utilisateur List</h1>
<table border="1" width="80%">
	<tr>
		<td>Numero(PK)</td>
		<td>Nom</td>
		<td>Prenom</td>
		<td>Email</td>
		<td>Motdepasse</td>
		<td>Role</td>
		<td></td>
	</tr>
<%
com.xsoft.models.Utilisateur[] utilisateurs = com.xsoft.models.DAOFactory.getDAOFactory().getUtilisateurDAO().listUtilisateurByQuery(null, null);
for(int i = 0; i < utilisateurs.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(utilisateurs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(utilisateurs[i].getNom());
		out.println("</td>");
		out.print("<td>");
		out.print(utilisateurs[i].getPrenom());
		out.println("</td>");
		out.print("<td>");
		out.print(utilisateurs[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(utilisateurs[i].getMotdepasse());
		out.println("</td>");
		out.print("<td>");
		out.print(utilisateurs[i].getRole());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Utilisateur.jsp?action=search&numero=");
		out.print(utilisateurs[i].getORMID());
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
<a href="Utilisateur.jsp">Add Utilisateur</a>
</center>
</body>
</html>
