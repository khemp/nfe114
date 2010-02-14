<%--
    Document   : login
    Created on : Feb 14, 2010, 3:06:51 PM
    Author     : khemp
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body>
        <h1>formulaire de recherche par marque</h1>
        <html:form action="/RechercherVehiculeParMarque">
            <table border="1">
                <tbody>
                    <tr>
                        <td>marque du vehicule</td>
                        <td><html:text property="saisie"></html:text></td>

                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="rechercher" /></td>
                    </tr>
                </tbody>
            </table>
        </html:form>
    </body>
</html:html>
