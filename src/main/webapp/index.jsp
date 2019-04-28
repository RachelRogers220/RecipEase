<html>
<body>
<h2>Hello World !</h2>
 The time on the server is <%= new java.util.Date() %>
 </br>

 <%! String makeItLower(String data) {
 return data.toLowerCase();
 }
%>

Lower case "Hello World": <%= makeItLower("Hello World")
%>

</br>
<button><a href="homepage.jsp">Button</a></button>
</br>
<a href="Hello">Click to call Servlet</a>


</body>
</html>
