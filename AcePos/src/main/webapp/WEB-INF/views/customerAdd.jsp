<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a Customer</title>
        <link href="<j:url value="/resources/theme1/css/mainstyle.css" />" rel="stylesheet">
    </head>

    <body>
        <header>
            <%@ include file="header.jsp"%>
        </header>
        <nav>
            <%@ include file="menu.jsp"%>
        </nav>
        <section>
            <form:form commandName="customerBean" action="customerAdd" method="post">
                <fieldset>
                    <legend>Add Customer</legend>
                    <table>
                        <tr>
                            <td>First Name: </td>
                            <td><form:input type="text" path="firstName" /> </td>
                        </tr>
                        <tr>
                            <td>Last Name: </td>
                            <td><form:input type="text" path="lastName" /> </td>
                        </tr>
                        <tr>
                            <td>Age: </td>
                            <td><form:input type="text" path="age" /> </td>
                        </tr>
                        <tr>
                            <td>Phone Number: </td>
                            <td><form:input type="text" path="landLinePhone" /> </td>
                        </tr>
                        <tr>
                            <td>Mobile Phone: </td>
                            <td><form:input path="mobilePhone" /> </td>
                        </tr>
                        <tr>
                            <td>Email: </td>
                            <td><form:input type="text" path="email" /> </td>
                        </tr>
                        <tr>
                            <td>Username: </td>
                            <td><form:input type="text" path="userName" /> </td>
                        </tr>
                        <tr>
                            <td>Password: </td>
                            <td><form:password path="password" /> </td>
                        </tr>
                        <tr>
                            <td>Customer Type </td>
                            <td><form:input type="text" path="typeOfCustomer" /> </td>
                        </tr>
                        <tr>
                            <td>Reference: </td>
                            <td><form:input type="text" path="reference" /> </td>
                        </tr>
                        <tr>
                            <td>Sex: </td>
                            <td><label><form:radiobutton path="sex" value="M"/>Male</label> 
                                <label><form:radiobutton path="sex" value="F"/>Female</label></td>
                        </tr>


                    </table>
                    <input type="submit" value="Submit"/>
                    <a href="main">Cancel</a>
                </fieldset>
            </form:form>
        </section>
        <footer>
            <%@ include file="footer.jsp"%>
        </footer>

    </body>
</html>