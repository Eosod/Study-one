package com.bw.dao;

import com.bw.train.Train;

import java.util.ArrayList;
import java.util.TreeMap;

public interface Dao {
    public ArrayList<Train> list ();
    public Train byid(int id);
    public boolean alter(Train train);
    public  boolean delete(int id);

    public Train chaxun(String trainname ,String trainstart ,String begintime);
}
