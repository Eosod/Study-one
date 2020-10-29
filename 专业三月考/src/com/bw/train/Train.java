package com.bw.train;

public class Train {
    private int trainid;
    private String trainname;
    private String trainstart;
    private String trainover;
    private int typeid;
    private String begintime;
    private String endtime;

    public Train(int trainid, String trainname, String trainstart, String trainover, int typeid, String begintime, String endtime) {
        this.trainid = trainid;
        this.trainname = trainname;
        this.trainstart = trainstart;
        this.trainover = trainover;
        this.typeid = typeid;
        this.begintime = begintime;
        this.endtime = endtime;
    }

    public int getTrainid() {
        return trainid;
    }

    public void setTrainid(int trainid) {
        this.trainid = trainid;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getTrainstart() {
        return trainstart;
    }

    public void setTrainstart(String trainstart) {
        this.trainstart = trainstart;
    }

    public String getTrainover() {
        return trainover;
    }

    public void setTrainover(String trainover) {
        this.trainover = trainover;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainid=" + trainid +
                ", trainname='" + trainname + '\'' +
                ", trainstart='" + trainstart + '\'' +
                ", trainover='" + trainover + '\'' +
                ", typeid=" + typeid +
                ", begintime='" + begintime + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }
}
