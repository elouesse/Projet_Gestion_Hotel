<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<title>Liste des clients</title>
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
            <li><a href="#">Ajouter une chambre</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Supprimer une chambre</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Modifier une chambre</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Selectionner une chambre</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">La liste des chambres</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">La liste des chambres disponibles</a></li>            
          </ul>
        </li>
      </ul>
      
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Consommation <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Ajouter une consommation</a></li>
            <li><a href="#">???</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>            
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Facture <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Ajouter une facture</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Trouver les factures d'un client</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Le coût annuel par client</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Le coût semestriel par client</a></li>            
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Hotel <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Hotel1">AJouter un hotel</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Hotel2">Les employés d'un hôtel</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="Hotel3">Les clients d'un hôtel</a></li>    
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Paiement <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Ajouter un paiement</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Le bénéfice par année</a></li>            
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Personne <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Ajouter une personne</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Supprimer une personne</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Chercher une personne par son identifiant</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">La liste de toutes les personnes</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Chercher des personnes par mot clé</a></li>            
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
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Réservation <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Ajouter une réservation</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">La liste des réservations par client</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Supprimer une réservation</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Modifier une réservation</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Chercher une réservation</a></li> 
            <li role="separator" class="divider"></li>
            <li><a href="#">Chercher les réservations d'une chambre</a></li> 
            <li role="separator" class="divider"></li>
            <li><a href="#">Afficher le coût d'une réservation</a></li> 
            <li role="separator" class="divider"></li>
            <li><a href="#">Afficher le coût de toutes les réservations</a></li> 
            <li role="separator" class="divider"></li>
            <li><a href="#">Le stock des produits</a></li>             
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

	<form action="getListCli" method="post">
<p> Heyyyyyyyyyy</p>
					<select name="idHotel" >
						<c:forEach items="${modelHotel.listeDesHotels}" var="h">
							<option value="${h.idHotel}">${h.idHotel}</option>
						</c:forEach>
					</select>
					
					<br><br>
					
					<button type="submit" class="btn btn-success btn-lg">Recherche clients</button>

<table id="tableau" class="table">
	
	  <tr class="danger">
			<th>Identidiant</th>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Date de Naissance</th>
			<th>Adresse</th>
			<th>Mail</th>
			<th>Numéro de tél</th>
			<th>Date inscription</th>
			<th>Réservations</th>
			<th>Réduction</th>
		</tr>		
				<c:forEach items="${modelHotel.listeDesPersonnes}" var="p">
					<tr class="info">
						<td>${p.idPersonne}</td>
						<td>${p.nomPersonne}</td>
						<td>${p.prenomPersonne}</td>
						<td>${p.dateDeNaissance}</td>
						<td>${p.adrPersonne}</td>
						<td>${p.adrEmail}</td>
						<td>${p.numeroTelephone}</td>
						<td>${p.dateInscription}</td>
						<td>${p.nombreReservation}</td>
						<td>${p.reduction}</td>
					</tr>
				</c:forEach>
	</table>
	
	</form>









</body>
</html>