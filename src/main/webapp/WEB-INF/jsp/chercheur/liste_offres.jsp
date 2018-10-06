 		<jsp:include page="../../partials/header.jsp"></jsp:include>
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
                            <h4 class="search-results-title"><i class="soap-icon-search"></i><b>1,984</b> results found.</h4>
                            <div class="toggle-container filters-container">

                                <div class="panel style1 arrow-right">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" href="#accomodation-type-filter" class="collapsed">Categorie</a>
                                    </h4>
                                    <div id="accomodation-type-filter" class="panel-collapse collapse">
                                        <div class="panel-content">
                                            <ul class="check-square filters-option">
                                                <li><a href="#">All<small>(722)</small></a></li>
                                                <li><a href="#">Hotel<small>(982)</small></a></li>
                                                <li><a href="#">Resort<small>(127)</small></a></li>
                                                <li class="active"><a href="#">Bed &amp; Breakfast<small>(222)</small></a></li>
                                                <li><a href="#">Condo<small>(158)</small></a></li>
                                                <li><a href="#">Residence<small>(439)</small></a></li>
                                                <li><a href="#">Guest House<small>(52)</small></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="panel style1 arrow-right">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" href="#amenities-filter" class="collapsed">Type</a>
                                    </h4>
                                    <div id="amenities-filter" class="panel-collapse collapse">
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
                                        <a data-toggle="collapse" href="#language-filter" class="collapsed">Localisation</a>
                                    </h4>
                                    <div id="language-filter" class="panel-collapse collapse">
                                        <div class="panel-content">
                                            <form method="post">
                                                <div class="form-group">
                                                    <label>Mot clé</label>
                                                    <input type="text" class="input-text full-width" placeholder="" />
                                                </div>
                                                <br />
                                                <button class="btn-medium icon-check uppercase full-width">search again</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-8 col-md-9">
                            <div class="hotel-list listing-style3 hotel" style="margin-top: 0px;">
                                <article class="box">
                                    <figure class="col-sm-5 col-md-4">
                                        <a title="" href="ajax/slideshow-popup.html" class="hover-effect popup-gallery"><img width="170" height="100" alt="" src="http://placehold.it/270x160"></a>
                                    </figure>
                                    <div class="details col-sm-7 col-md-8">
                                        <div>
                                            <div>
                                                <h4 class="box-title">Recherche d'un developpeur web laravel<small><i class="soap-icon-departure yellow-color"></i> Yaounde</small></h4>
                                            </div>
                                            <div>
                                                <h4><small><i class="soap-icon-bag yellow-color"></i> Nouvic corporation</small></h4>
                                            </div>
                                        </div>
                                        <div>
                                            <p>Nunc cursus libero purus ac congue ar lorem cursus ut sed vitae pulvinar massa idend porta nequetiam elerisque mi id, consectetur adipi deese cing elit maus fringilla bibe endum.</p>
                                            <div>
                                                <a class="button btn-small full-width text-center" title="" href="${pageContext.request.contextPath}/details_offre">Consulter</a>
                                            </div>
                                        </div>
                                    </div>
                                </article>
                                <article class="box">
                                    <figure class="col-sm-5 col-md-4">
                                        <a title="" href="ajax/slideshow-popup.html" class="hover-effect popup-gallery"><img width="270" height="160" alt="" src="http://placehold.it/270x160"></a>
                                    </figure>
                                    <div class="details col-sm-7 col-md-8">
                                        <div>
                                            <div>
                                                <h4 class="box-title">Cleopatra Resort<small><i class="soap-icon-departure yellow-color"></i> Douala</small></h4>
                                            </div>
                                            <div>
                                                <h4><small><i class="soap-icon-bag yellow-color"></i> CDE</small></h4>
                                            </div>
                                        </div>
                                        <div>
                                            <p>Nunc cursus libero purus ac congue ar lorem cursus ut sed vitae pulvinar massa idend porta nequetiam elerisque mi id, consectetur adipi deese cing elit maus fringilla bibe endum.</p>
                                            <div>
                                                <a class="button btn-small full-width text-center" title="" href="${pageContext.request.contextPath}/details_offre">Consulter</a>
                                            </div>
                                        </div>
                                    </div>
                                </article>
                            </div>
                            <a href="#" class="uppercase full-width button btn-large">load more listing</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>


   <jsp:include page="../../partials/JSImport.jsp"></jsp:include>

</body>
</html>

