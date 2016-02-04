<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a Employee</title>
    </head>
    <body>
        <form:form commandName="employeeBean" action="employeeList" method="post">
            <table>
                <tr>
                    <td>FirstName: </td>
                    <td><form:input type="text" path="firstName" /> </td>
                </tr>
               <tr>
                    <td>LastName: </td>
                    <td><form:input type="text" path="lastName" /> </td>
                </tr>
                <tr>
                    <td>Age: </td>
                    <td><form:input type="text" path="age" /> </td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><form:input type="text" path="email" /> </td>
                </tr>
                <tr>
                    <td>UserName: </td>
                    <td><form:input type="text" path="userName" /> </td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><form:input type="text" path="password" /> </td>
                </tr>
                <tr>
                    <td>Sex: </td>
                    <td><form:input type="text" path="password" /> </td>
                </tr>
            </table>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>