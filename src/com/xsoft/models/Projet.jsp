<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: nalini(University of Southern California)
License Type: Academic-->
<html>
<jsp:useBean id="ProjetBean" scope="page" class="com.xsoft.models.ProjetProcessor" />
<jsp:setProperty name="ProjetBean" property="*" />
<% String result = ProjetBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ProjetList.jsp';
		return true;
	}
// -->
</script>
<head><title>Projet</title>
</head>
<body>
<h1>Projet</h1>
<form method="POST" name="form1" action=Projet.jsp>
	<table>
		<tr>
			<td>*Code : </td>
			<td><input type=text name="code" value="<jsp:getProperty name="ProjetBean" property="code"/>" /></td>
		</tr>
		<tr>
			<td>Intitule : </td>
			<td><input type=text name="intitule" value="<jsp:getProperty name="ProjetBean" property="intitule"/>" /></td>
		</tr>
		<tr>
			<td>Description : </td>
			<td><input type=text name="description" value="<jsp:getProperty name="ProjetBean" property="description"/>" /></td>
		</tr>
		<tr>
			<td>Statut : </td>
			<td><input type=text name="statut" value="<jsp:getProperty name="ProjetBean" property="statut"/>" /></td>
		</tr>
		<tr>
			<td>Chargehoraire : </td>
			<td><input type=text name="chargehoraire" value="<jsp:getProperty name="ProjetBean" property="chargehoraire"/>" /></td>
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
