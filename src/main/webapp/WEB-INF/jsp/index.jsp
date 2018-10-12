 	<jsp:include page="../partials/header.jsp"></jsp:include>
 		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <div class="page-title-container style6" style="background-color: #337ab7;">
            <div class="container">
                <div class="page-title">
                    <h2 class="entry-title" style="color: yellow;">Bienvenue sur BOCOBI2</h2>
                </div>
                <ul class="breadcrumbs"><!-- 
                    <li><a href="#">Toutes categories</a></li>
                    <li><a href="#">Tout types</a></li>
                    <li><a href="#">Partout</a></li> -->
                </ul>
                <div class="col-md-3 search-box hidden-xs">
                    <a href="${pageContext.request.contextPath}/registration"><button class="btn-medium sky-blue1">Inscription</button></a>
		            <a href="${pageContext.request.contextPath}/connection"><button class="btn-medium">Connexion</button></a>
                </div>
            </div>
       	</div>
	</header>

        <section id="content" class="tour">
            
            <div class="section white-bg">
                <div class="container">
                    <div class="text-center description block">
                        <h1>Bienvenue sur la plateforme Bocobi2</h1>
                        <p> Choisissez l'un des differents modules et commencez votre exploration !</p>
                    </div>
                    <div class="tour-packages row add-clearfix image-box">
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInLeft">
                                <!-- <span class="discount">
                                    <span class="discount-text"></span>
                                </span> -->
                                <figure>
                                    <a href="${pageContext.request.contextPath}/">
                                        <img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt="">
                                    </a>
                                    <figcaption>
                                        <h2 class="caption-title">Presentation de BOCOBI2</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInDown">
                                <figure>
                                    <a href="${pageContext.request.contextPath}/trouver_une_offre">
                                    	<img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt="Search job cover">
                                   	</a>
                                    <figcaption>
                                        <h2 class="caption-title">Recherche et offre d'emploi</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInRight">
                                <figure>
                                    <a href="#"><img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt=""></a>
                                    <figcaption>
                                        <h2 class="caption-title">Module numero 3</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInLeft">
                                <figure>
                                    <a href="#"><img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt=""></a>
                                    <figcaption>
                                        <h2 class="caption-title">Module numero 4</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInUp">
                                <figure>
                                    <a href="#"><img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt=""></a>
                                    <figcaption>
                                        <h2 class="caption-title">Module numero 5</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInRight">
                                <figure>
                                    <a href="#"><img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt=""></a>
                                    <figcaption>
                                        <h2 class="caption-title">Module numero 6</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                    </div>
                </div>
            </div>
        </section>
  
    <jsp:include page="../partials/JSImport.jsp"></jsp:include>
</body>
</html>

