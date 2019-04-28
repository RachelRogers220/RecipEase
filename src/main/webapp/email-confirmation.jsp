<html>

<body>
<jsp include page="header.html"/>

You are on the list!
<%= request.getParameter("name") %>
<br/>
<%= request.getParameter("emailAddress") %>
<br/>
<%
  String[] foods = request.getParameterValues("FavoriteFood");

  for (int i = 0; i < foods.length; i++)
  {
    out.println("<li>" + foods[i] + "</li>");
  }

   %>

<jsp:include page="footer.jsp" />

</body>

</html>