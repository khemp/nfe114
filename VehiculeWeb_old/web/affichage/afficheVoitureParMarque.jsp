<%-- 
    Document   : afficheVoitureParMarque
    Created on : Feb 14, 2010, 5:21:37 PM
    Author     : khemp
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultat recherche par marque</title>
    </head>
    <body>
        <h1>Voici la resultat de la requete de voiture par marque</h1>
        <p>Marque de la voiture recherche: <bean:write name="rechercheVehiculeParMarque" property="marque" />.</p>

    </body>
</html>
