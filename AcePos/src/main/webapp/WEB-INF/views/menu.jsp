<%-- 
    Document   : index
    Created on : Feb 2, 2016, 8:02:11 AM
    Author     : nizomiddin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                margin: 0;
            }

            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                background-color: #f1f1f1;
                height: 100%;
                overflow: auto;
            }

            li a {
                display: block;
                color: #000;
                padding: 8px 0 8px 16px;
                text-decoration: none;
            }

            li a.active {
                background-color: #4CAF50;
                color: white;
            }

            li a:hover:not(.active) {
                background-color: #555;
                color: white;
            }
        </style>
    </head>
    <body>

        <ul>
            <li><a class="active">Menu</a></li>
            <li><a href="/bills.htm">Bills</a></li>
            <li><a>Stock</a></li>
            <li><a>Invoice</a></li>
            <li><a>Search</a></li>
            <li><a>Reports</a></li>
        </ul>
    </body>
</html>
