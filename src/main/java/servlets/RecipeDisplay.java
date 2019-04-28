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

        try {
            writer.println("<html><body>");
            writer.println("<h2>Hello World</h2>");
            writer.println("</br></body></html>");


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}