 		<jsp:include page="../../partials/header.jsp"></jsp:include>
 		 	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 		 	<c:if test="${ empty login or login == null  }">
	 		 	<% 
	            	request.getServletContext().setAttribute("loggedFirst", 1);
	            %>
 		 		<c:redirect url="connection"/>
 		 	</c:if>
	        <div class="page-title-container style6" style="background-color: #337ab7;">
            <div class="container">
                <div class="page-title">
                    <h2 class="entry-title" style="color: yellow;">Consultez la CV thèque</h2>
                </div>
                <ul class="breadcrumbs"><!-- 
                    <li><a href="#">Toutes categories</a></li>
                    <li><a href="#">Tout types</a></li>
                    <li><a href="#">Partout</a></li> -->
                </ul>
            </div>
        </div>
        </header>
        <section id="content" class="gray-area">
            <div class="container">
                <div class="row">
                    <div id="main" class="col-sm-10 col-md-10 col-md-offset-1 col-sm-offset-1">
                        <div class="booking-information travelo-box">
                            <h1>Recherche d'un CV dans la CV thèque</h1>
                            <hr />
                            <div class="table-responsive">
	                            <table id="example" class="table table-striped table-bordered dataTable" style="width: 100%;" role="grid" aria-describedby="example_info">
									<thead>
										<tr role="row">
										<th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Name: activate to sort column descending" style="width: 128px;">Numero de CV</th>
										<th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 208px;">Formation</th>
										<th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 94px;">Competence</th>
										<th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 40px;">Experience</th>
										<th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 85px;">Date</th>
										<th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 72px;">Consulter</th></tr>
									</thead>
									<tbody>
										<c:if test="${ CVs.size() gt 0 }">
											<c:forEach var="CV" items="${ CVs }">
												<tr role="row" class="odd">
													<td><c:out value="${ CV['formation'] }" /></td>
													<td class="sorting_1"><c:out value="${ CV['competences'] }" /></td>
													<td><c:out value="${ CV['experienceProfessionel'] }" /></td>
													<td><c:out value="${ CV['dateSoumission'] }" /></td>
													<td>                                                
													<button class="btn-medium uppercase full-width">Consulter</button>
													</td>
												</tr>
											</c:forEach>
										</c:if>
										<c:if test="${ CVs.size() le 0 }">
											<tr>
												<td colspan="6">
													Aucun CV n'est disponible dans la CVthèque.
												</td>
											</tr>
										</c:if>
									</tbody>
								</table>
							</div>
                            <br />
                        </div>
                    </div>
                </div>
            </div>
        </section>

   <jsp:include page="../../partials/JSImport.jsp"></jsp:include>
   
</body>
</html>

