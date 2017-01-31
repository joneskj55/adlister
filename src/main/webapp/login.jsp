<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="partials/css.jsp"%>
    <title>Login</title>
</head>
<body>
    <%@ include file="partials/navbar.jsp"%>
    <div class="container">
    <form>
        <input name="username" type="text" class="form-control" placeholder="Username *" id="username" required="" data-validation-required-message="Please enter your username.">
        <input name="password" type="text" class="form-control" placeholder="Password *" id="password" required="" data-validation-required-message="Please enter your password.">
    </form>
    </div>
</body>
</html>
