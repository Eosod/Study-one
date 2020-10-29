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

@WebServlet("/ServletAlter")
public class ServletAlter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String trainname = request.getParameter("trainname");
        String trainstart = request.getParameter("trainstart");
        String trainover = request.getParameter("trainover");
        String typeid = request.getParameter("typeid");
        String begintime = request.getParameter("begintime");
        String endtime = request.getParameter("endtime");
        String trainid = request.getParameter("trainid");
        Train train = new Train(Integer.parseInt(trainid),trainname,trainstart,trainover, Integer.parseInt(typeid),begintime,endtime);
        Dao dao = new DaoTrain();
        System.out.println("aaa"+train);
        boolean alter = dao.alter(train);
        if (alter)
        {
            response.sendRedirect("ServletSee");
            System.out.println("成功");
        }
        else
        {
            response.sendRedirect("ServletSee");
            System.out.println("失败");
            //失败
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
    }
}
