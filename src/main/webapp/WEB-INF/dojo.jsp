<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <%@ page isErrorPage="true" %>
                <!DOCTYPE html>
                <html>

                <head>
                    <meta charset="ISO-8859-1">
                    <link rel="stylesheet" type="text/css" href="/css/dojo.css">
                    <title>New dojo</title>

                </head>

                <body>
                    <div class="dojo">
                        <h1>New Dojo</h1>
                        <form:form class="dojo__form" action="/dojos/new" method="post" modelAttribute="dojo">
                            <input type="hidden" name="_method" value="post">
                            <form:errors class="error" path="name" />
                            <div class="form__div">
                                <form:label path="name">Name:</form:label>
                                <form:input path="name"></form:input>
                            </div>

                            <input class="form__button" type="submit" value="Create">
                        </form:form>
                    </div>

                </body>

                </html>