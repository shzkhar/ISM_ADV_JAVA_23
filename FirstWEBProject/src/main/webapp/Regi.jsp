<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


  <form action="RegistrationController" method="post">
           FirstName : <input type="text" name="firstName" placeholder="Enter Name"/> <br><br>
           email : <input type="text" name="email" palceholder="EnterEmail"/> <br><br>
           Password : <input type="password" name="password" placeholder="EnterPassword"/> <br><br>
        
           <input type="submit" value="LOGIN">
        
  </form>
  
     <%
		String error = (String)request.getAttribute("error");
	%>
  <%= error %>
</body>
</html>