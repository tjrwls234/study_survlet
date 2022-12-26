package com.yojulab.study_survlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// /session/createJSPServlets?username=yojulab&password=1234
@WebServlet(urlPatterns = "/session/createJSPServlets")
public class CreateSessionJSPServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // display
        // login
        HttpSession httpSession = null;
        HttpSession httpSession_false = null;

        // // EXISTS JSESSIONID
        // httpSession = request.getSession(); // 무조건 인스턴스화
        // httpSession_false = request.getSession(false); // 존재하면 인스턴스화

        // // NOT EXISTS JSESSIONID
        // httpSession = request.getSession(); // 인스턴스화
        // httpSession_false = request.getSession(false); // NULL

        String path = null;
        if ("yojulab".equals(username) && "1234".equals(password)) {
            // login
            httpSession_false = request.getSession(false); // 존재하면 인스턴스화
            if (httpSession == null) {
                httpSession = request.getSession(); // 무조건 인스턴스화
                httpSession.setAttribute("username", username);
                httpSession.setAttribute("password", password);
            }
            path = "/session/checkLogin.jsp";
            httpSession.getAttribute("username");
            System.out.println(httpSession.getAttribute("username"));
            System.out.println(httpSession.getId());
        } else {
            // logout
            httpSession = request.getSession(false); // 존재하면 인스턴스화
            if (httpSession != null) {
                httpSession.invalidate();
            }
            // System.out.println(httpSession.getAttribute("username"));
            System.out.println(httpSession.getId());
            path = "/session/checkLogout.jsp";
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);

    }
}
