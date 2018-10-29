<jsp:include page="../../partials/header.jsp"></jsp:include>

			<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
			<div class="page-title-container style6"
				style="background-color: #337ab7;">
				<div class="container">
					<div class="page-title">
						<h2 class="entry-title" style="color: yellow;">Mon compte</h2>
					</div>
					<ul class="breadcrumbs">
						<!-- 
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
					<div id="main" class="col-sm-8 col-md-9">
						<div class="booking-information travelo-box">
							<h2>Mes informations</h2>
							<hr />
							<div class="booking-confirmation clearfix">
								<form class="booking-form" method="post" action="#">
									<div class="person-information">
										<div class="form-group row">
											<div class="col-sm-6 col-md-6">
												<label>Nom <span style="color: red;"> *</span></label> <input
													type="text" required name="nom"
													class="input-text full-width"
													value="<c:out value="${ current_user.nom }" />"
													placeholder="" />
											</div>
											<div class="col-sm-6 col-md-6">
												<label>Prénom <span style="color: red;"> *</span></label> <input
													type="text" required name="prenom"
													class="input-text full-width"
													value="<c:out value="${ current_user.prenom }" />"
													placeholder="" />
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-6 col-md-6">
												<label>Sexe <span style="color: red;"> *</span></label>
												<div class="selector">
													<select required name="sexe" class="full-width">
														<option value=""></option>
														<option value="H"
															${ current_user.sexe == 'H' ? 'selected' : '' }>Homme</option>
														<option value="F"
															${ current_user.sexe == 'F' ? 'selected' : '' }>Femme</option>
													</select>
												</div>
											</div>
											<div class="col-sm-6 col-md-6">
												<label>Statut marital <span style="color: red;">
														*</span></label>
												<div class="selector">
													<select required name="maritalStatus" class="full-width">
														<option value=""></option>
														<option value="CELIBATAIRE"
															${ current_user.statutMarital == 'CELIBATAIRE' ? 'selected' : '' }>Celibataire</option>
														<option value="MARIE"
															${ current_user.statutMarital == 'MARIE' ? 'selected' : '' }>Marié</option>
														<option value="DIVORCE"
															${ current_user.statutMarital == 'DIVORCE' ? 'selected' : '' }>Divorcé</option>
														<option value="VEUF"
															${ current_user.statutMarital == 'VEUF' ? 'selected' : '' }>Veuf</option>
													</select>
												</div>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-6 col-md-6">
												<label>Nature contrat <span style="color: red;">
														*</span></label>
												<div class="selector">
													<select required name="contactNature" class="full-width">
														<option value=""></option>
														<option value="CDD"
															${ current_user.natureContrat == 'CDD' ? 'selected' : '' }>CDD</option>
														<option value="CDI"
															${ current_user.natureContrat == 'CDI' ? 'selected' : '' }>CDI</option>
														<option value="FREELANCE"
															${ current_user.natureContrat == 'FREELANCE' ? 'selected' : '' }>Freelance</option>
														<option value="STAGE"
															${ current_user.natureContrat == 'STAGE' ? 'selected' : '' }>Stage</option>
													</select>
												</div>
											</div>
											<div class="col-sm-6 col-md-6">
												<label>Niveau d'etude <span style="color: red;">
														*</span></label>
												<div class="selector">
													<select required name="studyLevel" class="full-width">
														<option value=""></option>
														<option value="CEP"
															${ current_user.niveauEtude == 'CEP' ? 'selected' : '' }>CEP</option>
														<option value="BEPC"
															${ current_user.niveauEtude == 'BEPC' ? 'selected' : '' }>BEPC</option>
														<option value="PROBATOIRE"
															${ current_user.niveauEtude == 'PROBATOIRE' ? 'selected' : '' }>PROBATOIRE</option>
														<option value="BAC"
															${ current_user.niveauEtude == 'BAC' ? 'selected' : '' }>BAC</option>
														<option value="BAC1"
															${ current_user.niveauEtude == 'BAC1' ? 'selected' : '' }>BAC
															+ 1</option>
														<option value="BAC2"
															${ current_user.niveauEtude == 'BAC2' ? 'selected' : '' }>BAC
															+ 2</option>
														<option value="BAC3"
															${ current_user.niveauEtude == 'BAC3' ? 'selected' : '' }>BAC
															+ 3</option>
														<option value="BAC4"
															${ current_user.niveauEtude == 'BAC4' ? 'selected' : '' }>BAC
															+ 4</option>
														<option value="BAC5"
															${ current_user.niveauEtude == 'BAC5' ? 'selected' : '' }>BAC
															+ 5</option>
														<option value="BAC6"
															${ current_user.niveauEtude == 'BAC6' ? 'selected' : '' }>BAC
															+ 6</option>
														<option value="BAC7"
															${ current_user.niveauEtude == 'BAC7' ? 'selected' : '' }>BAC
															+ 7</option>
														<option value="BAC8"
															${ current_user.niveauEtude == 'BAC8' ? 'selected' : '' }>BAC
															+ 8</option>
														<option value="BAC8+"
															${ current_user.niveauEtude == 'BAC8+' ? 'selected' : '' }>BAC
															+ 8 plus...</option>
													</select>
												</div>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-6 col-md-6">
												<label>Ancienneté <span style="color: red;">
														*</span></label>
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
											<div class="col-sm-6 col-md-6">
												<label>Duree contrat souhaitée <span
													style="color: red;"> *</span></label>
												<div class="selector">
													<select required name="timeOfContact" class="full-width">
														<option value=""></option>
														<option value="6mois"
															${ current_user.dureeContratSouhaite == '6mois' ? 'selected' : '' }>6
															mois</option>
														<option value="1ans"
															${ current_user.dureeContratSouhaite == '1ans' ? 'selected' : '' }>1
															ans</option>
														<option value="2ans"
															${ current_user.dureeContratSouhaite == '2ans' ? 'selected' : '' }>2
															ans</option>
														<option value="5ans"
															${ current_user.dureeContratSouhaite == '5ans' ? 'selected' : '' }>5
															ans</option>
														<option value="5ans+"
															${ current_user.dureeContratSouhaite == '5ans+' ? 'selected' : '' }>Plus
															de 5 ans</option>
													</select>
												</div>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-6 col-md-6">
												<label>Login <span style="color: red;"> *</span></label> <input
													type="text" name="login" class="input-text full-width"
													value="<c:out value="${ current_user.login }" />"
													placeholder="" />
											</div>
											<div class="col-sm-6 col-md-6">
												<label>Mot de passe <span style="color: red;">
														*</span></label> <input type="password" required name="password"
													class="input-text full-width"
													value="<c:out value="${ current_user.password }" />"
													placeholder="" />
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-6 col-md-6">
												<label>Telephone <span style="color: red;"> *</span></label>
												<input type="number" required name="phone"
													class="input-text full-width"
													value="<c:out value="${ current_user.telephone }" />"
													placeholder="" />
											</div>
											<div class="col-sm-6 col-md-6">
												<label>Adresse mail <span style="color: red;">*</span></label>
												<input type="email" required name="email"
													class="input-text full-width"
													value="<c:out value="${ current_user.email }" />"
													placeholder="" />
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-12 col-md-12">
												<button type="submit" class="full-width btn-large">Mettre
													a jour</button>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="sidebar col-sm-4 col-md-3">
						<div class="travelo-box contact-box">
							<h2>Poster un nouveau CV</h2>
							<p>Pour maximiser vos chances de trouver un emploi, vous
								pouvez poster plusieurs CVs en fonction du domaine recherché.</p>
							<address class="contact-details">
								<a href="#" class="button btn-large full-width uppercase"
									style="background: #98ce44;">Ajouter un CV</a>
							</address>
						</div>
						<div class="travelo-box book-with-us-box">
							<h2>Ma liste de CVs</h2>
							<ul>
								<li><i class="soap-icon-right circle"></i>
									<h5 class="title">
										<a href="#">135,00+ Hotels</a>
									</h5>
									<p>Nunc cursus libero pur congue arut nimspnty.</p></li>
								<li><i class="soap-icon-right circle"></i>
									<h5 class="title">
										<a href="#">Low Rates &amp; Savings</a>
									</h5>
									<p>Nunc cursus libero pur congue arut nimspnty.</p></li>
								<li><i class="soap-icon-right circle"></i>
									<h5 class="title">
										<a href="#">Excellent Support</a>
									</h5>
									<p>Nunc cursus libero pur congue arut nimspnty.</p></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</section>
		<jsp:include page="../../partials/JSImport.jsp"></jsp:include>
</body>
</html>