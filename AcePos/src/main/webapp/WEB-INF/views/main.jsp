<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
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
       <%@ include file="section.jsp"%>
    </section>
    <footer>
        <%@ include file="footer.jsp"%>
    </footer>
</body> 
</html>