<%-- 
    Document   : RechercherVehiculeParMarque
    Created on : Feb 14, 2010, 9:25:47 PM
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <html:form action="/SaisieMarque">
            <table border="0">
                <tbody>
                    <tr>
                    <td></td>
                    <td><html:submit value="Marque" /></td>
                </tbody>
            </table>

            <html:submit value="Marque" />

        </html:form>
    </body>
</html>
