<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
</head>
<body>

  <h1>Result is:</h1>
  
  <h2><%= request.getAttribute("result") %></h2>

</body>
</html>