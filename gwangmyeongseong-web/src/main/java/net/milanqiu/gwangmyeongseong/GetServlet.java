package net.milanqiu.gwangmyeongseong;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet of get.
 * <p>
 * Creation Date: 2016-11-18
 * @author Milan Qiu
 */
public class GetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("Post is not allowed.");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("Method: get");
        response.getWriter().print("<br>");
        response.getWriter().print("Param1: " + request.getParameter("Param1"));
        response.getWriter().print("<br>");
        response.getWriter().print("Param2: " + request.getParameter("Param2"));
    }
}
