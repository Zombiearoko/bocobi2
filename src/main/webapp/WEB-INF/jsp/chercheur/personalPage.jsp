
<jsp:include page="../../partials/header2.jsp"></jsp:include>
				<nav id="mobile-menu-01" class="mobile-menu collapse">
					<ul class="menu">
						<c:choose>
							<c:when
								test="${ current_user.role == 'CHERCHEUREMPLOI' and not empty current_user }">
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/trouver_une_offre">Toutes
										les offres</a></li>
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/mes_demandes">Mes
										offres</a></li>
								<%-- <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/mes_cvs">Mes CVs</a>
		                        </li> --%>
								<li class="menu-item-has-children"><a href="#">Mon
										compte</a></li>
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/logout">Deconnexion</a>
								</li>
							</c:when>
							<c:when
								test="${ current_user.role == 'OFFREUREMPLOI' and not empty current_user }">
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/trouver_une_offre">Toutes
										les offres</a></li>
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/mes_demandes">Mes
										offres</a></li>
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/poster_une_offre">Publier
										une offre</a></li>
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/cv_theque">CV
										thèques</a></li>
								<li class="menu-item-has-children"><a href="#">Mon
										compte</a></li>
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/logout">Deconnexion</a>
								</li>
							</c:when>
							<c:otherwise>
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/trouver_une_offre">Toutes
										les offres</a></li>
								<li class="menu-item-has-children"><a
									href="${pageContext.request.contextPath}/connection">Connexion</a>
								</li>
							</c:otherwise>
						</c:choose>
					</ul>
				</nav>
			</div>

 		
        <div class="page-title-container style6" style="background-color: #337ab7;">
            <div class="container">
                <div class="page-title">
                    <h2 class="entry-title" style="color: yellow;">Vous êtes connecté en tant que </h2>
                </div>
                <ul class="breadcrumbs"> 
                    <li><a href="#">${ current_user.prenom } ${ current_user.nom }</a></li>
               <!--     <li><a href="#">Tout types</a></li>
                    <li><a href="#">Partout</a></li> -->
                </ul>
        
            </div>
       	</div>
	</header>

        <section id="content" class="tour">
            
            <div class="section white-bg">
                <div class="container">
                    <div class="text-center description block">
                        <h1>Votre espace personnel</h1>
                        <p> Choisissez l'un des differents modules et commencez votre exploration !</p>
                    </div>
                    <div class="tour-packages row add-clearfix image-box">
                        
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInDown">
                                <figure>
                                    <a href="${pageContext.request.contextPath}/trouver_une_offre">
                                    	<img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt="Search job cover">
                                   	</a>
                                    <figcaption>
                                        <h2 class="caption-title">Mes CVs</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInRight">
                                <figure>
                                    <a href="#"><img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt=""></a>
                                    <figcaption>
                                        <h2 class="caption-title">Contacter l'administration</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInRight">
                                <figure>
                                    <a href="#"><img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt=""></a>
                                    <figcaption>
                                        <h2 class="caption-title">Autre</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                    </div>
                </div>
            </div>
        </section>
  
    <jsp:include page="../../partials/JSImport.jsp"></jsp:include>
</body>
</html>

