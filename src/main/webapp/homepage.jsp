<html>

<body>

<jsp:include page="header.html" />


<h2>Recipes</h2>
<ul>
    <li>Quinoa Fried "Rice"</li>
    <li>Turkey Burgers</li>
    <li>Creamy Chicken Enchiladas</li>
    <li>Cuban Paninis</li>
</ul>



<h4 title="Click here to create a new recipe."><button><a href="NewRecipe.jsp">Add a recipe to the box!</a></button></h4>

<form action="/email-confirmation.jsp">
    <fieldset>
        <legend> Join my email list!</legend>
        Name:
        <input type="text" name="name">
        Email:
        <input type="text" name="emailAddress">
        <input type="submit" value="Submit">
        <br/>
        Favorite Food:
        <input type="checkbox" name="FavoriteFood" value="French Fries"> French Fries
        <input type="checkbox" name="FavoriteFood" value="Pizza"> Pizza
        <input type="checkbox" name="FavoriteFood" value="Chocolate"> Chocolate


    </fieldset>
</form>

<jsp:include page="footer.jsp" />

</body>
</html>
