<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title> Products </title>
</head>
<body>

<section>
	<div class="jumbotron">
		<div class="container">
			<h1>Customers</h1>
			<p>All Customers</p>
		</div>
	</div>

</section>

<section class="container">

	<div class= 'row'>

		<c:forEach items="${customers}" var="customer">
		<div class="col-sm-6 col-md-3">
			<div class="thumbnail">
				<div class="caption">
					<h3>${customer.name}</h3>
					<p>${customer.customerId}</p>
					<p>${customer.address}</p>
					</div>
					</div>
					</div>
					</c:forEach>
					</div>
	</div>
</section>

</body>
</html>