<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.bocobi2.model.User"%>
<%@ page import="com.bocobi2.model.Student"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Inscription</title>
<meta charset="utf-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/reset.css"
	type="text/css" media="all">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/layout.css"
	type="text/css" media="all">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"
	type="text/css" media="all">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/formulaire.css"
	type="text/css" media="all">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	type="text/css" media="all">
</head>

<body id="page1">
	<div class="body1">
		<!--div class="container">
			<!-- header -->
		<%-- <%@include file="includeFile/header.jsp" %> --%>
		<header>
			<%-- <%@include file="includeFile/navIndex.jsp" %> --%>
			<div class="container">
				<nav>
					<ul id="menu">
						<li><a href="${pageContext.request.contextPath}/">Accueil</a></li>
						<li><a href="${pageContext.request.contextPath}/registration">Inscription</a></li>
						<li><a
							href="${pageContext.request.contextPath}/uploadArticle">Soumettre
								un article</a></li>
						<li><a
							href="${pageContext.request.contextPath}/updateParameter">modifier
								vos parametres</a></li>
						<li><a href="${pageContext.request.contextPath}/updateArticle">Modifier
								un article</a></li>
					</ul>
				</nav>
			
			</div>
			<figure>
				<a href="#"><img
					src="${pageContext.request.contextPath}/resources/css/doctoriales2018.jpg"
					alt="" width="100%" height="477px"></a>
			</figure>

		</header>
		<!-- / header -->
	</div>
	</div>
	<div class="body2">

		<div class="main1">
			<div class="main2">

				<div id="monformulaire">
					<article class="cols marg_right1">

						<span class="font1">Présentation</span>
						<p>Cette année, le département de Mathématiques et
							Informatique organisera ses Doctoriales du 04 au 06 juin 2018 au
							campus C de l’université de Dschang...
							Les inscriptions sont ouvertes jusqu'au 15 mai 2018 à l’adresse</p>
						<a href="${pageContext.request.contextPath}/readMore" class="button"><span><span>Read More</span></span></a>

					</article>
				</div>
				<div id="monformulaire">
					<article class="cols marg_right1">
						<span class="font1">Les objectifs pour les participants</span>
						<p>Les débouchés le plus souvent souhaité par les doctorants
							sont un poste d'enseignant-chercheur, ou de chercheur dans un
							organisme de recherche public ou privé...</p>
						<a href="${pageContext.request.contextPath}/readMore" class="button"><span><span>Read More</span></span></a>

					</article>
				</div>
				<div id="monformulaire">
					<article class="cols marg_right1">

						<span class="font1">Pourquoi les doctoriales?</span>
						<p>Les doctorants doivent pouvoir en tirer le meilleur parti,
							notamment pour préparer l'après thèse Les Doctoriales ont donc
							pour objectif de sensibiliser les doctorants aux différentes
							opportunités de carrière qui s'offrent à eux...</p>
						<a href="${pageContext.request.contextPath}/readMore" class="button"><span><span>Read More</span></span></a>

					</article>

				</div>
				<div id="monformulaire">
					<article class="cols marg_right1">

						<span class="font1">Informatique</span>
						<p>Learn Center Template goes with two packages – with PSD
							source files and without them. PSD source files are available for
							free for the registered members of Templates.com. The basic
							package (without PSD source is available for anyone without
							registration).</p>
						<a href="${pageContext.request.contextPath}/readMore" class="button"><span><span>Read More</span></span></a>

					</article>

				</div>


			</div>
			<div class="main3">

				<div class="pad_left1">
					<h2>Information récentes</h2>
				</div>
				<ul class="list1">
<%-- 					<li><a href="${pageContext.request.contextPath}/resources/Doctoriales.zip">Télécharger le template des articles</a></li> --%>
					<li><a href="${pageContext.request.contextPath}/resources/TemplateDoctoriales2018.rar">Télécharger le template des articles</a></li>
					<li><a href="${pageContext.request.contextPath}/comiteOrganisation">Comité d'organisation</a></li>
					<li><a href="${pageContext.request.contextPath}/listeParticipants">Liste des participants </a></li>
					<li><a href="#">Améliorer ses capacités a présenter</a></li>
					<li><a href="#">Se préparer a l'après thèse</a></li>
				</ul>



			</div>

		</div>
	<%@include file="includeFile/footer.jsp" %>