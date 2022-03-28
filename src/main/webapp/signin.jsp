<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
	<meta charset="ISO-8859-1">
	<title>Sign Up</title>
	<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	
		
			<h1>User Registration</h1>
		
		    <form action="signinuser" method="post" >
                   
                    <input type="text" name="firstname" placeholder="Firstname" required><br>
                   
                  
                    <input type="text" name="lastname" placeholder="Lastname" required><br>
                  
                    
                    <input type="email" name="email" id="email"  placeholder="Email" required><br>
                   
                  
                    <input type="tel" name="phone" id="phone"  placeholder="Phone Number" minlength="10" required><br>
                    
               
                    <input type="password" name="password" id="password"  placeholder="Password" required><br>
                  
                    <button type="submit" >Submit</button>
                    
               
               
              </form>
	
</body>
</html>