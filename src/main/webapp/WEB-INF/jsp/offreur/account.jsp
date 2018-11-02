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
					<div id="main" class="col-sm-10 col-md-10">
						<div class="booking-information travelo-box">
							<h2>Mes informations</h2>
							<hr />
							<div class="booking-confirmation clearfix">
								<form class="booking-form" method="post" action="#">
									<div class="person-information">
										<div class="form-group row">
	                                        <div class="col-sm-6 col-md-6">
	                                            <label>Raison sociale <span style="color: red;"> *</span></label>
	                                            <input type="text" required name="raison" class="input-text full-width" value="<c:out value="${ current_user.raisonSociale }" />" placeholder="" />
	                                        </div>
	                                        <div class="col-sm-6 col-md-6">
	                                            <label>Situation geograhique <span style="color: red;"> *</span></label>
	                                            <input type="text" required name="situation_geograpique" class="input-text full-width" value="<c:out value="${ current_user.situationGeographique }" />" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-6">
	                                            <label>Login <span style="color: red;"> *</span></label>
	                                            <input type="text" name="login" class="input-text full-width" value="<c:out value="${ current_user.login }" />" placeholder="" />
	                                        </div>
	                                        <div class="col-sm-6 col-md-6">
	                                            <label>Mot de passe <span style="color: red;"> *</span></label>
	                                            <input type="password" required name="mdp" class="input-text full-width" value="<c:out value="${ current_user.password }" />" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-6 col-md-6">
	                                            <label>Telephone <span style="color: red;"> *</span></label>
	                                            	<input type="number" required name="tel" class="input-text full-width" value="<c:out value="${ current_user.telephone }" />" placeholder="" />
	                                        </div>
	                                        <div class="col-sm-6 col-md-6">
	                                            <label>Adresse mail <span style="color: red;"> *</span></label>
	                                            <input type="email" required name="mail" class="input-text full-width" value="<c:out value="${ current_user.email }" />" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-12 col-md-12">
	                                            <label>Adresse <span style="color: red;"> *</span></label>
	                                            <input type="text" required name="addr" class="input-text full-width" value="<c:out value="${ current_user.adresse }" />" placeholder="" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group row">
	                                        <div class="col-sm-12 col-md-12">
	                                            <label>Description</label>
												<textarea rows="10" name="desc" cols="" style="width: 100%;"><c:out value="${ current_user.descriptionEntreprise }" /></textarea>
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
				</div>
			</div>
		</section>
		<jsp:include page="../../partials/JSImport.jsp"></jsp:include>
</body>
</html>