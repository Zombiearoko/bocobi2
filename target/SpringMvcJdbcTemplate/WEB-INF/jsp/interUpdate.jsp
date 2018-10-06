	<%@include file="includeFile/header.jsp" %>
	
	
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

				<h1>IDENTIFIEZ-VOUS</h1>

				<form action="<c:url value='updateParameter'/>" method="post"
					id="Myform" class="well col-xs-8">

					<div class="form-group">
						<label class="form-label col-xs-2" for="mail">Email:</label> <input
							class="form-control" type="text" size="50" required name="email"><br>
					</div>
					<div class="form-group">
						<label for="password">Password:</label> <input
							class="form-control" type="password" name="password" size="50"
							id="password" required/ onkeyup='prenom()'><br>
					</div>
					<div class="form-group" id="qualite">
						<label for="quality">Qualité :</label> <select name="quality"
							class="form-control" onkeyup='quality()'>
							<option value="enseignant" onclick="chooseGrade()">Enseignant</option>
							<option value="etudiant" onclick="chooseLevel()">Etudiant</option>
						</select>
					</div>
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