package servlets;

import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import database.DBConnector;

public class RecipeDisplay extends HttpServlet
{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        PreparedStatement statement;
        ResultSet resultSet;

        String name = request.getParameter("recipeName");

        String sql1 = "SELECT idRecipes from Recipes WHERE recName ='" + name +"';";

        System.out.println(sql1);




        try {
            writer.println("<html><body>");
            writer.println("<h2>"+name+"</h2>");
            writer.println("</br></body></html>");

            Connection conn = new DBConnector().getConn();
            System.out.println(name);

            statement = conn.prepareStatement(sql1);
            statement.execute();

            resultSet = statement.getResultSet();
            resultSet.next();
            System.out.println(resultSet.getInt("idRecipes"));


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}