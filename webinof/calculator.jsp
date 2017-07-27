<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>计算器</title>
</head>
<body sttyle="text-align:center;">

<jsp:useBean id="calculatorbean" class="test1.Caculatorbean" />
<jsp:setProperty property="*" name="calculatorbean"/>
<%
calculatorbean.caculator();
%>

<br>-----------------------------------------------------------------------------------
计算结果是：
<jsp:getProperty property="firstNum" name="calculatorbean"/>
<jsp:getProperty property="operatoe" name="calculatorbean"/>
<jsp:getProperty property="secondNum" name="calculatorbean"/>
=
<jsp:getProperty property="result" name="calculatorbean"/>

<br>-----------------------------------------------------------------------------------
 
 <form action="/Test1/calculator.jsp" method="post"></form>
  <table width="40%"  border="1">
  <tr> 
     <td colspan="2">简单的计算器</td>
  </tr>
  <tr> 
  <td>第一个参数</td>
  <td>
 <input type="text" name="firstNum">
  </td>
  
  </tr>
  <tr> 
  <td>操作符</td>
  <td>
  <select name="operator">
   <option value="+">+</option>
   <option value="-">_</option>
   <option value="*">*</option>
   <option value="/">/</option>
  </select>
  </td>
  </tr>
  <tr> 
  <td>第二个参数</td>
  <td>
   <input type="text" name="secondNum">
  </td>
  </tr>
  <tr> 
  <td colspan="2">
  <input type="submit"  value="计算">
  </td>
 
  </tr>
  
  </table>

</body>
</html>