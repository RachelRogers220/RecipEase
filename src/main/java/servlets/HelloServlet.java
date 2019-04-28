package servlets;

import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import database.DBConnector;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        //Set content type
        response.setContentType("text/html");

        //Get printwriter
        PrintWriter writer = response.getWriter();

        ResultSet resultSet = null;
        Statement statement = null;

        try {

            //generate HTML content
            writer.println("<html><body>");
            writer.println("<h2>Hello World</h2>");
            writer.println("</br>");
            writer.println("Time on the server is: " + new java.util.Date());
            writer.println("</br></body></html>");

            Connection conn = new DBConnector().getConn();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT ingName FROM Ingredients");
            writer.print("I love ");
            resultSet.next();
            System.out.println(resultSet.getString("ingName"));
            writer.print(resultSet.getString("ingName"));
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx);
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx);
                }
            }
        }

    }




}