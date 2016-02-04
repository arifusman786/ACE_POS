<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="/resources/theme1/css/mainstyle.css" />" rel="stylesheet">

        <style>
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
                text-align: left;
            }
            table#t01 {
                width: 100%;    
                background-color: #f1f1c1;
            }
        </style>
    </head>
    <body>
        <header>
            <%@ include file="header.jsp"%>
        </header>
        <nav>
            <%@ include file="menu.jsp"%>
        </nav>
        <section>
            <table style="width:100%" border="1" >
                <tr>
                    <td style="font-size: large; font-weight: bold">FirstName: </td>
                    <td style="font-size: large; font-weight: bold">LastName: </td>
                    <td style="font-size: large; font-weight: bold">Age: </td>
                    <td style="font-size: large; font-weight: bold">Email: </td>
                    <td style="font-size: large; font-weight: bold">Customer Type </td>
                    <td style="font-size: large; font-weight: bold">Customer Reference </td>
                </tr>
                <c:forEach var="customerDto" items="${customersList}">

                    <tr>
                        <td>${customerDto.person.firstName}</td>
                        <td>${customerDto.person.lastName}</td>
                        <td>${customerDto.person.age}</td>
                        <td>${customerDto.person.email}</td>
                        <td>${customerDto.customer.typeOfCustomer}</td>
                        <td>${customerDto.customer.referance}</td>
                    </tr>

                </c:forEach>
            </table>
        </section>
        <footer>
            <%@ include file="footer.jsp"%>
        </footer>

    </body>
</html>
