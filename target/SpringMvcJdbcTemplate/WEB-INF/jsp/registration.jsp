	<%@include file="includeFile/header.jsp" %>
	
	
			<div id="slogan">
				<span>Les inscriptions sont ouvertes jusqu'au 15 Mai 2018 à 
					23h59min, heure du Cameroun </span>
				<c:if test="${operationResult!=null}">
					<h1 class="list2">
						<font color="red">${operationResult }</font>
					</h1>
					<script type="text/javascript">
						alert('${operationResult }');
					</script>
				</c:if>
			</div>

		</header>
		<!-- header-->


		<div class="container">

			<div id="monformulaire" class="container">
				<h1>INSCRIPTION</h1>

				<form action="<c:url value='registration'/>" method="post"
					id="Myform" class="well col-xs-8">
					<div class="form-group">
						<label for="lastName">Nom:</label> <input class="form-control"
							type="text" name="lastName" id="lastName" size="50" required
							onkeyup='nom()' /> <span class="erreur">${erreurs['name']}</span>
					</div>
					<div class="form-group">
						<label for="firstName">Prénom:</label> <input class="form-control"
							type="text" name="firstName" size="50" id="firstName"
							required/ onkeyup='prenom()'><span class="erreur">${erreurs['firstName']}</span><br>
					</div>
					<div class="form-group">
						<label class="form-label col-xs-2" for="mail">Email:</label> <input
							class="form-control" type="text" size="50" required name="email"><span
							class="erreur">${erreurs['email']}</span><br>
					</div>
					<div class="form-group">
						<label for="password">Password:</label> <input
							class="form-control" type="password" name="password" size="50"
							id="password" required/ onkeyup='prenom()'><span
							class="erreur">${erreurs['password']}</span><br>
					</div>
					<div class="form-group">
						<label for="option">Sexe :</label> <select name="sexe"
							class="form-control" onkeyup='option()'>
							<option value="M">Masculin</option>
							<option value="F">Féminin</option>
						</select>
					</div>
					<div class="form-group">
						<label class="form-label col-xs-4" for="universityName">Université
							d'origine:</label> <input class="form-control" type="text"
							name="universityName" size="50" id="universityName" required
							onkeyup='universityName()' />
					</div>
					<div class="form-group">
						<label class="form-label col-xs-4" for="laboratoire">Laboratoire:
						</label> <input class="form-control" type="text" name="laboratoire"
							size="50" id="laboratoire" required onkeyup='universityName()' />
					</div>
					<div class="form-group">
						<label for="option">Spécialité :</label> <select name="option"
							class="form-control" onkeyup='option()'>
							<option value="Maths-algebre">Mathématique-algebre</option>
							<option value="Maths-analyse">Mathématique-analyse</option>
							<option value="Informatique">Informatique</option>
						</select>
					</div>
					<div class="form-group" id="qualite">
						<label for="quality">Qualité :</label> <select name="quality"
							class="form-control" onkeyup='quality()'>
							<option value="enseignant" onclick="chooseGrade()">Enseignant</option>
							<option value="etudiant" onclick="chooseLevel()">Etudiant</option>
						</select>
					</div>
					<div id="hidden" class="form-group"></div>

					<div class="form-group" id="fin">
						<input class="btn btn-danger" type="reset" value="annuler" /> <input
							class="btn btn-primary" type="submit" value="suivant" />
					</div>
				</form>
			</div>
		</div>

		<!-- / corps -->
	</div>
	
	
	<%@include file="includeFile/footer.jsp" %>