<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <h1>Login Form</h1>
    <form action="/signin" method="post">
      Enter Email:
      <input type="text" name="email" id="email" /><br />
      Enter Password:
      <input type="password" name="password" id="password" /><br />
      <input type="submit" value="Login" />
    </form>
  </body>
</html>