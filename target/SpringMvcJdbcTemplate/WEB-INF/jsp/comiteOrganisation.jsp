<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.bocobi2.model.User"%>
<%@ page import="com.bocobi2.model.Student"%>
<%@ page import="com.bocobi2.model.Article"%>
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

	<div class="body2" WITH="70%" align="justify">
	<H2>Comité d'organisation</H2>
		<ol>
			<li>Pr Emmanuel NGAMENI</li>
			<li>Pr Marcellin Julius NKENLIFACK</li>
			<li>Pr Célestin LELE</li>
			<li>Pr Clémentin TAYOU DJAMEGNI</li>
			
			<li>Pr Calvin TADMON</li>
			<li>Pr Jean Louis WOUKENG</li>

			<li>Dr Benoit Martin AZANGUEZET</li>
			<li>Dr Alain Bertrand BOMGNI</li>
			<li>Dr Gabriel DEUGOUE</li>
			<li>Dr Pascaline DICKMU LIAKEN</li>
			<li>Dr David DONGO</li>
			<li>Dr Éric FOTSING</li>
			<li>Dr Bernard FOTSING TALLA</li>
			<li>Dr Vianney KENGNE TCHENDJI</li>
			<li>Dr Blaise Blériot KOGUEP NJIONOU</li>
			<li>Dr Cletus KUM</li>
			<li>Dr Jean Pierre LIENOU</li>
			<li>Dr Guiléne MPAME</li>
			<li>Dr Thierry NOULAMO</li>
			<li>Dr Mathias ONABID</li>
			<li>Dr Jean Baptiste PATENOU</li>
			<li>Dr Elie TAGNE FUTE</li>
			<li>Dr Narcisse TALLA TANKAM</li>
			<li>Dr Calvin TCHEKA</li>
			<li>Dr Laurent TCHOUALAG</li>
			<li>Dr Maurice TCHOUPE TCHENDJI</li>
			<li>Dr Berge TSANOU</li> 
			<h2>Secrétariat Scientifique</h2>


			<li>Dr Géraud FOKOU PELAP</li>
			<li>Dr Maurice KENFACK NANGHO</li>
			<li>M. Mathurin SOH</li>

			<li>Dr Francis DJIOFACK</li>
			<li>M. Miguel Landry FOKO SINDJOUNG</li>

		</ol>
	</div>
	

		<%@include file="includeFile/footer.jsp" %>