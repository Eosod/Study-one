package com.bw.dao;

import com.bw.train.Train;
import com.bw.util.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.XMLFormatter;

public class DaoTrain implements Dao{
    @Override
    public ArrayList<Train> list() {
        ArrayList<Train> alist = new ArrayList<>();
        String str = "select*from train_info";
        Connection connection = BaseDao.connection();
        try {
            PreparedStatement pre = connection.prepareStatement(str);
            ResultSet resultSet = pre.executeQuery();
            while (resultSet.next())
            {
                Train train = new Train(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getString(6),
                        resultSet.getString(7)
                );
                alist.add(train);
            }
            System.out.println(alist);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alist;
    }

    @Override
    public Train byid(int id) {
        String str = "select *from train_info where typeid = ?";
        Connection connection = BaseDao.connection();
        try {
            PreparedStatement pre = connection.prepareStatement(str);
            pre.setInt(1,id);
            ResultSet resultSet = pre.executeQuery();
            while (resultSet.next())
            {
                Train train = new Train(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getString(6),
                        resultSet.getString(7)
                );
                return train;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean alter(Train train) {
        String str = "update train_info set trainname = ? , trainstart = ? , trainover = ? , typeid = ? , begintime = ? , endtime = ? where trainid= ?";
        Connection connection = BaseDao.connection();
        try {
            PreparedStatement pre = connection.prepareStatement(str);
            pre.setString(1,train.getTrainname());
            pre.setString(2,train.getTrainstart());
            pre.setString(3,train.getTrainover());
            pre.setInt(4,train.getTypeid());
            pre.setString(5,train.getBegintime());
            pre.setString(6,train.getEndtime());
            pre.setInt(7,train.getTrainid());
            System.out.println(str);
            int i = pre.executeUpdate();
            if (i>0)
            {
                System.out.println("修改成功");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String str  = "delete train_info from train_info where trainid = ?";
        try {
            Connection connection = BaseDao.connection();
            PreparedStatement pre = connection.prepareStatement(str);
            pre.setInt(1,id);
            int i = pre.executeUpdate();
            if (i>0)
            {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Train chaxun(String trainname, String trainstart, String begintime) {
        String str = "select*from train_info where 1=1";
        if (!"".equals(trainname))
        {
            str+=" and trainname = '" + trainname + "'";
        }
        if (!"".equals(trainstart))
        {
            str+=" and trainstart = '" + trainstart + "'";
        }
        if (!"".equals(begintime))
        {
            str+=" and begintime = '" + begintime + "'";
        }
        if ("".equals(trainname)&&"".equals(trainstart)&&"".equals(begintime))
        {
            str+="";
        }

        System.out.println(trainname);
        System.out.println(trainstart);
        System.out.println(begintime);
        Connection connection = BaseDao.connection();
        try {
            PreparedStatement pre = connection.prepareStatement(str);
            ResultSet resultSet = pre.executeQuery();
            while (resultSet.next())
            {
                Train train = new Train(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getString(6),
                        resultSet.getString(7));
                return train;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
