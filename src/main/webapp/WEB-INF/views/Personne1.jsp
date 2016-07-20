<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Ajouter une personne</title>
<!-- Bootstrap Core CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
   

<!-- Theme CSS -->


<!-- Custom Fonts -->

<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"	rel="stylesheet" type="text/css">

		<!-- Lien javascript ( dropdown fonction par exemple) -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>


</head>
<style>
<%@include file="../../../resources/css/style.css"%>
</style>

</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">EASY HOTEL</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Chambre <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Chambre1">Ajouter une chambre</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Chambre2">Supprimer une chambre</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Chambre3">Modifier une chambre</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Chambre4">Selectionner une chambre</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Chambre5">La liste des chambres</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Chambre6">La liste des chambres disponibles</a></li>            
          </ul>
        </li>
      </ul>
      
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Consommation <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Consommation1">Ajouter une consommation</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Consommation2">Obtenir les consos de produits</a></li>           
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Facture <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Facture1">Ajouter une facture</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Facture2">Trouver les factures d'un client</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Facture3">Le co�t annuel par client</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Facture4">Le co�t semestriel par client</a></li>            
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Hotel <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Hotel1">AJouter un hotel</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Hotel2">Les employ�s d'un h�tel</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Hotel3">Les clients d'un h�tel</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Hotel4">Le b�n�fice par ann�e</a></li>             
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Paiement <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Paiement">Ajouter un paiement</a></li>           
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Personne <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Personne1">Ajouter une personne</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Personne2">Modifier une personne</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Personne3">Supprimer une personne</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Personne4">Chercher une personne par son identifiant</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Personne5">La liste de toutes les personnes</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Personne6">Chercher des personnes par mot cl�</a></li>            
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Produit <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Produit1">Ajouter un produit</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Produit2">Modifier un produit</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Produit3">Supprimer un produit</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Produit4">La liste des produits</a></li> 
            <li role="separator" class="divider"></li>
            <li><a href="Produit5">Chercher un produit</a></li>           
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">R�servation <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Reservation1">Ajouter une r�servation</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Reservation2">La liste des r�servations par client</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Reservation3">Supprimer une r�servation</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Reservation4">Modifier une r�servation</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Reservation5">Chercher une r�servation</a></li> 
            <li role="separator" class="divider"></li>
            <li><a href="Reservation6">Chercher les r�servations d'une chambre</a></li> 
            <li role="separator" class="divider"></li>
            <li><a href="Reservation7">Afficher le co�t d'une r�servation</a></li> 
            <li role="separator" class="divider"></li>
            <li><a href="Reservation8">Afficher le co�t de toutes les r�servations</a></li> 
            <li role="separator" class="divider"></li>
            <li><a href="Reservation9">Le stock des produits</a></li>             
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

	<br>

	<f:form modelAttribute="modelPersonne" action="addClient" method="POST">
		<td><f:input type="submit" value="Ajouter un client" path="" class="btn btn-default" /></td>
	</f:form>
	<br>
	<f:form modelAttribute="modelPersonne" action="addEmploye" method="POST">
		<td><f:input type="submit" value="Ajouter un employ�" path="" class="btn btn-default" /></td>
	</f:form>


</body>
</html>