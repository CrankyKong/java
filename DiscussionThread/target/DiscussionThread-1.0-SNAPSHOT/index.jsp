<%-- 
    Document   : index
    Created on : Jun 19, 2016, 6:47:34 PM
    Author     : Logan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Discussion Thread Home</title>

        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="main.css" rel="stylesheet" type="text/css" />
    </head>

    <body>
        <div class="row wrapper well col-md-10 col-md-offset-1">
            <h1>Welcome! Please Log in.</h1>
            <div class="form-container">
                <form action="Authenticate" method="post">
                    <input type="text" name="user" placeholder="Username">
                    <br>
                    <input type="password" name="password" placeholder="Password">
                    <br>
                    <button class="sign-up-button" type="submit">Login</button>
                </form>
            </div>
        </div>
    </body>

</html>
