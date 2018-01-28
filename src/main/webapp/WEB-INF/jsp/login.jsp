
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>

<head> 
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
      <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"> 
      <title>Products</title> 
</head>

<body>

	<section> 
            <div class="jumbotron"> 
               <div class="container"> 
                  <h1>Welcome to Web Store!</h1> 
                  <p>The one and only amazing web store</p> 
               </div> 
            </div> 
         </section>

 <div class="container">
 	<div class="row">
 		<div class="col-md-4 col-md-offset-4">
     <div class="panel panel-default">
 		
    <div class="panel-heading">
 			<h3 class="panel-title">Please sign in</h3>
 		</div>

 		<div class="panel-body">
 			<c:url var="loginUrl" value="/login"/>
 			
 			<form action="${loginUrl}" method="post" class="form-horizontal">
 				
 				<c:if test="${param.erro != null}"> 
                              <div class="alert alert-danger"> 
                                 <p>Invalid username and password.</p> 
                              </div> 
        </c:if>
        <c:if test="${param.logout != null}"> 
                              <div class="alert alert-success"> 
                                 <p>You have been logged out successfully.</p> 
                              </div> 
                           </c:if>

         <c:if test="${param.accessDenied != null}"> 
                              <div class="alert alert-danger"> 
                                 <p>Access Denied: You are not authorised! </p> 
                              </div> 
                           </c:if>

                 <div class="input-group input-sm">
                <label class="input-group-addon" for="usrname"><i class="fa fa-user"></i></label>
                 <input type="text" class="form-comtrol" id="userId" name="userId" placeholder="Enter username" required>
                 </div>

                 <div class="input-group input-sm">
                 <label class="input-group-addon" for="password"><i class="fa fa-user"></i></label>
                <input type="text" class="form-comtrol" id="password" name="password" placeholder="Enter Password" required>
                 </div>
                 
                 <div class="form-actions"> 
                        <input type="submit" class="btn btn-block btn-primary btn-default" value="Log in">
                </div>

      </form>
 		</div>
 	</div>
 	</div>
 </div>
</div>
</body>
</html>
