	<%@include file="includeFile/header.jsp" %>
	
			<div id ="slogan">
					<span>Bien vouloir séparer les différents mots clés par des points virgules </span>
					<c:if test="${operationResult!=null}">
					<h1 class="list2">
						<font color="red">${operationResult }</font>
					</h1>
					<script type="text/javascript">
						alert('${operationResult }');
					</script>
				</c:if>
			</div>
				
			</header><!-- header-->


			<div class="container">

				<div id="monformulaire" class="container">

					<h1>Modifiez votre article Article</h1>

					<form action="<c:url value='updateArticle'/>" method="post"	enctype="multipart/form-data" id="Myform" class="well col-xs-8">
						<input type="hidden" name="userId" value="${user.getInscriptionCode()}"/>
						<input type="hidden" name="userLastName" value="${user.getUserLastName()}"/>
						<input type="hidden" name="articleId" value="${article.getArticleId()}"/>
						<input type="hidden" name="userFirstName" value="${user.getUserFirstName()}"/>
						<input type="hidden" name="userOption" value="${user.getOption()}"/>
						<div class="form-group">
							<label for="title">Titre:</label>
							<input class="form-control" type="text" name="title" id="title" size="50" 
							required value="${article.getArticleTitle() }"/>
						</div>
						<div class="form-group">
							<label for="codeRegistration">Mots clés:</label> 
							<input class="form-control" type="text" name="keywords" size="50" 
							id="keywords" required value="${article.getArticleKeywords() }"/><br>
						</div>
						
						<div class="form-group">
							<label for="file">Choisir le fichier:</label> 
							<input type="file" class="" name="file">
						</div>
						<div class="form-group">
							<label for="abstract" class="label-control">Résumé:</label> 
							<textarea class="form-control" rows="10" name="abstract">
							${article.getArticleAbstract() }
							</textarea>
						</div>

						<div class="form-group" id="fin">
							<input class="btn btn-danger" type="reset" value="annuler" /> 
							<input class="btn btn-primary" type="submit" value="suivant" />
						</div>
					</form>
				</div>
			
							

				
			</div>
			
			<!-- / corps -->
		</div>
		
		
	<%@include file="includeFile/footer.jsp" %>