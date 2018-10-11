 	<jsp:include page="../partials/header.jsp"></jsp:include>
 		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <div class="page-title-container style6" style="background-color: #337ab7;">
            <div class="container">
                <div class="page-title">
                    <h2 class="entry-title" style="color: yellow;">Connexion</h2>
                </div>
                <ul class="breadcrumbs"><!-- 
                    <li><a href="#">Toutes categories</a></li>
                    <li><a href="#">Tout types</a></li>
                    <li><a href="#">Partout</a></li> -->
                </ul>
                <div class="col-md-3 search-box hidden-xs">
                    <a href="${pageContext.request.contextPath}/registration"><button class="btn-medium">Je n'ai pas encore de compte</button></a>
                </div>
            </div>
       	</div>
	</header>
        <section id="content" class="gray-area">
            <div class="container">
                <div id="main">
                    <div class="text-center yellow-color box" style="font-size: 4em; font-weight: 300; line-height: 1em;">Bienvenue !</div>
                    <p class="light-blue-color block" style="font-size: 1.3333em; text-align: center;">Connectez vous a votre compte.</p>
                    <div class="col-sm-8 col-md-6 col-lg-5 no-float no-padding center-block">
                       
					    <c:if test="${ not empty errorLogin }">
					        <div class="alert alert-error center-block">
                               <c:out value="${ errorLogin }" />
                               <span class="close"></span>
                          	</div>
					    </c:if> 
					    <c:if test="${ registration_ok eq 1 }">
					        <div class="alert alert-info center-block">
                               Enregistrement reussie, connecter vous pour continuer !
                               <span class="close"></span>
                          	</div>
					    </c:if>   
					    <c:if test="${ logout_ok eq 1 }">
					        <div class="alert alert-info center-block">
                               Deconnexion reussie, connecter vous pour continuer !
                               <span class="close"></span>
                          	</div>
					    </c:if> 
						    
						
                        <form class="login-form" style="border: 1px 1px 1px solid black;" method="post" action="connectionChercheurEmploi">
                            <div class="form-group">
                                <input type="text" class="input-text input-large full-width" value="${ not empty oldLogin ? oldLogin : '' }" name="login" placeholder="entrez votre login" required>
                            </div>
                            <div class="form-group">
                                <input type="password" class="input-text input-large full-width" name="motdepasse" placeholder="entrez votre mot de passe" required>
                            </div>
                            <div class="form-group">
                                <label class="checkbox">
                                    <input type="checkbox" value="">se souvenir de moi
                                </label>
                            </div>
                            <button type="submit" class="btn-large full-width sky-blue1">Se connecter</button>
                        </form>
                    </div>
                </div>
            </div>
        </section>

    <jsp:include page="../partials/JSImport.jsp"></jsp:include>
</body>
</html>

