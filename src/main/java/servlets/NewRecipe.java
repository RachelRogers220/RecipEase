package servlets;


import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import database.DBConnector;

public class NewRecipe extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        PreparedStatement statement;

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/RecipeDisplay");

        String name = request.getParameter("recipeName");
        String notes = request.getParameter("method");
        String ingredients = request.getParameter("ingredientList");



        String sql1 = "INSERT INTO recipes (recName, recNotes) values (?, ?)";
        String sql2 = "INSERT INTO ingredients (ingName) values (?)";


        try {
            Connection conn = new DBConnector().getConn();
            System.out.println(name);

            statement = conn.prepareStatement(sql1);
            statement.setString(1, name);
            statement.setString(2, notes);

            statement.execute();

            statement = conn.prepareStatement(sql2);
            statement.setString(1, ingredients);

            statement.execute();

            dispatcher.forward(request, response);
            //response.sendRedirect(request.getContextPath() + "/RecipeDisplay");




            conn.close();




        } catch (SQLException e) {
            System.out.println(e.getErrorCode());

        }
    }


}
