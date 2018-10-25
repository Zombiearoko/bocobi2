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
                    <h2 class="entry-title" style="color: yellow;">Poster une offre d'emploi</h2>
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
                            <h1>Publier une nouvelle offre d'emploi</h1>
                            <hr />
                            <c:if test="${ not empty error }">
						        <div class="alert alert-error center-block">
	                               Une erreur est survenue !
	                               <span class="close"></span>
	                          	</div>
						    </c:if> 
                           <form class="booking-form" method="post" action="${pageContext.request.contextPath}/poster_une_offre"  enctype="multipart/form-data">
                             <div class="person-information">
                                 <div class="form-group row">
                                     <div class="col-sm-12 col-md-12">
                                         <label>Nom de l'emploi <span color: red;> *</span></label>
                                         <input type="text" required name="category" class="input-text full-width" value="" placeholder="" />
                                     </div>
                                 </div>
                                 <div class="form-group row">
                                     <div class="col-sm-12 col-md-12">
                                         <label>Lieux <span color: red;> *</span></label>
                                         <input type="text" required name="location" class="input-text full-width" value="" placeholder="" />
                                     </div>
                                 </div>
                                 <div class="form-group row">
                                     <div class="col-sm-12 col-md-12">
                                         <label>Type d'emploi <span color: red;> *</span></label>
                                         <div class="selector">
                                             <select required name="type" class="full-width">
                                                 <option value=""></option>
                                                 <option value="CDD">CDD</option>
                                                 <option value="CDI">CDI</option>
                                                 <option value="FREELANCE">Freelance</option>
                                                 <option value="STAGE">Stage</option>
                                             </select>
                                         </div>
                                     </div>
                                 </div>
                                 <div class="form-group row">
                                     <div class="col-sm-12 col-md-12">
                                         <label>Profil rechercher <span color: red;> *</span></label>
                                         <div class="selector">
                                             <select required name="profile" class="full-width">
                                             	<option value=""></option>
                                             	<c:forEach var="profile" items="${ profiles }">
                                                	<option value="<c:out value="${ profile['idProfilRecherche'] }" />"><c:out value="${ profile['competence'] }" /></option>
                                                 </c:forEach>
                                             </select>
                                         </div>
                                     </div>
                                 </div>
                                 <div class="form-group row">
                                     <div class="col-sm-12 col-md-12">
                                         <label>Salaire <span color: red;> *</span></label>
                                         <input type="number" required name="salary" class="input-text full-width" value="" placeholder="" />
                                     </div>
                                 </div>
                                 <div class="form-group row">
                                     <div class="col-sm-12 col-md-12">
                                         <label>Logo de l'entreprise  <span color: red;> *</span></label>
                                         <input  type="file" name="file" id="file" style="visibility:hidden; height:0" onChange="change()">
		                                <div class="input-group input-file" name="Fichier_1">
		                                    <span class="input-group-btn">
		                                        <button class="btn btn-default btn-choose" id="choose" type="button" onClick="select();">Choisir</button>
		                                    </span>
		                                    <input  type="text" required readonly class="form-control" id="input" style="cursor:pointer" onFocus="select();" />
		                                    <span class="input-group-btn">
		                                        <button class="btn btn-warning btn-reset" type="button" onClick="erase();">Effacer</button>
		                                    </span>
		                                </div>
                                     </div>
                                 </div>
                                 <div class="form-group row">
                                     <div class="col-sm-12 col-md-12">
                                         <label>Description <span color: red;> *</span></label>
									<textarea rows="10" cols="" style="width: 100%;" name="description"></textarea>
                                     </div>
                                 </div>
                                 <div class="form-group row">
                                  <div class="col-sm-12 col-md-12">
                                      <button type="submit" class="full-width btn-large">Je publie mon offre</button>
                                  </div>
                              </div>
                             </div>
                            </form>
                            <br />
                        </div>
                    </div>
                </div>
            </div>
        </section>

   <jsp:include page="../../partials/JSImport.jsp"></jsp:include>
   <script>
        function select()
        { 
            document.getElementById("file").click();
        }
        function change()
        {
            var value = document.getElementById("file").value;
            var ext = value.split('.').pop();
            if(ext != "png" && ext != "jpg")
            {
            	alert("Les types de logo valides sont jpg et png !");
            	document.getElementById("input").value = "";
            }
            else
            {
            	document.getElementById("input").value = value.split('\\').pop();
            }
        }
        function erase()
        {
            document.getElementById("input").value = "";
        }
    </script>
</body>
</html>

