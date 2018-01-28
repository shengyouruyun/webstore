<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Customers</title>
</head>
<body>
	<section>
	<div class="jumbotron">
		<div class="container">
			<h1>Customers</h1>
			<p>Add Customers</p>
		</div>
	</div>

	</section>

	<section class="container">
		<form:form method="POST" modelAttribute="newCustomer" class="form-horizontal">
		<fieldset>

			<legend> Add New</legend>
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="productId"><spring:message code="addCustomer.form.customerId.label"/></label>
				<div class="col-lg-10">
					<form:input id="customerId" path="customerId" type="text" class="form:input-large"/>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="name"><spring:message code="addCustomer.form.cusname.label"/></label>
				<div class="col-lg-10">
					<form:input id="name" path="name" type="text" class="form:input-large"/>

				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="unitPrice"><spring:message code="addCustomer.form.address.label"/></label>
				<div class="col-lg-10">
					<form:input id="address" path="address" type="text" class="form:input-large"/>

				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="manufacturer"><spring:message code="addCustomer.form.orderNum.label"/></label>
				<div class="col-lg-10">
					<form:input id="orderNum" path="orderNum" type="text" class="form:input-large"/>
				</div>
			

			<div class="form-group"> 
                     <div class="col-lg-offset-2 col-lg-10"> 
                        <input type="submit" id="btnAdd" class="btn 
                         btn-primary" value ="Add"/> 
                     </div> 
		</fieldset>
	 </form:form>
	</section>
</body>
</html>