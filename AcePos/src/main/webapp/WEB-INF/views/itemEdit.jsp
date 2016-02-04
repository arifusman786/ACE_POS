<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add an Item</title>
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
            <form:form commandName="addItemBean" action="itemAdd" method="post">
                <fieldset>
                    <form:select path="selectedItem">
                        <form:options items="${itemsList}" />
                    </form:select>
                    <legend>Update Item</legend>
                    <table>
                        <tr>
                            <td>Item Name: </td>
                            <td><form:input type="text" path="itemName" /> </td>
                        </tr>
                        <tr>
                            <td>Weight: </td>
                            <td><form:input type="text" path="weight" /> </td>
                        </tr>
                        <tr>
                            <td>Made: </td>
                            <td><form:input type="text" path="made" /> </td>
                        </tr>
                        <tr>
                            <td>Category: </td>
                            <td><form:input type="text" path="category" /> </td>
                        </tr>
                        <tr>
                            <td>Unit Grass Price: </td>
                            <td><form:input path="unitGrassPrice" /> </td>
                        </tr>
                        <tr>
                            <td>Measurement Unit: </td>
                            <td><form:input type="text" path="measurementUnit" /> </td>
                        </tr>
                        <tr>
                            <td>Unit Interest: </td>
                            <td><form:input type="text" path="unitInterest" /> </td>
                        </tr>
                        <tr>
                            <td>unit Discount: </td>
                            <td><form:input path="unitDiscount" /> </td>
                        </tr>
                        <tr>
                            <td>Unit Total Price </td>
                            <td><form:input type="text" path="unitTotalPrice" /> </td>
                        </tr>
                        <tr>
                            <td>Unit Size: </td>
                            <td><form:input type="text" path="unitSize" /> </td>
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