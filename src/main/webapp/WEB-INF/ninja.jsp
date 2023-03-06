<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!-- <%@ page isErrorPage="true" %> -->
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <link rel="stylesheet" type="text/css" href="/css/ninja.css">
                <title>New dojo</title>

            </head>

            <body>
                <div class="dojo">
                    <h1>New Ninja</h1>
                    <form:form class="dojo__form" action="" method="post" modelAttribute="ninja">
                        <input type="hidden" name="_method" value="post">


                        <div class="form__div">
                            <label>Dojo:</label>
                            <form:select class="select" path="dojosId">
                                <c:forEach items="${dojos}" var="dojo">
                                    <option value="${dojo.getId()}">${dojo.getName()}</option>
                                </c:forEach>
                            </form:select>
                        </div>
                        <form:errors class="error" path="firstName" />
                        <div class="form__div">
                            <form:label path="firstName">First Name:</form:label>
                            <form:input path="firstName"></form:input>
                        </div>


                        <form:errors class="error" path="lastName" />
                        <div class="form__div">
                            <form:label path="lastName">Last Name:</form:label>
                            <form:input path="lastName"></form:input>
                        </div>

                        <form:errors class="error" path="age" />
                        <div class="form__div">
                            <form:label path="age">age:</form:label>
                            <form:input type="number" min="0" path="age"></form:input>
                        </div>

                        <input class="form__button" type="submit" value="create">
                    </form:form>
                </div>

            </body>

            </html>