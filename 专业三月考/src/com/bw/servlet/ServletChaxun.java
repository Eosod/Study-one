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

@WebServlet("/ServletChaxun")
public class ServletChaxun extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String trainname = request.getParameter("trainname");
        String trainstart = request.getParameter("trainstart");
        String begintime = request.getParameter("begintime");
        Dao dao = new DaoTrain();
        Train chaxun = dao.chaxun(trainname, trainstart, begintime);
        ArrayList<Train> arrayList = new ArrayList<>();
        arrayList.add(chaxun);
        request.setAttribute("chaxun",arrayList);
        request.getRequestDispatcher("see2.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
    }
}
