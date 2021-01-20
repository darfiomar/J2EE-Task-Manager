<div class="header bg-primary pb-6">
      <div class="container-fluid">
        <div class="header-body">
          <div class="row align-items-center py-4">
            <div class="col-lg-6 col-7">
              
              <nav aria-label="breadcrumb" class="d-none d-md-inline-block ml-md-4">
                <ol class="breadcrumb breadcrumb-links breadcrumb-dark">
                  <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/"><i class="fas fa-home"></i></a></li>
                  <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/">Dashboard</a></li>
                  <li class="breadcrumb-item active" aria-current="page">${sessionScope.role}</li>
                </ol>
              </nav>
            </div>
            
          </div>
          <!-- Card stats -->
          <div class="row">

            <div class="col-xl-3 col-md-6">
              <div class="card card-stats">
                <!-- Card body -->
                <div class="card-body">
                  <div class="row">
                    <div class="col">
                      <h5 class="card-title text-uppercase text-muted mb-0">Current user</h5>
                      <span class="h2 font-weight-bold mb-0">${sessionScope.nom} ${sessionScope.prenom}</span>
                    </div>
                    <div class="col-auto">
                      <div class="icon icon-shape bg-gradient-red text-white rounded-circle shadow">
                        <i class="ni ni-active-40"></i>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <c:if test="${ sessionScope.role ne 'Administrateur' }">
            <div class="col-xl-3 col-md-6">
              <div class="card card-stats">
                <!-- Card body -->
                <div class="card-body">
                  <div class="row">
                    <div class="col">
                      <h5 class="card-title text-uppercase text-muted mb-0">Taches</h5>
                      <span class="h2 font-weight-bold mb-0">
                        ${sessionScope.ntaches}
                        
                      </span>
                    </div>
                    <div class="col-auto">
                      <div class="icon icon-shape bg-gradient-orange text-white rounded-circle shadow">
                        <i class="ni ni-chart-pie-35"></i>
                      </div>
                    </div>
                  </div>
                  
                </div>
              </div>
            </div>
          </c:if>
            <c:if test="${ sessionScope.role ne 'Employe' }">
            <c:if test="${ sessionScope.role eq 'Chef de Projets' }">
            <div class="col-xl-3 col-md-6">
              <div class="card card-stats">
                <!-- Card body -->
                <div class="card-body">
                  <div class="row">
                    <div class="col">
                      <h5 class="card-title text-uppercase text-muted mb-0">Projets</h5>
                      <span class="h2 font-weight-bold mb-0">
                        ${sessionScope.nprojets}
                      </span>
                    </div>
                    <div class="col-auto">
                      <div class="icon icon-shape bg-gradient-green text-white rounded-circle shadow">
                        <i class="ni ni-money-coins"></i>
                      </div>
                    </div>
                  </div>
                  
                </div>
              </div>
            </div>
            </c:if>
            <div class="col-xl-3 col-md-6">
              <div class="card card-stats">
                <!-- Card body -->
                <div class="card-body">
                  <div class="row">
                    <div class="col">
                      <h5 class="card-title text-uppercase text-muted mb-0">Utilisateurs</h5>
                      <span class="h2 font-weight-bold mb-0">
                        ${sessionScope.nusers}
                      </span>
                    </div>
                    <div class="col-auto">
                      <div class="icon icon-shape bg-gradient-info text-white rounded-circle shadow">
                        <i class="ni ni-chart-bar-32"></i>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            
            </c:if>
          </div>
        </div>
      </div>
    </div>