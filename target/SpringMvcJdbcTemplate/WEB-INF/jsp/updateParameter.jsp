
<%@include file="includeFile/header.jsp"%>


<div id="slogan">
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

		<h1>MISE A JOUR DES INFORMATIONS UTILISATEUR</h1>

		<form action="<c:url value='update'/>" method="post" id="Myform"
			class="well col-xs-8">
			<input type="hidden" name="userCode"
				value="${user.getInscriptionCode()}">
			<div class="form-group">
				<label for="lastName">Nom:</label> <input class="form-control"
					type="text" name="lastName" id="lastName" size="50" required
					value="${user.getUserLastName()}" onkeyup='nom()' />
			</div>
			<div class="form-group">
				<label for="firstName">Prénom:</label> <input class="form-control"
					type="text" name="firstName" size="50" id="firstName"
					value="${user.getUserFirstName()}" required/ onkeyup='prenom()'><br>
			</div>
			<div class="form-group">
				<label class="form-label col-xs-2" for="mail">Email:</label> <input
					class="form-control" type="text" size="50" required
					value="${user.getUserEmail()}" name="email"><br>
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input class="form-control"
					type="password" name="password" size="50" id="password"
					value="${user.getUserPassword()}" required/ onkeyup='prenom()'><br>
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
					value="${user.getUniversityName()}" onkeyup='universityName()' />
			</div>
			<div class="form-group">
				<label class="form-label col-xs-4" for="laboratoire">Laboratoire:
				</label> <input class="form-control" type="text" name="laboratoire"
					size="50" id="laboratoire" required
					value="${user.getLaboratoire()}" onkeyup='universityName()' />
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
				<label for="quality">Qualite :</label> <select name="quality"
					class="form-control" onkeyup='quality()'>
					<option value="${user.getUserFunction()}" onclick="chooseGrade()">${user.getUserFunction()}</option>
				</select>
			</div>

			<c:if test="${user.getUserFunction()==\"Enseignant\"}">

				<div class="form-group" id="grade">
					<label for="grade">Grade :</label> <select name="grade"
						class="form-control">
						<option value="Ater"">Ater</option>
						<option value="Assistant"">Assistant</option>
						<option value="CC"">CC</option>
						<option value="MC"">MC</option>
						<option value="Pr"">Pr</option>
					</select>
				</div>
			</c:if>

			<c:if test="${user.getUserFunction()==\"Etudiant\"}">
				<div class="form-group" id="level">
					<label for="level">Niveau :</label> <select name="level"
						class="form-control">
						<option value="M1"">M1</option>
						<option value="M2"">M2</option>
						<option value="D1"">D1</option>
						<option value="D2"">D2</option>
						<option value="D3"">D3</option>
					</select>
				</div>
			</c:if>

			<!-- 					<div id="hidden" class="form-group"></div> -->

			<div class="form-group" id="fin">
				<input class="btn btn-danger" type="reset" value="annuler" /> <input
					class="btn btn-primary" type="submit" value="Mettre à jour" />
			</div>
		</form>
	</div>
</div>

<!-- / corps -->
</div>

<%@include file="includeFile/footer.jsp"%>