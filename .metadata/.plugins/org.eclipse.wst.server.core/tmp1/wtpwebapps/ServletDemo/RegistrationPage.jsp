<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.Color{
color:red;
}
</style>
</head>
<body align="center">

     <% 
        String fname = (String) request.getAttribute("firstname");
        String email = (String) request.getAttribute("email");
        String pass = (String) request.getAttribute("pass");
     %>
     



    <form action="signup" method="post">
         First Name :- <input type="text" name="firstname" value="${fnamevalue}" />
         <span class="Color"><%= fname==null?"":fname %></span>
         <br><br>
        
         Email :- <input type="text" name="email" value="${emailvalue}" />
         <span class="Color"><%= email==null?"":email %></span>
         <br><br>
         
         Password :- <input type="text" name="password" value="${passwordvalue}"/>
         <span class="Color"><%= pass==null?"":pass %></span>
         <br><br>
         <input type="submit" value="Register"/>
     </form>
     
     
</body>
</html>