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
                <c:forEach var="customerDto" items="${customersList}">
                    <tr>
                        <td>FirstName: </td>
                        <td>LastName: </td>
                        <td>Age: </td>
                        <td>Email: </td>
                        <td>Sex: </td>
                    </tr>
                    <tr>
                        <td>${customerDto.person.firstName}</td>
                        <td>${customerDto.person.lastName}</td>
                        <td>${customerDto.person.age}</td>
                        <td>${customerDto.person.email}</td>
                        <td>${customerDto.person.sex}</td>
                        
                    </tr>

                </c:forEach>
            </table>
        </section>
        <footer>
            <%@ include file="footer.jsp"%>
        </footer>

    </body>
</html>
