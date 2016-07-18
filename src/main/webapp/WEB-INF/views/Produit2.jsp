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

<title>Modifier un produit</title>
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
            <li><a href="#">AJouter un hotel</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Les employés d'un hôtel</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#"><li><a href="#">Les clients d'un hôtel</a></li></a></li>            
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

<p> Heyyyyyyyyyy</p>


<f:form modelAttribute="modelProduit" action="updateProduit" method="POST">
<select name="idProduit" >
						<c:forEach items="${modelProduit.listeProduit}" var="b">
							<option value="${b.idProduit}">${b.idProduit}</option>
						</c:forEach>
					</select>




		<table>
		<!-- 	<tr>
				<th>Prix</th>
				<th>Nom</th>
				<th>Référence</th>
				<th>Quantité</th>
			</tr> -->
			<tr>
				<td>Prix :</td>
				<td><f:input type ="text" path="prixProduit" class="form-control"/></td>
				<td><f:errors path="prixProduit"></f:errors></td>
			</tr>
			<tr>
				<td>Nom :</td>
				<td><f:input type ="text" path="nomProduit" class="form-control"/></td>
				<td><f:errors path="nomProduit"></f:errors></td>
			</tr>
			<tr>
				<td>Référence :</td>
				<td><f:input type ="text" path="referenceProduit" class="form-control"/></td>
				<td><f:errors path="referenceProduit"></f:errors></td>
			</tr>
			<tr>
				<td>Quantité :</td>
				<td><f:input type ="date" path="quantiteProduite" class="form-control"/></td>
				<td><f:errors path="quantiteProduite"></f:errors></td>
			</tr>
			</table>
				<br>
				<td><f:input type ="submit" value="Modifier produit" path="" class="btn btn-default"/></td>
		
	</f:form>
	
	<table id="tableau" class="table">
	
	  <tr class="danger">
			<th>Id produit</th>
			<th>Prix produit</th>
			<th>Nom</th>
			<th>Référence</th>
			<th>quantité</th>
		</tr>		
				<c:forEach items="${modelProduit.listeProduit}" var="p">
					<tr class="info">
						<td>${p.idProduit}</td>
						<td>${p.prixProduit}</td>
						<td>${p.nomProduit}</td>
						<td>${p.referenceProduit}</td>
						<td>${p.quantiteProduite}</td>
					</tr>
				</c:forEach>
	</table>

	<div class="container">
		<h2>Contextual Classes</h2>
		<p>Contextual classes can be used to color table rows or table
			cells. The classes that can be used are: .active, .success, .info,
			.warning, and .danger.</p>
		<table class="table">
			<thead>
				<tr>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<tr class="success">
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
				</tr>
				<tr class="info">
					<td>Mary</td>
					<td>Moe</td>
					<td>mary@example.com</td>
				</tr>
				<tr class="info">
					<td>July</td>
					<td>Dooley</td>
					<td>july@example.com</td>
				</tr>
			</tbody>
		</table>
	</div>

	
		<div class="form-group">
			<label for="email">Email address:</label> <input type="email"
				class="form-control" id="email">
		</div>
		<div class="form-group">
			<label for="pwd">Password:</label> <input type="password"
				class="form-control" id="pwd">
		</div>
		<div class="checkbox">
			<label><input type="checkbox"> Remember me</label>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>



</body>
</html>