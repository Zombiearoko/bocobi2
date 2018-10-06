 		<jsp:include page="../partials/header.jsp"></jsp:include>
	        <div class="page-title-container style1">
		        <div class="container">
		            <div class="page-title pull-left">
		                <h2 class="entry-title">Choisissez une action</h2>
		            </div>
		            <a href="${pageContext.request.contextPath}/registration"><button class="btn-medium sky-blue1">Inscription</button></a>
		            <a href="${pageContext.request.contextPath}/connection"><button class="btn-medium">Connexion</button></a>
		        </div>
		    </div>

		</header>

        <section id="content" class="tour">
            
            <div class="section white-bg">
                <div class="container">
                    <div class="text-center description block">
                        <h1>Bienvenue sur la plateforme Bocoi2</h1>
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
                                        <h2 class="caption-title">Accueil</h2>
                                        <p style="color:white; padding-top: 6px;">Decrouvrez asdasd sadasd asdasd asdasd asadasd sadasd asd  asd asd as das dsa das tout les avantages que nous offrons ici avec nos services super geniaux qui depassent toutes les attentes qu'un etre humain peut attendre...</p>
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
                                        <span class="price">$483</span>
                                        <h2 class="caption-title">Dubai City Tour</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInLeft">
                                <figure>
                                    <a href="#"><img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt=""></a>
                                    <figcaption>
                                        <span class="price">$352</span>
                                        <h2 class="caption-title">Hawaii Life Style</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInUp">
                                <figure>
                                    <a href="#"><img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt=""></a>
                                    <figcaption>
                                        <span class="price">$478</span>
                                        <h2 class="caption-title">Rome, Milan, Madrid</h2>
                                    </figcaption>
                                </figure>
                            </article>
                        </div>
                        <div class="col-sm-6 col-md-4">
                            <article class="box animated" data-animation-type="fadeInRight">
                                <figure>
                                    <a href="#"><img src="${pageContext.request.contextPath}/resources/images/home.jpg" alt=""></a>
                                    <figcaption>
                                        <span class="price">$175</span>
                                        <h2 class="caption-title">Italy Family Beach</h2>
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

