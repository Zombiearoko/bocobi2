 		<jsp:include page="../../partials/header.jsp"></jsp:include>
 			<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	        <div class="page-title-container style6" style="background-color: #337ab7;">
            <div class="container">
                <div class="page-title">
                    <h2 class="entry-title" style="color: yellow;">Liste des offres trouvées</h2>
                </div>
                <ul class="breadcrumbs"><!-- 
                    <li><a href="#">Toutes categories</a></li>
                    <li><a href="#">Tout types</a></li>
                    <li><a href="#">Partout</a></li> -->
                </ul>
                <div class="col-md-3 search-box hidden-xs">
                    <form>
                        <div class="with-icon full-width">
                            <input type="text" class="input-text full-width" placeholder="Recherchez une offre avec un mot clé">
                            <button type="submit" class="icon"><i class="soap-icon-search"></i></button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

		</header>
        <section id="content">
            <div class="container">
                <div id="main">
                    <div class="row">
                        <div class="col-sm-4 col-md-3">
                            <h4 class="search-results-title"><i class="soap-icon-search"></i><b><c:out value="${ listeOffres.size() }" /></b> resultats trouvés.</h4>
                            <div class="toggle-container filters-container">

                                <div class="panel style1 arrow-right">
                                    <h4 class="panel-title">
                                        <a aria-expanded="true">Catégorie</a>
                                    </h4>
                                    <div id="language-filter" class="panel-collapse collapse-in">
                                        <div class="panel-content">
                                            <form method="get" action="${pageContext.request.contextPath}/poster_une_offre">
                                                <div class="form-group">
                                                    <input type="text" required class="input-text full-width" />
                                                </div>
                                                <button type="submit" class="btn-medium uppercase full-width">Search</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="panel style1 arrow-right">
                                    <h4 class="panel-title">
                                        <a aria-expanded="true">Type</a>
                                    </h4>
                                    <div id="amenities-filter" class="panel-collapse collapse-in">
                                        <div class="panel-content">
                                            <ul class="check-square filters-option">
                                                <li><a href="#">CDD</a></li>
                                                <li><a href="#">CDI</a></li>
                                                <li><a href="#">Freelance</a></li>
                                                <li><a href="#">Stage</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="panel style1 arrow-right">
                                    <h4 class="panel-title">
                                        <a aria-expanded="true">Localisation</a>
                                    </h4>
                                    <div id="language-filter" class="panel-collapse collapse-in">
                                        <div class="panel-content">
                                            <form method="post">
                                                <div class="form-group">
                                                    <input type="text" class="input-text full-width" placeholder="" />
                                                </div>
                                                <button class="btn-medium uppercase full-width">Search</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-8 col-md-9">
                            <div class="hotel-list listing-style3 hotel" style="margin-top: 0px;">
	                              <c:forEach var="offre" items="${ listeOffres }">  
	                                <article class="box">
	                                    <figure class="col-sm-5 col-md-4">
	                                        <a title="" class="hover-effect"><img width="170" height="100" alt="" src="<c:out value="${ pageContext.request.contextPath}/resources/images/logoOffre/${ offre['logoEntreprise']}" />"></a>
	                                    </figure>
	                                    <div class="details col-sm-7 col-md-8">
	                                        <div>
	                                            <div>
	                                                <h4 class="box-title"><c:out value="${ offre['nomEmploi'] }" /><small><i class="soap-icon-departure yellow-color"></i> <c:out value="${ offre['lieuxEmploi'] }" /></small></h4>
	                                            </div>
	                                            <div>
	                                                <h4><small><i class="soap-icon-bag yellow-color"></i> <c:out value="${ offre['offreurEmploi']['raisonSociale'] }" /></small></h4>
	                                            </div>
	                                        </div>
	                                        <div>
	                                            <p><c:out value="${ offre['descriptionEmploi'] }"/></p>
	                                            <div>
	                                                <a class="button btn-small full-width text-center" title="" href="${pageContext.request.contextPath}/details_offre?id=<c:out value="${ offre['idOffreEmploi'] }" />">Consulter</a>
	                                            </div>
	                                        </div>
	                                    </div>
	                                </article>
                              	</c:forEach>
                              	<c:if test="${ listeOffres.size() eq 0 }">
                              		<h1>Aucune offre d'emploi disponible !</h1>
                              	</c:if>
                            </div>
                            <c:if test="${ listeOffres.size() gt 0 }">
                            	<a href="#" class="uppercase full-width button btn-large">load more listing</a>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </section>


   <jsp:include page="../../partials/JSImport.jsp"></jsp:include>

</body>
</html>

