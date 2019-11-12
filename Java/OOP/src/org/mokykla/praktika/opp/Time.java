package org.mokykla.praktika.opp;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    public void setTime (int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

}
