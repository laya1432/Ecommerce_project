<%@ page import="java.util.*, com.ecommerce.model.Product" %>

<html>
<body>
<h2>Product List</h2>

<table border="1" cellpadding="10">
<tr>
<th>ID</th>
<th>Name</th>
<th>Price</th>
</tr>

<%
   List<Product> products = (List<Product>) request.getAttribute("products");
   for (Product p : products) {
%>
<tr>
<td><%= p.getId() %></td>
<td><%= p.getName() %></td>
<td>₹ <%= p.getPrice() %></td>
</tr>
<%
   }
%>

</table>
</body>
</html>

