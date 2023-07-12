<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator Page</title>
</head>
<body>
  <form action="calci" method="post">
 <<h1> Basic Calculator</h1> 
  
  <table>
    
    <tr>
    <td style="color:blue" >First Number </td> 
    <td><input  style="background-color:violite" type="number" name="tbFn" placeholder="Enter the number"  required/></td>
    </tr>
    <tr>
    <td style="color:blue">Second Number </td><td>
    <input style="background-color:violite"  type="number" name="tbSn" placeholder="Enter the number" required/></td>
    </tr>
    <tr >
    <td></td>
    <td><input style="background-color:Tomato" type="submit" name="btnAdd" value="add" /></td>
    </tr>
    <tr>
    <td></td>
    <td><input  style="background-color:yellow" type="submit" name="btnSub" value="sub" /></td>
    </tr>
    
    <td></td>
    <td><input  style="background-color:pink" type="submit" name="btnMult" value="Mult" /></td>
    </tr>
    
    <td></td>
    <td><input  style="background-color:MediumSeaGreen" type="submit" name="btnDiv" value="Div" /></td>
    </tr>
    
   
    
  </table>

  </form>
  

</body>
</html>