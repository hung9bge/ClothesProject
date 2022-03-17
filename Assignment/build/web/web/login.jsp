<%-- 
    Document   : login
    Created on : Mar 17, 2022, 8:59:00 PM
    Author     : HUNGLM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
        <form action="login" method="POST">
            Username: <input type="text" name="username"/> <br/>
            Password: <input type="password" name="password" /> <br/>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
