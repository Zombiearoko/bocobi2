<%@include file="includeFile/header.jsp"%>
<div id="slogan">
	<span>Les enseignants dont le grade est <b>Enseignant</b>
		doivent mettre à jour leurs informations afin de spécifier leur grade
		réel
	</span> <span>Les étudiants dont le niveau est <b>Doctorant</b> doivent
		mettre à jour leurs informations afin de spécifier leur niveau réel
	</span>
</div>
</header>
<!-- header-->


<div class="container">
	<div align="center">
		<h1>Liste des étudiants inscrits en Informatique</h1>
		<table border="1" width="90%">
			<th width="2%">#</th>
			<th width="20%">Noms et Prénoms</th>
			<th width="8%">Sexe</th>
			<th width="15%">Email</th>
			<th width="5%">Niveau</th>
			<th width="20%">Université</th>
			<th width="10%">Option</th>
			<th width="30%">Laboratoire</th>

			<c:forEach var="student" items="${studentList}" varStatus="status">
				<c:if test="${student.getOption()=='Informatique'}">
					<tr>
						<td>${student.getInscriptionCode()}</td>
						<td>${student.getUserLastName()}&nbsp;
							${student.getUserFirstName()}</td>
						<td>${student.getSexe()}</td>
						<td>${student.getUserEmail()}</td>
						<td>${student.getStudentLevel()}</td>
						<td>${student.getUniversityName()}</td>
						<td>${student.getOption()}</td>
						<td>${student.getLaboratoire()}</td>
					</tr>
				</c:if>
			</c:forEach>
		</table>

		<h1>Liste des étudiants inscrits en Mathématique Option Algèbre</h1>
		<table border="1" width="90%">
			<th width="2%">#</th>
			<th width="20%">Noms et Prénoms</th>
			<th width="8%">Sexe</th>
			<th width="15%">Email</th>
			<th width="5%">Niveau</th>
			<th width="20%">Université</th>
			<th width="10%">Option</th>
			<th width="30%">Laboratoire</th>

			<c:forEach var="student" items="${studentList}" varStatus="status3">
				<%! int compteur =0; %>
				<c:if test="${student.getOption()=='Maths-algebre'}">
					<tr>
						<td>${student.getInscriptionCode()}</td>
						<td>${student.getUserLastName()}&nbsp;
							${student.getUserFirstName()}</td>
						<td>${student.getSexe()}</td>
						<td>${student.getUserEmail()}</td>
						<td>${student.getStudentLevel()}</td>
						<td>${student.getUniversityName()}</td>
						<td>${student.getOption()}</td>
						<td>${student.getLaboratoire()}</td>
					</tr>
				</c:if>
			</c:forEach>
		</table>

		<h1>Liste des étudiants inscrits en Mathématiues option Analyse</h1>
		<table border="1" width="90%">
			<th width="2%">#</th>
			<th width="20%">Noms et Prénoms</th>
			<th width="8%">Sexe</th>
			<th width="15%">Email</th>
			<th width="5%">Niveau</th>
			<th width="20%">Université</th>
			<th width="10%">Option</th>
			<th width="30%">Laboratoire</th>

			<c:forEach var="student" items="${studentList}" varStatus="status2">
				<c:if test="${student.getOption()=='Maths-analyse'}">
					<tr>
						<td>${student.getInscriptionCode()}</td>
						<td>${student.getUserLastName()}&nbsp;
							${student.getUserFirstName()}</td>
						<td>${student.getSexe()}</td>
						<td>${student.getUserEmail()}</td>
						<td>${student.getStudentLevel()}</td>
						<td>${student.getUniversityName()}</td>
						<td>${student.getOption()}</td>
						<td>${student.getLaboratoire()}</td>
					</tr>
				</c:if>
			</c:forEach>
		</table>
		<h1>Liste des Enseignants</h1>
		<table border="1" width="90%">
			<th width="2%">#</th>
			<th width="20%">Noms et Prénoms</th>
			<th width="8%">Sexe</th>
			<th width="15%">Email</th>
			<th width="5%">Grade</th>
			<th width="20%">Université</th>
			<th width="10%">Option</th>
			<th width="30%">Laboratoire</th>

			<c:forEach var="teacher" items="${teacherList}" varStatus="status1">
				<tr>
					<td>${status1.index + 1}</td>
					<td>${teacher.getUserLastName()}
						&nbsp;${teacher.getUserFirstName()}</td>
					<td>${teacher.getSexe()}</td>
					<td>${teacher.getUserEmail()}</td>
					<td>${teacher.getGrade()}</td>
					<td>${teacher.getUniversityName()}</td>
					<td>${teacher.getOption()}</td>
					<td>${teacher.getLaboratoire()}</td>
				</tr>
			</c:forEach>
		</table>
	</div>


	<%@include file="includeFile/footer.jsp"%>