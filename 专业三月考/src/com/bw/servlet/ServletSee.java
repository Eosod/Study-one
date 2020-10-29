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
import java.util.ArrayList;

@WebServlet("/ServletSee")
public class ServletSee extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Dao dao = new DaoTrain();
        ArrayList<Train> list = dao.list();
        request.setAttribute("alist",list);
        request.getRequestDispatcher("see.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
    }
}
