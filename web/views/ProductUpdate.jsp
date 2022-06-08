<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
<p><strong>Update Here | <a href="../read">Click for Read</a></strong></p>
<form action="../update" method="post">
<pre>
<c:forEach var="person" items="${personList}">

    Id:    	<input type="text" name="dispId" value="${person.id}" disabled="disabled"/>
    <input type="hidden" name="id" value="${person.id}"/>
    Name:  	<input type="text" name="fullname" value="${person.fullname}" />

    Email: 	<input type="text" name="age" value="${person.age}" />

    Course:	<input type="text" name="phone_number" value="${person.phoneNumber}" />

    <input type="submit" value="Update" />
</c:forEach>
</pre>
</form>
${msg}
</body>
</html>