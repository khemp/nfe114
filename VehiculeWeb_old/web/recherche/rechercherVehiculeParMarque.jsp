<%-- 
    Document   : rechercheVehiculeParMarque
    Created on : Feb 14, 2010, 5:14:17 PM
    Author     : khemp
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rechercher un vehicule par marque</title>
    </head>
    <body>
        <h1>Recherche par marque</h1>
        <html:form  action="/rechercheParMarque">
        <table border="1">
            <tbody>
                    <tr>
                        <td colspan="2">
                            <bean:write name="rechercheParMarqueForm" property="errorMarque" filter="false"/>
                            &nbsp;
                        </td>
                    </tr>                <tr>
                    <tr>
                        <td>Marque du vehicule</td>
                        <td><html:text property="marque"></html:text> </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="Login" /></td>
                    </tr>
                </tr>
            </tbody>
        </table>
        </html:form>
    </body>
</html>
