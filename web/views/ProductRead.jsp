<%--
  Created by IntelliJ IDEA.
  User: Husniddin
  Date: 6/3/2022
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
<p><strong>Person List is Here | <a href="ProductsCreate.jsp">Click for Create</a></strong></p>
<table border="1">
    <tr>
        <th>id</th>
        <th>fullname</th>
        <th>age</th>
        <th>phone_number</th>
        <th>Action</th>
    </tr>
    <c:forEach var="person" items="${personList}">
        <tr>
            <td>${person.id}</td>
            <td>${person.fullname}</td>
            <td>${person.age}</td>
            <td>${person.phoneNumber}</td>
            <td><a href="update/<c:out value='${person.id}'/>">Update</a> ||| <a
                    href="delete/<c:out value='${person.id}'/>">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
