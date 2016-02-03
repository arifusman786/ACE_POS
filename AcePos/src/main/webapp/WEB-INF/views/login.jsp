<%-- 
    Document   : index
    Created on : Feb 2, 2016, 8:02:11 AM
    Author     : nizomiddin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div>

    <div class="panel-body">
        <form action="postLogin" method="post">
            <fieldset>
                <legend>Please sign in</legend>

                <form:errors path="*" cssClass="alert alert-danger" element="div" />

                <div class="form-group">
                    <input class="form:input-large" placeholder="User Name"
                           name='username' type="text">
                </div>
                <div class="form-group">
                    <input class=" form:input-large" placeholder="Password"
                           name='password' type="password" value="">
                </div>
                <input class="btn" type="submit"
                       value="Login">
            </fieldset>
        </form>
    </div>
</div>
