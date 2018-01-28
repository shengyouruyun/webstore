
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Welcome</title>
</head>
<body>
<section>
	<div class="jumbotron">
		<div class="container">
		<h1 class="alert alert-danger"> There is no product found with the Product id ${invalidProductId}</h1>
		</div>
	</div>
</section>


<section>
	
<div class="container">
	<p>${url}</p>
	<p>${exception}</P>

</div>

	<div class="container">
		<p> <a href="<spring:url value="/market/products"/>" class="btn btn-primary"><span class="glyphicon-hand-left glyphicon"> </span> products </a>
			
		</p>
	</div>

</section>
</body>
</html>
