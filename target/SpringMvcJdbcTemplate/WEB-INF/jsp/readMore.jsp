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
<title>information</title>
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





			<article class="cols marg_right1">

				<span class="font1" id="readMore">Présentation</span>
				<ul id="readMore">
					<li>Cette année, le département de Mathématiques et
						Informatique organisera ses Doctoriales du 04 au 06 juin 2018 au
						campus C de l’université de Dschang.</li>
					<li>Ce séminaire entre dans le cadre des formations proposées
						aux doctorants de l’Université de Dschang pour réfléchir à leur
						projet et se préparer à "l'après-thèse".</li>
					<li>Les Doctoriales sont une véritable formation à la
						valorisation des projets et produits de recherche ainsi que de
						leurs impacts sur la technologie et le monde socio-professionnel</li>
					<li>Les inscriptions sont ouvertes jusqu'au <b><a
						href="${pageContext.request.contextPath}/registration">15 mai
							2018</a></b> à l’adresse
					</li>

				</ul>


			</article>

			<article class="cols marg_right1">
				<span class="font1">Les objectifs pour les participants</span>
				<ul  id="readMore">
					<li>La thèse est considérée comme une expérience
						professionnelle : les doctorants doivent pouvoir en tirer le
						meilleur parti, notamment pour préparer l'après thèse</li>
					<li>Les débouchés le plus souvent souhaité par les doctorants
						sont un poste d'enseignant-chercheur, ou de chercheur dans un
						organisme de recherche public ou privé. En fait, les situations
						professionnelles ouvertes par le doctorat sont beaucoup plus
						larges, tant vers le secteur public que vers le secteur privé</li>
					<li>Les Doctoriales ont donc pour objectif de sensibiliser les
						doctorants aux différentes opportunités de carrière qui s'offrent
						à eux</li>
					<li>Ameliorer ses capacites a presenter</li>

				</ul>
			</article>

			<article class="cols marg_right1">

				<span class="font1">Pourquoi les doctoriales?</span>
				<ul id="readMore">
					<li>La thèse est considérée comme une expérience
						professionnelle : les doctorants doivent pouvoir en tirer le
						meilleur parti, notamment pour préparer l'après thèse</li>
					<li>Les débouchés le plus souvent souhaité par les doctorants
						sont un poste d'enseignant-chercheur, ou de chercheur dans un
						organisme de recherche public ou privé. En fait, les situations
						professionnelles ouvertes par le doctorat sont beaucoup plus
						larges, tant vers le secteur public que vers le secteur privé</li>
					<li>Les Doctoriales ont donc pour objectif de sensibiliser les
						doctorants aux différentes opportunités de carrière qui s'offrent
						à eux</li>
					<li>Ameliorer ses capacites a presenter</li>

				</ul>
			</article>

			<article class="cols marg_right1">

				<span class="font1">Pourquoi les doctoriales?</span>
					<ul id="readMore">
						<li>s'ouvrir au monde sociologique</li>
						<li>prendre conscience de ses acquis</li>
						<li>defendre des travaux de recherche</li>
						<li>Ameliorer ses capacites a presenter</li>
						<li>Se preparer a l'apres thèse</li>
					</ul>
			</article>
		</div>

		<%@include file="includeFile/footer.jsp" %>