<%-- 
    Document   : mentor-authentication
    Created on : Oct 12, 2021, 7:22:22 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><h1>Authen</h1>
        
        <form action="mentorAuthen" method="POST" enctype="multipart/form-data">
            Image1:<input type="file" name="img1" ><br>
            Image2:<input type="file" name="img2" >
            <input type="submit" value="Send">
        </form>
        
    </body>
</html>