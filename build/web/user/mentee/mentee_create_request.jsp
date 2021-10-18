<%-- 
    Document   : mentee_create_request
    Created on : Oct 9, 2021, 8:39:39 PM
    Author     : WacMac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
           .flex-container {
  display: flex;
  flex-wrap: nowrap;
}
            </style>
    </head>
    <body>
        <h2>Thông tin về yêu cầu môn</h2>
        <form>
            
              <label for="subject request">Tiêu đề yêu cầu: </label>
              <input type="text" id="fname" name="fname"><br><br> 
  <div class="flex-container">
      <label for="subject name">Môn học yêu cầu:</label>
<select id="subject" name="subject">
  <option value="volvo">PRF192</option>
  <option value="saab">PRN211</option>
  <option value="opel">SWE201c</option>
  <option value="audi">SWT301</option>
</select><br>
  <label for="subject name">Môn học yêu cầu:</label>
<select id="class" name="class">
  <option value="volvo">lớp10</option>
  <option value="saab">lớp8</option>
  <option value="opel">lớp12</option>
  <option value="audi">lớp11</option>
</select><br>
    </div>
              
              
              
              
              
              
              
              
              
              
    <input type="submit" value="Submit">
        </form>
    </body>
</html>
