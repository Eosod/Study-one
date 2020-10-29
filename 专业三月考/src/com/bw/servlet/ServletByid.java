package com.bw.servlet;

import com.bw.dao.Dao;
import com.bw.dao.DaoTrain;
import com.bw.train.Train;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletByid")
public class ServletByid extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ids = request.getParameter("ids");
        Dao dao = new DaoTrain();
        Train byid = dao.byid(Integer.parseInt(ids));
        request.setAttribute("abyid",byid);
        request.getRequestDispatcher("alter.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
