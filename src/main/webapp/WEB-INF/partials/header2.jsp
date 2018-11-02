<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!--[if IE 8]>          <html class="ie ie8"> <![endif]-->
<!--[if IE 9]>          <html class="ie ie9"> <![endif]-->
<!--[if gt IE 9]><!-->  <html> <!--<![endif]-->
<head>
    <!-- Page Title -->
    <title>Bocobi2</title>
    
    <!-- Meta Tags -->
    
    <meta charset="utf-8">
    <meta name="keywords" content="Emploi Cameroun Cameroon Recherche" />
    <meta name="author" content="BOCOBI2">
<%-- 	<meta http-equiv="Refresh" content="5; url=${pageContext.request.contextPath}/mon_compte"> --%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    
    <!-- Theme Styles -->
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
    <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/animate.min.css">
    
    <!-- Current Page Styles -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/components/jquery.bxslider/jquery.bxslider.css" media="screen" />
    
    <!-- Main Style -->
    <link id="main-style" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <c:if test="${ current_user==null }">
	<meta http-equiv="Refresh"
		content="1; url=${pageContext.request.contextPath}/mon_compte">
</c:if>
    <!-- Updated Styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/updates.css">

    <!-- Custom Styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/custom.css">
    
    <!-- Responsive Styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/responsive.css">
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dataTables.bootstrap.min.css">
    
    <!-- CSS for IE -->
    <!--[if lte IE 9]>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/ie.css" />
    <![endif]-->
    

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script type='text/javascript' src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
      <script type='text/javascript' src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.js"></script>
    <![endif]-->
    <style>
    	.material-switch > input[type="checkbox"] {
			    display: none;   
			}
			
			.material-switch > label {
			    cursor: pointer;
			    height: 0px;
			    position: relative; 
			    width: 40px;  
			}
			
			.material-switch > label::before {
			    background: rgb(0, 0, 0);
			    box-shadow: inset 0px 0px 10px rgba(0, 0, 0, 0.5);
			    border-radius: 8px;
			    content: '';
			    height: 16px;
			    margin-top: -8px;
			    position:absolute;
			    opacity: 0.3;
			    transition: all 0.4s ease-in-out;
			    width: 40px;
			}
			.material-switch > label::after {
			    background: rgb(255, 255, 255);
			    border-radius: 16px;
			    box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.3);
			    content: '';
			    height: 24px;
			    left: -4px;
			    margin-top: -8px;
			    position: absolute;
			    top: -4px;
			    transition: all 0.3s ease-in-out;
			    width: 24px;
			}
			.material-switch > input[type="checkbox"]:checked + label::before {
			    background: inherit;
			    opacity: 0.5;
			}
			.material-switch > input[type="checkbox"]:checked + label::after {
			    background: inherit;
			    left: 20px;
			}
    
    </style>
</head>
<body>
    
    <div id="page-wrapper">
        <header id="header" class="navbar-static-top">
        
    
        <div class="main-header">
    
            <a href="#mobile-menu-01" data-toggle="collapse" class="mobile-menu-toggle">
                 Mobile Menu Toggle
            </a>
    
            <div class="container">
                <h1 class="logo navbar-brand">
                    <a href="${pageContext.request.contextPath}/" title="BOCOBI2 - home">
                        <img src="images/logo.png" alt="Travelo HTML5 Template" />
                    </a>
                </h1>
    
                <nav id="main-menu" role="navigation">
                    <ul class="menu">
                    	<c:choose>
	                    	<c:when test="${ current_user.role == 'CHERCHEUREMPLOI' and not empty current_user }">
		                    	<li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/trouver_une_offre">Toutes les offres</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/mes_demandes">Mes offres</a>
		                        </li>
		                        <%-- <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/mes_cvs">Mes CVs</a>
		                        </li> --%>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/infos_chercheur_emploi">Mon compte</a>
		                        </li>
			                   <li class="menu-item-has-children">
			                       <a href="${pageContext.request.contextPath}/logout">Deconnexion</a>
			                   </li>
	                        </c:when>
	                        <c:when test="${ current_user.role == 'OFFREUREMPLOI' and not empty current_user }">
		                    	<li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/trouver_une_offre">Toutes les offres</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/mes_offres">Mes offres</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/poster_une_offre">Publier une offre</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/cv_theque">CV thèques</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/infos_offreur_emploi">Mon compte</a>
		                        </li>
			                   <li class="menu-item-has-children">
			                       <a href="${pageContext.request.contextPath}/logout">Deconnexion</a>
			                   </li>
	                        </c:when>
	                        <c:otherwise>
						        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/trouver_une_offre">Toutes les offres</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/connection">Connexion</a>
		                        </li>
						    </c:otherwise>
                        </c:choose>
                    </ul>
                </nav>
            </div>
    
            <nav id="mobile-menu-01" class="mobile-menu collapse">
	   			<ul class="menu">
               		<c:choose>
	                    	<c:when test="${ current_user.role == 'CHERCHEUREMPLOI' and not empty current_user }">
		                    	<li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/trouver_une_offre">Toutes les offres</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/mes_demandes">Mes offres</a>
		                        </li>
		                        <%-- <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/mes_cvs">Mes CVs</a>
		                        </li> --%>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/infos_chercheur_emploi">Mon compte</a>
		                        </li>
			                   <li class="menu-item-has-children">
			                       <a href="${pageContext.request.contextPath}/logout">Deconnexion</a>
			                   </li>
	                        </c:when>
	                        <c:when test="${ current_user.role == 'OFFREUREMPLOI' and not empty current_user }">
		                    	<li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/trouver_une_offre">Toutes les offres</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/mes_demandes">Mes offres</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/poster_une_offre">Publier une offre</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/cv_theque">CV thèques</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/infos_offreur_emploi">Mon compte</a>
		                        </li>
			                   <li class="menu-item-has-children">
			                       <a href="${pageContext.request.contextPath}/logout">Deconnexion</a>
			                   </li>
	                        </c:when>
	                        <c:otherwise>
						        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/trouver_une_offre">Toutes les offres</a>
		                        </li>
		                        <li class="menu-item-has-children">
		                            <a href="${pageContext.request.contextPath}/connection">Connexion</a>
		                        </li>
						    </c:otherwise>
                        </c:choose>
               </ul>
            </nav>
        </div>
