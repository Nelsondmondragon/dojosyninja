<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!-- <%@ page isErrorPage="true" %> -->
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <link rel="stylesheet" type="text/css" href="/css/ninjadojo.css">
                <title>New dojo</title>

            </head>

            <body>
                <div class="container">


                    <h1>${dojo.getName()} Ninjas</h1>

                    <table class="table">
                        <thead>
                            <tr>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Age</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${ninjas}" var="ninja" >
                            <tr>
                                <th>${ninja.getFirstName()}</th>
                                <th>${ninja.getLastName()}</th>
                                <th>${ninja.getAge()}</th>
                            </tr>

                            </c:forEach>

                        </tbody>
                    </table>
                </div>

            </body>

            </html>