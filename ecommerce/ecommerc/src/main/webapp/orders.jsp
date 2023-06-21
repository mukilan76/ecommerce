<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@page import="ecom.connection.dbconnect"%>
<%@page import="ecom.dao.Prodectdao"%>
<%@page import="ecom.model.*"%>

    
<!DOCTYPE html>
<html>
<head><%@include file = "includes/head.jsp" %></head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%  ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
List<Cart> cartProduct = null;
if (cart_list != null) {
	
	request.setAttribute("cart_list", cart_list);}%>
<body>
<%@include file = "includes/navbar.jsp" %>
<%@include file = "includes/footer.jsp" %>
</body>
</html>