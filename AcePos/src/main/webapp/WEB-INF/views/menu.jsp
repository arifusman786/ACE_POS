<%-- 
    Document   : index
    Created on : Feb 2, 2016, 8:02:11 AM
    Author     : nizomiddin
--%>

<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html lang=''>
    <head>
        <meta charset='utf-8'>
        <link href="<d:url value="/resources/theme1/css/menustyles.css" />" rel="stylesheet">
        <link href="<d:url value="/resources/theme1/css/nav.css" />" rel="stylesheet">
        <title>Menu</title>
        <meta charset='utf-8'>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="<d:url value="http://code.jquery.com/jquery-latest.min.js" />"></script>
        <script src="<d:url value="/resources/theme1/js/script.js" />"></script>
    </head>
    <body>
        <div id='cssmenu'>
            <ul>
                <li><a href='#'><span>Home</span></a></li>
                <li class='active has-sub'><a href='#'><span>Bills</span></a>
                    <ul>
                        <li><a href='bills'><span>Add</span></a>
                        </li>
                        <li><a href='#'><span>Edit</span></a>
                        </li>
                    </ul>
                </li>
                <li class='active has-sub'><a href='#'><span>Stock</span></a>
                    <ul>
                        <li><a href='#'><span>Create Item</span></a>
                        </li>
                        <li><a href='#'><span>Edit Item</span></a>
                        </li>
                         <li><a href='#'><span>Add to Stock</span></a>
                        </li>
                    </ul>
                </li>
                <li class='active has-sub'><a href='#'><span>Invoice</span></a>
                    <ul>
                        <li><a href='#'><span>Create Invoice</span></a>
                        </li>
                        <li><a href='#'><span>Add Invoice</span></a>
                        </li>
                         <li><a href='#'><span>Edit Invoice</span></a>
                        </li>
                    </ul>
                </li>
                <li class='active has-sub'><a href='#'><span>Order</span></a>
                    <ul>
                        <li><a href='#'><span>Create Order</span></a>
                        </li>
                        <li><a href='#'><span>Add Order</span></a>
                        </li>
                         <li><a href='#'><span>Edit Order</span></a>
                        </li>
                    </ul>
                </li>
                <li class='active has-sub'><a href='#'><span>Search</span></a>
                    <ul>
                        <li><a href='#'><span>Structured</span></a>
                        </li>
                        <li><a href='#'><span>Unstructured</span></a>
                        </li>
                    </ul>
                </li>
                <li class='active has-sub'><a href='#'><span>Reports</span></a>
                    <ul>
                        <li><a href='#'><span>Sale</span></a>
                        </li>
                        <li><a href='#'><span>Customer</span></a>
                        </li>
                         <li><a href='#'><span>Product</span></a>
                        </li>
                        <li><a href='#'><span>Payment</span></a>
                        </li>
                    </ul>
                </li>
                <li><a href='#'><span>About</span></a></li>
                <li class='last'><a href='#'><span>Contact</span></a></li>
            </ul>
        </div>

    </body>
    <html>



