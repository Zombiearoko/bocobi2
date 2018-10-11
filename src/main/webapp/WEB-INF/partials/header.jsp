<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
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
                    	<li class="menu-item-has-children">
                            <a href="${pageContext.request.contextPath}/trouver_une_offre">Toutes les offres</a>
                        </li>
                        <li class="menu-item-has-children">
                            <a href="${pageContext.request.contextPath}/mes_demandes">Mes offres</a>
                        </li>
                        <li class="menu-item-has-children">
                            <a href="${pageContext.request.contextPath}/mes_cvs">Mes CVs</a>
                        </li>
                        <li class="menu-item-has-children">
                            <a href="${pageContext.request.contextPath}/poster_une_offre">Publier une offre</a>
                        </li>
                        <li class="menu-item-has-children">
                            <a href="${pageContext.request.contextPath}/cv_theque">CV thèques</a>
                        </li>
                        <li class="menu-item-has-children">
                            <a href="#">Mon compte</a>
                        </li>
                        <!-- <li class="menu-item-has-children">
                            <a href="#">Nous contacter</a>
                        </li> -->
                        <li class="menu-item-has-children">
                            <a href="${pageContext.request.contextPath}/deconnection">Deconnexion</a>
                        </li>
                    </ul>
                </nav>
            </div>
    
            <nav id="mobile-menu-01" class="mobile-menu collapse">
	   			<ul class="menu">
               		<li class="menu-item-has-children">
                       <a href="${pageContext.request.contextPath}/trouver_une_offre">Toutes les offres</a>
                   </li>
                   <li class="menu-item-has-children">
                       <a href="${pageContext.request.contextPath}/mes_demandes">Mes offres</a>
                   </li>
                   <li class="menu-item-has-children">
                       <a href="${pageContext.request.contextPath}/mes_cvs">Mes CVs</a>
                   </li>
                   <li class="menu-item-has-children">
                       <a href="${pageContext.request.contextPath}/poster_une_offre">Publier une offre</a>
                   </li>
                   <li class="menu-item-has-children">
                       <a href="${pageContext.request.contextPath}/cv_theque">CV thèques</a>
                   </li>
                   <li class="menu-item-has-children">
                       <a href="#">Mon compte</a>
                   </li>
                   <!-- <li class="menu-item-has-children">
                       <a href="#">Nous contacter</a>
                   </li> -->
                   <li class="menu-item-has-children">
                       <a href="${pageContext.request.contextPath}/deconnection">Deconnexion</a>
                   </li>
               </ul>
            </nav>
        </div>
