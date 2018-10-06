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
        <section id="content" class="gray-area">
            <div class="container">
                <div id="main">
                    <div class="text-center yellow-color box" style="font-size: 4em; font-weight: 300; line-height: 1em;">Bienvenue !</div>
                    <p class="light-blue-color block" style="font-size: 1.3333em; text-align: center;">Connectez vous a votre compte.</p>
                    <div class="col-sm-8 col-md-6 col-lg-5 no-float no-padding center-block">
                       
					    <c:if test="${error eq 'bonjour'}">
					        <div class="alert alert-error center-block">
                               Error Message. Your Message Comes Here
                               <span class="close"></span>
                          	</div>
					    </c:if>    
						    
						
                        <form class="login-form" style="border: 1px 1px 1px solid black;" method="post" action="${pageContext.request.contextPath}/connection">
                            <div class="form-group">
                                <input type="text" class="input-text input-large full-width" value="${ not empty oldLogin ? oldLogin : '' }"name="login" placeholder="entrez votre login" required>
                            </div>
                            <div class="form-group">
                                <input type="text" class="input-text input-large full-width" name="motdepasse" placeholder="entrez votre mot de passe" required>
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

