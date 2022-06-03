package Homework3_2;

import java.util.HashMap;

public class Date {

    private int month;  //月
    private int day;    //日
    private int year;   //年

    public Date(int month,int day,int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear(){
        return year;
    }
}
