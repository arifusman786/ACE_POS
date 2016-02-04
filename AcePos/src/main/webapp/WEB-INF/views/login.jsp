<%-- 
    Document   : index
    Created on : Feb 2, 2016, 8:02:11 AM
    Author     : nizomiddin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div>

    <div>
        <form  action="postLogin" method="post">
            <fieldset>
                <legend>Please sign in</legend>

                <form:errors path="*"/>

                <div>
                    <input placeholder="User Name"
                           name='username' type="text">
                </div>
                <div>
                    <input placeholder="Password"
                           name='password' type="password" value="">
                </div>
                <input type="submit"
                       value="Login">
            </fieldset>
                <img src="resources/theme1/1.jpg" style="width: 100%; height: 565px" >
        </form>
    </div>
</div>
