<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %> 
<html lang="en">
<head>
<meta charset="UTF-8">
    <!-- Access the bootstrap Css like this,
        Spring boot will handle the resource mapping automcatically -->
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!--
    <spring:url value="/css/main.css" var="springCss" />
    <link href="${springCss}" rel="stylesheet" />
     -->
    <c:url value="/css/main.css" var="jstlCss" />
    <link href="${jstlCss }" rel="stylesheet" />
</head>
<body>
    <nav class="navbar navbar-inverse">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Spring Boot</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <div class="starter-template">
            <h1>Spring Boot Web JSP Example</h1>
            <h2>Message: ${message }</h2>
        </div>
    </div>
</body>
</html> --%>