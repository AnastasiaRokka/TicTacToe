/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pinkaros
 */
public class MoveController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tic Tac Toe</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Play your move!</h3>");
            out.println(" <form name=\"move\" action=\"move\" method=\"POST\">\n"
                    + "            <input type=\"text\" name=\"cell\" value=\"0\" />\n"
                    + "            <input type=\"text\" name=\"symbol\" value=\"X\" />\n"
                    + "            <input type=\"submit\" value=\"Submit\" name=\"submit\" />\n"
                    + "        </form>\n"
                    + "        ");
            out.println("</body>");
            out.println("</html>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tic Tac Toe</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Play your move!</h3>");
            out.println("cell possition:" + request.getParameter("cell"));
            out.println("symbol:" + request.getParameter("symbol"));
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
