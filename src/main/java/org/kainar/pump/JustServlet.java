package org.kainar.pump;

import java.io.Writer;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;;

@WebServlet(urlPatterns = "/")
public class JustServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Writer writer = resp.getWriter();
        writer.write("<h1 style=\"display:flex;justify-content:center;\">Hello world!</h1>");
        writer.flush();
    }
}
