<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
 <% String error = (String)request.getAttribute("error"); %>
    <%= error %>

    <form action="Registration" method="post">
            Enter FirstName :- <input type="text" name="firstname" placeholder="Enter FirstName"/><br><br>
            Enter LastName :- <input type="text" name="lastname" placeholder="Enter LastName"/><br><br>
            Enter Gender : <input type="radio" name="gender" value="male"/>Male 
                            <input type="radio" name="gender" value="female"/>FeMale <br><br>
            Enter Email :- <input type="text" name="email" placeholder="Enter Email"/><br><br>
            Enter Password :- <input type="password" name="pass" placeholder="Enter Password"/><br><br>
            Enter ConformPassword :- <input type="password" name="cnfpass" placeholder="Enter Password"/><br><br>
            
          
                 City:-  <select  name="city">
                      <option value="--">--</option>
                      <option value="Jalgaon">Jalgaon</option>
                      <option value=Pune">Pune</option>
                      <option value="Mumbai">Mumbai</option>
                      <option value="Ahmedabad">Ahmedabad</option>
                   </select><br><br>
                   
                   
 
          
           Hobby:-
  <input type="radio"  name="hobbi" value="Cricket">Cricket
  
  <input type="radio"  name="hobbi" value="Singing">Singing
 
  <input type="radio"  name="hobbi" value="Bike Ridding">Bike Ridding
 
<br><br>
            
        <input type="submit" value="Login">
         
    </form>
   
</body>
</html>