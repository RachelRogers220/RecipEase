package servlets;


import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import database.DBConnector;

public class NewRecipe extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();



        PreparedStatement statement;
        String name = request.getParameter("recipeName");
        String notes = request.getParameter("method");
        String ingredients = request.getParameter("ingredientList");
        //System.out.print(name);

        String sql1 = "INSERT INTO recipes (idRecipes, recName, recNotes) values (?, ?, ?)";
        String sql2 = "INSERT INTO ingredients (idIngredients, ingName) values (?, ?)";


        try {
            writer.println(name);
            writer.println(notes);
            writer.println(ingredients);
            Connection conn = new DBConnector().getConn();
            System.out.print(name);

            statement = conn.prepareStatement(sql1);
            statement.setString(1, "1");
            statement.setString(2, name);
            statement.setString(3, notes);

            statement.execute();

            statement = conn.prepareStatement(sql2);
            statement.setString(1, "3");
            statement.setString(2, ingredients);

            statement.execute();



            conn.close();


        } catch (SQLException e) {
            System.out.println(e.getErrorCode());

        }
    }


}
