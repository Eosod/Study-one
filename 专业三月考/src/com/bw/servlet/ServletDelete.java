package com.bw.servlet;

import com.bw.dao.Dao;
import com.bw.dao.DaoTrain;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletDelete")
public class ServletDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ids = request.getParameter("ids");
        Dao dao = new DaoTrain();
        boolean delete = dao.delete(Integer.parseInt(ids));
        if (delete)
        {
            response.sendRedirect("ServletSee");
        }
        else
        {
            System.out.println("删除失败");
            response.sendRedirect("ServletSee");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
