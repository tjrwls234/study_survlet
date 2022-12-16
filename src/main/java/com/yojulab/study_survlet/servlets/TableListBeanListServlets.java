package com.yojulab.study_survlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;

import com.yojulab.study_survlet.DataInfor;
import com.yojulab.study_survlet.beans.MemberBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/tablesBeanListServlets")
public class TableListBeanListServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest requerst, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DataInfor dataInfor = new DataInfor();
        // MemberBean memberBean = dataInfor.getDataWithMemberBean();
        HashMap<String, Object> bundlesData = dataInfor.getBundlesData();

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<meta charset='UTF-8'>");
        printWriter.println("<title>tables Bean List Servlets</title>");
        printWriter.println("<link rel='stylesheet' href='./css/commons.css' />");
        printWriter.println("<link");
        printWriter.println("href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css'");
        printWriter.println("rel='stylesheet'");
        printWriter.println("integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65'");
        printWriter.println("crossorigin='anonymous'/>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div class='container' >");
        printWriter.println("<div class='fs-3'>Table with Bean</div>");
        // MemberBean memberBean2 = (MemberBean)
        // bundlesData.get("getDataWithMemberBean");
        // printWriter.println(
        // memberBean2.getFirstName() + " " + memberBean2.getSecondName() + " " +
        // memberBean2.getHandleName());
        printWriter.println("<table class='table'>");
        printWriter.println("<thead>");
        printWriter.println("<tr>");
        printWriter.println("<th scope=>#</th>");
        printWriter.println("<th scope=>Handle</th>");
        printWriter.println("</tr>");
        printWriter.println("</thead>");
        printWriter.println("<tbody>");
        ArrayList<MemberBean> dataListWithMemberBean = (ArrayList<MemberBean>) bundlesData
                .get("getDataListWithMemberBean");
        for (int i = 0; i < dataListWithMemberBean.size(); i++) {
            MemberBean memberBean = dataListWithMemberBean.get(i);
            printWriter.println("                <tr>");
            printWriter.println("                    <th scope=>" + (i + 1) + "</th>");
            String handle = memberBean.getHandleName();
            printWriter.println("                    <td>" + memberBean.getFirstName() + "</td>");
            printWriter.println("                    <td>" + memberBean.getSecondName() + "</td>");
            printWriter.println("                    <td>" + handle + "</td>");
            printWriter.println("                </tr>");
        }

        printWriter.println("</tbody>");
        printWriter.println("</table>");
        printWriter.println("</div>");
        printWriter.println("<script");
        printWriter.println(" src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("crossorigin='anonymous'");
        printWriter.println("></script>");
        printWriter.println("</body>");
        printWriter.println("</html>");
        printWriter.close();
    }
}
