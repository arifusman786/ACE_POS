<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="/resources/theme1/css/mainstyle.css" />" rel="stylesheet">
    </head>
    <body>
        <header>
            <%@ include file="header.jsp"%>
        </header>
        <nav>
            <%@ include file="menu.jsp"%>
        </nav>
        <section>
             <table>
                <c:forEach var="employeeDto" items="${employeeList}">
                    <tr>
                        <td>FirstName: </td>
                        <td>LastName: </td>
                        <td>Age: </td>
                        <td>Email: </td>
                        <td>Sex: </td>
                        <td>Designation: </td>
                        <td>Reference: </td>
                        <td>Type: </td>
                    </tr>
                    <tr>
                        <td>${employeeDto.person.firstName}</td>
                        <td>${employeeDto.person.lastName}</td>
                        <td>${employeeDto.person.age}</td>
                        <td>${employeeDto.person.email}</td>
                     
                    </tr>

                </c:forEach>
            </table>
        </section>
        <footer>
            <%@ include file="footer.jsp"%>
        </footer>

    </body>
</html>
