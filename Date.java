package Homework3_2;

import java.util.HashMap;

public class Date {

    private int month;  //月
    private int day;    //日
    private int year;   //年
    private int week;   //星期

    public Date(int month,int day,int year){
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public int getWeek() {
        int c = year/100;   //世纪-1（前两位）
        int y = year%100;   //年份（后两位）
        int m;
        int d = day;
        if(month == 1 || month == 2) {
            m = month + 12;
            y--;
        }
        else
            m = month;
        //蔡勒公式
        int w = y + y/4 + c/4 - 2*c + ( 26*(m+1) )/10 + d - 1;
        if(w<0)
            w = -w;
        week = w%7;
//        System.out.println(c+" "+y+" "+m+" "+d);
        return week;
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

    public static void main(String[] args) {
        Date test = new Date(10,1,2049);
        System.out.println(test.getWeek());
    }
}
