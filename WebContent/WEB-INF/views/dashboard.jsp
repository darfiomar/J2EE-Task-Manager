
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>

<body>
  <%@ include file="nav.jsp" %>
    <!-- Header -->
    <%@ include file="header.jsp" %>
    <!-- Page content -->
    <div class="container-fluid mt--6">
      <c:if test="${ sessionScope.role eq 'Administrateur'  }">
        
      <div class="card">
        <!-- Card header -->
        <div class="card-header border-0">
          <div class="row">
            <div class="col-6">
              <h3 class="mb-0">Utilisateurs</h3>
            </div>
            <div class="col-6 text-right">
              <a href="edit?e=u" class="btn btn-sm btn-primary btn-round btn-icon" data-toggle="tooltip" data-original-title="Ajouter un utilisateur">
                <span class="btn-inner--icon"><i class="fas fa-user-edit"></i></span>
                <span class="btn-inner--text">Ajouter</span>
              </a>
            </div>
          </div>
        </div>
        <!-- Light table -->
        <div class="table-responsive">
          <table class="table align-items-center table-flush table-striped">
            <thead class="thead-light">
              <tr>
                <th>ID</th>
                <th>Nom</th>
                <th>Prenom</th>
                <th>Email</th>
                <th>Role</th>
                <th></th>
              </tr>
            </thead>
            <tbody>
            	<c:forEach items="${users}" var="user">
              <tr>
                <td class="table-user">
                  <b>${user.numero}</b>
                </td>
                <td class="table-user">
                  <b>${user.nom}</b>
                </td>
                <td class="table-user">
                  <b>${user.prenom}</b>
                </td>
                <td class="table-user">
                  <b>${user.email}</b>
                </td>
                <td class="table-user">
                  <b>${user.role}</b>
                </td>
                <td class="table-actions">
                  <a href="edit?e=u&id=${user.numero}" class="table-action" data-toggle="tooltip" data-original-title="Editer">
                    <i class="fas fa-user-edit"></i>
                  </a>
                  <a href="delete?d=u&id=${user.numero}" class="table-action table-action-delete" data-toggle="tooltip" data-original-title=
                  "Supprimer">
                    <i class="fas fa-trash"></i>
                  </a>
                </td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
      </c:if>
      <c:if test="${ sessionScope.role eq 'Chef de Projets'}">
      <c:if test="${empty intitule}">
      <div class="card">
        <!-- Card header -->
        <div class="card-header border-0">
          <div class="row">
            <div class="col-6">
              <h3 class="mb-0">Projets</h3>
            </div>
            <div class="col-6 text-right">
              <a href="edit?e=p" class="btn btn-sm btn-primary btn-round btn-icon" data-toggle="tooltip" data-original-title="Ajouter un projet">
                <span class="btn-inner--icon"><i class="fas fa-user-edit"></i></span>
                <span class="btn-inner--text">Ajouter</span>
              </a>
            </div>
          </div>
        </div>
        <!-- Light table -->
        <div class="table-responsive">
          <table class="table align-items-center table-flush table-striped">
            <thead class="thead-light">
              <tr>
                <th>Code</th>
                <th>Intitulé</th>
                <th>Description</th>
                <th>Statut</th>
                <th>Charge</th>
                <th></th>
              </tr>
            </thead>
            <tbody>
              <c:forEach items="${projets}" var="projet">
              <tr>
                <td class="table-user">
                  <b>${projet.code}</b>
                </td>
                <td class="table-user">
                  <a href="${pageContext.request.contextPath}/dashboard?p=${projet.code}" target="_blank" class="font-weight-bold"><b>${projet.intitule}</b></a>
                </td>
                <td class="table-user">
                  <b>${projet.description}</b>
                </td>
                <td class="table-user">
                  <b>${projet.statut}</b>
                </td>
                <td class="table-user">
                  <b>${projet.chargehoraire}</b>
                </td>
                <td class="table-actions">
                  <a href="edit?e=p&id=${projet.code}" class="table-action" data-toggle="tooltip" data-original-title="Editer">
                    <i class="fas fa-user-edit"></i>
                  </a>
                  <a href="delete?d=p&id=${projet.code}" class="table-action table-action-delete" data-toggle="tooltip" data-original-title=
                  "Supprimer">
                    <i class="fas fa-trash"></i>
                  </a>
                </td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
      </c:if>
      </c:if>
      <c:if test="${ sessionScope.role ne 'Administrateur' }">
      <div class="card">
        <!-- Card header -->
        <div class="card-header border-0">
          <div class="row">
            <div class="col-6">
              <h3 class="mb-0">Taches ${intitule}</h3>
            </div>
            <c:if test="${ sessionScope.role eq 'Chef de Projets' }">
            <div class="col-6 text-right">
              <a href="edit?e=t" class="btn btn-sm btn-primary btn-round btn-icon" data-toggle="tooltip" data-original-title="Ajouter une tache">
                <span class="btn-inner--icon"><i class="fas fa-user-edit"></i></span>
                <span class="btn-inner--text">Ajouter</span>
              </a>
            </div>
            </c:if>
          </div>
        </div>
        <!-- Light table -->
        <div class="table-responsive">
          <table class="table align-items-center table-flush table-striped">
            <thead class="thead-light">
              <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Durée</th>
                <th>Statut</th>
                <th>Date Debut</th>
                <th>Date Fin</th>
                <th></th>
              </tr>
            </thead>
            <tbody>
             <c:forEach items="${taches}" var="tache">
              <tr>
                <td class="table-user">
                  <b>${tache.numero}</b>
                </td>
                <td class="table-user">
                  <b>${tache.description}</b>
                </td>
                <td class="table-user">
                  <b>${tache.duree}</b>
                </td>
                <td class="table-user">
                  <b>${tache.statut}</b>
                </td>
                <td class="table-user">
                  <b>${tache.datedebut}</b>
                </td>
                <td class="table-user">
                  <b>${tache.datefin}</b>
                </td>
                <td class="table-actions">
                  <a href="edit?e=t&id=${tache.numero}" class="table-action" data-toggle="tooltip" data-original-title="Editer">
                    <i class="fas fa-user-edit"></i>
                  </a>
                  <c:if test="${ sessionScope.role eq 'Chef de Projets' }">
                  <a href="delete?d=t&id=${tache.numero}" class="table-action table-action-delete" data-toggle="tooltip" data-original-title=
                  "Supprimer">
                    <i class="fas fa-trash"></i>
                  </a>
              	  </c:if>
                </td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
      </c:if>

      
      

      <!-- Footer -->
      <%@ include file="footer.jsp" %>
    </div>
  </div>
 <%@ include file="js.jsp" %>
</body>

</html>