<%-- 
    Document   : login
    Created on : Feb 14, 2010, 3:06:51 PM
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
        <title>login form</title>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
    </head>
    <body>
        <h1>login form</h1>
        <html:form action="/login">
            <table border="1">
                <tbody>
                    <tr>
                        <td colspan="2">
                            <bean:write name="LoginForm" property="error" filter="false"/>
                            &nbsp;</td>
                    </tr>
                    <tr>
                        <td>Votre login</td>
                        <td><html:text property="login"></html:text> </td>
                    </tr>
                    <tr>
                        <td>E-mail</td>
                        <td><html:text property="email"></html:text></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="Login" /></td>
                    </tr>
                </tbody>
            </table>
        </html:form>
    </body>
</html>
