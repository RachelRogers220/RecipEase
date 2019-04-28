<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
    h1 {color:#000066;
    text-align:center;
    font-size:150%}
    h2 {color:#000099;}
    body {font-size:150%;}
    a:link, a:visited {
    color: white;
    text-align: center;
    }
    button {
    background-color: #000099;
    color: white;
    text-decoration:none;
    padding: 15px 25px;
    font-size:100%;
    }

    </style>
</head>
<body>

<h1>New Recipe</h1>
<form action="/NewRecipe">
    Recipe Title:
    <input type="text" name="recipeName"><br>
    Ingredients:<br>
    <textarea name="ingredientList" rows="10" cols="30">
    </textarea><br>
    Method:<br>
    <textarea name="method" rows="10" cols="30">
    </textarea><br>
    <input type="submit" value="Add it to the box">




</form>


</body>
</html>