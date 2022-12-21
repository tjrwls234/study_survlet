package com.yojulab.study_survlet.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.yojulab.study_survlet.DataInfor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dispatcherJSP/TableListServlets")
public class DispatcherJSPTableListServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DataInfor dataInfor = new DataInfor();
        ArrayList<String> tablesListWithString = dataInfor.getTableListWithString();
        HashMap<String, String> searchform = dataInfor.getSearchFormData();

        request.setAttribute("tablesListWithString", tablesListWithString);
        request.setAttribute("searchform", searchform);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/tables_list.jsp");
        requestDispatcher.forward(request, response);
    }
}
