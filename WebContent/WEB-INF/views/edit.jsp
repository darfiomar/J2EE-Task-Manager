
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>

<body>
  <%@ include file="nav.jsp" %>
    <!-- Header -->
    <%@ include file="header.jsp" %>
    <!-- Page content -->
    <div class="container-fluid mt--6">
    	<c:if test="${ e eq 'profile'  }">
          <div class="card">
              <!-- Card header -->
              <form role="form" method="post" action="edit?s=${e}">
              <div class="card-header">
                
                <div class="row align-items-center">
                <div class="col-8">
                  <h2 class="mb-0">Modifier votre profil</h2>
                </div>
                <div class="col-4 text-right">
                  <button class="btn btn-primary" type="submit">Modifier</button>
                </div>
              </div>
              </div>
              <!-- Card body -->
              <div class="card-body">
                
                  <div class="form-row">
                    <div class="col-md-3 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault01">Nom</label>
                        <input type="text" class="form-control" id="validationDefault01" name="nom" placeholder="Nom" value="${sessionScope.nom}" required>
                      </div>
                    </div>
                    <div class="col-md-3 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault02">Prénom</label>
                        <input type="text" class="form-control" id="validationDefault02" name="prenom" placeholder="Prénom" value="${sessionScope.prenom}" required>
                      </div>
                    </div>
                    <div class="col-md-4 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefaultUsername">Email</label>
                        <div class="input-group">
                          <div class="input-group-prepend">
                            <span class="input-group-text" id="inputGroupPrepend2">@</span>
                          </div>
                          <input type="Email" class="form-control" id="validationDefaultUsername" name="email" placeholder="Email" aria-describedby="inputGroupPrepend2" value="${sessionScope.email}" required>
                        </div>
                      </div>
                    </div>
                    <div class="col-md-2 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault03">Mot de passe</label>
                        <input type="password" class="form-control" id="validationDefault03" name="password" placeholder="password" value="" required>
                      </div>
                    </div>
                  </div>
              </div>
              </form>
            </div>
        </c:if>
        <c:if test="${ e eq 'u'  }">
            <div class="card">
              <!-- Card header -->
              <form role="form" method="post" action="edit?s=${e}&id=${id}">
              <div class="card-header">
                <div class="row align-items-center">
                <div class="col-8">
                  <h2 class="mb-0">Ajouter/Modifier un Utilisateur</h2>
                </div>
                <div class="col-4 text-right">
                  <button class="btn btn-primary" type="submit">Valider</button>
                </div>
              </div>
              </div>
              <!-- Card body -->
              <div class="card-body">
                  <div class="form-row">
                    <div class="col-md-2 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault01">Nom</label>
                        <input type="text" class="form-control" id="validationDefault01" name="unom" placeholder="Nom" value="${unom}" required>
                      </div>
                    </div>
                    <div class="col-md-2 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault02">Prénom</label>
                        <input type="text" class="form-control" id="validationDefault02" name="uprenom" placeholder="Prénom" value="${uprenom}" required>
                      </div>
                    </div>
                    <div class="col-md-4 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefaultUsername">Email</label>
                        <div class="input-group">
                          <div class="input-group-prepend">
                            <span class="input-group-text" id="inputGroupPrepend2">@</span>
                          </div>
                          <input type="Email" class="form-control" id="validationDefaultUsername" placeholder="Email" aria-describedby="inputGroupPrepend2" name="uemail" value="${uemail}" required>
                        </div>
                      </div>
                    </div>
                    <div class="col-md-2 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault03">Mot de passe</label>
                        <input type="password" class="form-control" id="validationDefault03" placeholder="password" value="" name="upassword" required>
                      </div>
                    </div>
                    <div class="col-md-2 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="exampleFormControlSelect1">Role</label>
                        <select name="urole" class="form-control" id="exampleFormControlSelect1" required>
                          <option value="${urole}" disabled selected>${urole}</option>
                          <option value="Administrateur">Administrateur</option>
                          <option value="Chef de Projets">Chef de Projets</option>
                          <option value="Employe">Employe</option>
                        </select>
                      </div>
                    </div>
                  </div>
              </div>
              </form>
            </div>
           </c:if>
           <c:if test="${ e eq 'p' }">
            <div class="card">
              <!-- Card header -->
              <form role="form" method="post" action="edit?s=${e}&id=${id}">
              <div class="card-header">
                <div class="row align-items-center">
                <div class="col-8">
                  <h2 class="mb-0">Ajouter/Modifier un Projet</h2>
                </div>
                <div class="col-4 text-right">
                  <button class="btn btn-primary" type="submit">Valider</button>
                </div>
              </div>
              </div>
              <!-- Card body -->
              <div class="card-body">
                  <div class="form-row">
                    <div class="col-md-2 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault01">Intitulé</label>
                        <input type="text" class="form-control" id="validationDefault01" placeholder="Intitulé" name="intitule" value="${intitule}" required>
                      </div>
                    </div>
                    <div class="col-md-4 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault02">Description</label>
                        <input type="text" class="form-control" id="validationDefault02" placeholder="Description" name="pdescription" value="${pdescription}" required>
                      </div>
                    </div>
                    <div class="col-md-3 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="exampleFormControlSelect1">Statut</label>
                        <select class="form-control" id="exampleFormControlSelect1" name="pstatut" required>
                          <option value="${pstatut}" disabled selected>${pstatut}</option>
                          <option value="A faire">A faire</option>
                          <option value="En cours">En cours</option>
                          <option value="Realise">Realise</option>
                        </select>
                      </div>
                    </div>
                    <div class="col-md-2 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault03">Charge horaire (h)</label>
                        <input type="number" min="1" class="form-control" id="validationDefault03" name="pcharge" placeholder="Charge horaire" value="${pcharge}" required>
                      </div>
                    </div>
                  </div>
              </div>
              </form>
            </div>
		</c:if>
		<c:if test="${ e eq 't' }">
            <div class="card">
              <!-- Card header -->
              <form role="form" method="post" action="edit?s=${e}&id=${id}">
              <div class="card-header">
                <div class="row align-items-center">
                <div class="col-8">
                  <h2 class="mb-0">Ajouter/Modifier une Tache</h2>
                </div>
                <div class="col-4 text-right">
                  <button class="btn btn-primary" type="submit">Valider</button>
                </div>
              </div>
              </div>
              <!-- Card body -->
              <div class="card-body">
              	<c:if test="${ sessionScope.role eq 'Chef de Projets' }">
                  <div class="form-row">
                    <div class="col-md-5 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault01">Description</label>
                        <input type="text" class="form-control" id="validationDefault01" placeholder="Description" value="${tdescription}" name="tdescription" required>
                      </div>
                    </div>
                    <div class="col-md-1 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="validationDefault02">Durée</label>
                        <input type="number" min="1" class="form-control" id="validationDefault02" placeholder="Durée" value="${duree}" name="duree" required>
                      </div>
                    </div>
                    <div class="col-md-3 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="exampleFormControlSelect1">Employée</label>
                        <select class="form-control" id="exampleFormControlSelect1" name="temploye">
                        <option value="${temploye}" disabled selected>${temploye}</option>
                        <c:forEach items="${users}" var="user">
                          <option value="${user.email}">${user.email}</option>
                          </c:forEach>
                        </select>
                      </div>
                    </div>
                    <div class="col-md-3 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="exampleFormControlSelect2">Projet</label>
                        <select class="form-control" id="exampleFormControlSelect2" name="tprojet" value="${tprojet}" >
                          <option value="${tprojet}" disabled selected>${tprojet}</option>
                          <c:forEach items="${projets}" var="projet">
                          <option value="${projet.intitule}">${projet.intitule}</option>
                          </c:forEach>
                        </select>
                      </div>
                    </div>
                  </div>
              </c:if>
                  <div class="form-row">
                    <div class="col-md-4 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="exampleFormControlSelect3">Statut</label>
                        <select class="form-control" id="exampleFormControlSelect3" name="tstatut" required>
                          <option value="${tstatut}" disabled selected>${tstatut}</option>
                          <option value="A faire">A faire</option>
                          <option value="En cours">En cours</option>
                          <option value="Livre">Livre</option>
                        </select>
                      </div>
                    </div>
                    <div class="col-md-4 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="exampleFormControl1">Date debut</label>
                        <input class="form-control" type="date" name="datedebut" value="${datedebut}" id="exampleFormControl1">
                      </div>
                    </div>
                    <div class="col-md-4 mb-3">
                      <div class="form-group">
                        <label class="form-control-label" for="exampleFormControl2">Date fin</label>
                        <input class="form-control" type="date" name="datefin" value="${datefin}" id="exampleFormControl2">
                      </div>
                    </div>
                  </div>
              </div>
              </form>
            </div>
        </c:if>
      
      

      <!-- Footer -->
      <%@ include file="footer.jsp" %>
    </div>
  </div>
  <%@ include file="js.jsp" %>
</body>

</html>