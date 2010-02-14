<%-- 
    Document   : sucess
    Created on : Feb 14, 2010, 3:21:05 PM
    Author     : khemp
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Identification reussi</title>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
    <h1>Felicitation!</h1>

    <p>Vous etes maintenant authentifie</p>

    <p>votre nom est: <bean:write name="LoginForm" property="login" />.</p>

    <p>votre adress email est : <bean:write name="LoginForm" property="email" />.</p>
</body>