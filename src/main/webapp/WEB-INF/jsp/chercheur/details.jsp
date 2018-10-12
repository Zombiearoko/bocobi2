 		<jsp:include page="../../partials/header.jsp"></jsp:include>
 			<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	        <div class="page-title-container style6" style="background-color: #337ab7;">
            <div class="container">
                <div class="page-title">
                    <h2 class="entry-title" style="color: yellow;">Détails sur l'offre choisi</h2>
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
        <section id="content" class="gray-area">
            <div class="container">
                <div class="row">
                    <div id="main" class="col-sm-8 col-md-9">
                        <div class="booking-information travelo-box">
                            <h1><c:out value="${ offre['nomEmploi'] }" /></h1>
                            <hr />
                            <h2>Description</h2>
                            <p><c:out value="${ offre['descriptionEmploi'] }" /></p>
                            <br />
                            <hr />
                            <h2>Conditions d'embauche</h2>
                            <p></p>
                            <br />
                        </div>
                    </div>
                    <div class="sidebar col-sm-4 col-md-3">
                        <div class="travelo-box book-with-us-box">
                            <h4>Informations generales</h4>
                            <ul>
                                <li>
                                    <i class="soap-icon-clock circle"></i>
                                    <h5 class="title"><a href="#">Date de publication</a></h5>
                                    <p><c:out value="${ offre['datePublication'] }    ${ offre['heurePublication'] }" /></p>
                                </li>
                                <li>
                                    <i class="soap-icon-departure circle"></i>
                                    <h5 class="title"><a href="#">Localisation</a></h5>
                                    <p><c:out value="${ offre['lieuxEmploi'] }" /></p>
                                </li>
                                <li>
                                    <i class="soap-icon-card circle"></i>
                                    <h5 class="title"><a href="#">Titre de l'offre</a></h5>
                                    <p><c:out value="${ offre['nomEmploi'] }" /></p>
                                </li>
                                <li>
                                    <i class="soap-icon-star circle"></i>
                                    <h5 class="title"><a href="#">Salaire</a></h5>
                                    <p><c:out value="${ offre['salaireEmploi'] }" /></p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>

   <jsp:include page="../../partials/JSImport.jsp"></jsp:include>
   
</body>
</html>

