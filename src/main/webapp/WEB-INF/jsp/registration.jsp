 	<jsp:include page="../partials/header.jsp"></jsp:include>
        <div class="page-title-container style6" style="background-color: #337ab7;">
            <div class="container">
                <div class="page-title">
                    <h2 class="entry-title" style="color: yellow;">Creation de compte</h2>
                </div>
                <ul class="breadcrumbs"><!-- 
                    <li><a href="#">Toutes categories</a></li>
                    <li><a href="#">Tout types</a></li>
                    <li><a href="#">Partout</a></li> -->
                </ul>
                <div class="col-md-3 search-box hidden-xs">
		            <a href="${pageContext.request.contextPath}/connection"><button class="btn-medium">J'ai deja un compte</button></a>
                </div>
            </div>
       	</div>
	</header>
        <section id="content" class="gray-area">
            <div class="container shortcode">              
                <div class="block">
                    <h2>Inscription</h2>
                    <div class="tab-container full-width-style white-bg">
                        <ul class="tabs">
                            <li class="active"><a href="#first-tab" data-toggle="tab"><i class="soap-icon-user circle"></i>Chercheur d'emploi</a></li>
                            <li><a href="#second-tab" data-toggle="tab"><i class="soap-icon-bag circle"></i>Offreur d'emploi</a></li>
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane fade in active" id="first-tab">
                                <form class="booking-form" method="post" action="${pageContext.request.contextPath}/registration">
	                                <div class="person-information">
	                                    <h2>Vos informations personnelles (Chercheur d'emploi)</h2>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Nom <span color: red;> *</span></label>
	                                            <input type="text" required name="nom" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Prenom <span color: red;> *</span></label>
	                                            <input type="text" required name="prenom" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Sexe <span color: red;> *</span></label>
												<div class="selector">
	                                                <select required name="sexe" class="full-width">
	                                                    <option value=""></option>
	                                                    <option value="H">Homme</option>
	                                                    <option value="F">Femme</option>
	                                                </select>
	                                            </div>	
                                            </div>
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Statut marital <span color: red;> *</span></label>
	                                            <div class="selector">
	                                                <select required name="maritalStatus" class="full-width">
	                                                    <option value=""></option>
	                                                    <option value="CELIBATAIRE">Celibataire</option>
	                                                    <option value="MARIE">Marié</option>
	                                                    <option value="DIVORCE">Divorcé</option>
	                                                    <option value="VEUF">Veuf</option>
	                                                </select>
	                                            </div>	
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Nature contrat <span color: red;> *</span></label>
	                                            <div class="selector">
	                                                <select required name="contactNature" class="full-width">
	                                                    <option value=""></option>
	                                                    <option value="CDD">CDD</option>
	                                                    <option value="CDI">CDI</option>
	                                                    <option value="FREELANCE">Freelance</option>
	                                                    <option value="STAGE">Stage</option>
	                                                </select>
	                                            </div>
	                                        </div>
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Niveau d'etude <span color: red;> *</span></label>
	                                            <div class="selector">
	                                                <select required name="studyLevel" class="full-width">
	                                                    <option value=""></option>
	                                                    <option value="CEP">CEP</option>
	                                                    <option value="BEPC">BEPC</option>
	                                                    <option value="PROBATOIRE">PROBATOIRE</option>
	                                                    <option value="BAC">BAC</option>
	                                                    <option value="BAC1">BAC + 1</option>
	                                                    <option value="BAC2">BAC + 2</option>
	                                                    <option value="BAC3">BAC + 3</option>
	                                                    <option value="BAC4">BAC + 4</option>
	                                                    <option value="BAC5">BAC + 5</option>
	                                                    <option value="BAC6">BAC + 6</option>
	                                                    <option value="BAC7">BAC + 7</option>
	                                                    <option value="BAC8">BAC + 8</option>
	                                                    <option value="BAC8+">BAC + 8 plus...</option>
	                                                </select>
	                                            </div>
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Anciennété <span color: red;> *</span></label>
	                                            <div class="selector">
	                                                <select required name="seniority" class="full-width">
	                                                    <option value=""></option>
	                                                    <option value="6mois">6 mois</option>
	                                                    <option value="1ans">1 ans</option>
	                                                    <option value="2ans">2 ans</option>
	                                                    <option value="5ans">5 ans</option>
	                                                    <option value="5ans+">Plus de 5 ans</option>
                                                    </select>
	                                            </div>
	                                        </div>
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Duree contrat souhaitée <span color: red;> *</span></label>
	                                            <div class="selector">
	                                                <select required name="timeOfContact" class="full-width">
	                                                    <option value=""></option>
	                                                    <option value="6mois">6 mois</option>
	                                                    <option value="1ans">1 ans</option>
	                                                    <option value="2ans">2 ans</option>
	                                                    <option value="5ans">5 ans</option>
	                                                    <option value="5ans+">Plus de 5 ans</option>
                                                    </select>
	                                            </div>
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Login <span color: red;> *</span></label>
	                                            <input type="text" name="login" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Mot de passe <span color: red;> *</span></label>
	                                            <input type="password" required name="password" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Telephone <span color: red;> *</span></label>
	                                            	<input type="number" required name="phone" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Adresse mail <span color: red;> *</span></label>
	                                            <input type="email" required name="email" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
		                                    <div class="col-sm-10 col-md-10">
		                                        <button type="submit" class="full-width btn-large">Je m'inscris</button>
		                                    </div>
		                                </div>
	                                </div>
                                </form>
                            </div>
                            <div class="tab-pane fade" id="second-tab">
                                <form class="booking-form" method="post" action="">
	                                <div class="person-information">
	                                    <h2>Vos informations (Offreur d'emploi)</h2>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Raison sociale <span color: red;> *</span></label>
	                                            <input type="text" required name="RAISONSOCIALE" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Situation geograhique <span color: red;> *</span></label>
	                                            <input type="text" required name="SITUATIONGEOGRAPHIQUE" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Login <span color: red;> *</span></label>
	                                            <input type="text" name="LOGIN" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Mot de passe <span color: red;> *</span></label>
	                                            <input type="password" required name="PASSWORD" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Telephone <span color: red;> *</span></label>
	                                            	<input type="number" required name="TELEPHONE" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                        <div class="col-sm-6 col-md-5">
	                                            <label>Adresse mail <span color: red;> *</span></label>
	                                            <input type="email" required name="EMAIL" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-10 col-md-10">
	                                            <label>Adresse <span color: red;> *</span></label>
	                                            <input type="text" required name="ADRESSE" class="input-text full-width" value="" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-10 col-md-10">
	                                            <label>Description</label>
												<textarea rows="10" cols="" style="width: 100%;"></textarea>
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
		                                    <div class="col-sm-10 col-md-10">
		                                        <button type="submit" class="full-width btn-large">Je m'inscris</button>
		                                    </div>
		                                </div>
	                                </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                
            </div>
        </section>
    <<jsp:include page="../partials/JSImport.jsp"></jsp:include>
</body>
</html>

