<%@page import="ecom.connection.dbconnect"%>
<%@page import="ecom.dao.Prodectdao"%>
<%@page import="ecom.model.*"%>
<%@page import="java.util.*"%>




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to shopping cart</title>


<% Prodectdao pd = new Prodectdao(dbconnect.getconnection());
List<Product> products = pd.getallproducts();
ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
List<Cart> cartProduct = null;
if (cart_list != null) {
	request.setAttribute("cart_list", cart_list);}



%>

<%@include file = "includes/head.jsp" %>
</head>
<body>
<%@include file = "includes/navbar.jsp" %>

<div class = "container">
<div class="card-header my-3">All Products</div>
<div class = "row">
<% 
if(!products.isEmpty()){
	for (Product p : products){%>
		
		<div class ="col-md-3 my-3">
		<div class="card w-100" style="width: 18rem;">
		  <img class="card-img-top" src="productimages/<%=p.getImage()%>.jpg" alt="Card image cap">
		  <div class="card-body">
		    <h5 class="card-title"><%= p.getName() %></h5>
		    <h6 class="price"> Price : <%=p.getPrice() %></h6>
		    <h6 class="category"> Category : <%=p.getCategory() %></h6>
		    <div class ="mt-3 d-flex justify-content-between">
		    <a href="addtocart?id=<%=p.getId() %>" class="btn btn-dark">Add to Cart</a>
		    <a href="#" class="btn btn-primary">Buy now </a>
		    </div>

		    
		  </div>
		</div>

		</div>
		
	<% }
}



%>


</div>
</div>

<%@include file = "includes/footer.jsp" %>
</body>
</html>