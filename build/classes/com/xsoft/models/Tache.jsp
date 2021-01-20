<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: nalini(University of Southern California)
License Type: Academic-->
<html>
<jsp:useBean id="TacheBean" scope="page" class="com.xsoft.models.TacheProcessor" />
<jsp:setProperty name="TacheBean" property="*" />
<% String result = TacheBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'TacheList.jsp';
		return true;
	}
// -->
</script>
<head><title>Tache</title>
</head>
<body>
<h1>Tache</h1>
<form method="POST" name="form1" action=Tache.jsp>
	<table>
		<tr>
			<td>*Numero : </td>
			<td><input type=text name="numero" value="<jsp:getProperty name="TacheBean" property="numero"/>" /></td>
		</tr>
		<tr>
			<td>Description : </td>
			<td><input type=text name="description" value="<jsp:getProperty name="TacheBean" property="description"/>" /></td>
		</tr>
		<tr>
			<td>Statut : </td>
			<td><input type=text name="statut" value="<jsp:getProperty name="TacheBean" property="statut"/>" /></td>
		</tr>
		<tr>
			<td>Duree : </td>
			<td><input type=text name="duree" value="<jsp:getProperty name="TacheBean" property="duree"/>" /></td>
		</tr>
		<tr>
			<td>Datefin : </td>
			<td><input type=text name="datefin" value="<jsp:getProperty name="TacheBean" property="datefin"/>" /></td>
		</tr>
		<tr>
			<td>Datedebut : </td>
			<td><input type=text name="datedebut" value="<jsp:getProperty name="TacheBean" property="datedebut"/>" /></td>
		</tr>
		<tr>
			<td>User_utilisateurnumero : </td>
			<td><input type=text name="user_utilisateurnumero" value="<jsp:getProperty name="TacheBean" property="user_utilisateurnumero"/>" /></td>
		</tr>
		<tr>
			<td>Project_projetcode : </td>
			<td><input type=text name="project_projetcode" value="<jsp:getProperty name="TacheBean" property="project_projetcode"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
