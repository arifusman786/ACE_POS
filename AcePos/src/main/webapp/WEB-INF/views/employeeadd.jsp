<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
<form:form method="POST">
   <table>
    <tr>
        <td><form:label path="">Name</form:label></td>
        <td><form:input path=""/></td>
    </tr>
    </table>  
</form:form>
</body>
</html>