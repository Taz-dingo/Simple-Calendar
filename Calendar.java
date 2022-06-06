/**
 *要求编程输出2008年日历。日历中要求含有月份、日期与星期(如星期一和星期二等)。
 *然后统计并输出2008年日期的个位数与相应的星期恰好相同的总天数(例如：2000年9月1日恰好是星期一)。
 * 注：这里用0对应星期日！
 */
package Homework3_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Calendar {
    private HashMap<Integer,String> monthHashMap = new HashMap<Integer,String>();  //散列表：月份数->月份名
    private HashMap<Integer,String> weekNumHashMap = new HashMap<Integer,String>();    //散列表：星期数->星期名
    private HashSet<Integer> oddMonth = new HashSet<Integer>();    //集合：大月
    private HashSet<Integer> evenMonth = new HashSet<Integer>();    //集合：小月
    private ArrayList<Date> dates = new ArrayList<Date>();  //集合：日期

    public Calendar(int year){  //根据年份生成日期
        //月份对应的名称
        monthHashMap.put(1,"January");
        monthHashMap.put(2,"February");
        monthHashMap.put(3,"March");
        monthHashMap.put(4,"April");
        monthHashMap.put(5,"May");
        monthHashMap.put(6,"June");
        monthHashMap.put(7,"July");
        monthHashMap.put(8,"August");
        monthHashMap.put(9,"September");
        monthHashMap.put(10,"October");
        monthHashMap.put(11,"November");
        monthHashMap.put(12,"December");
        //星期对应的名称
        weekNumHashMap.put(0,"Sunday");
        weekNumHashMap.put(1,"Monday");
        weekNumHashMap.put(2,"Tuesday");
        weekNumHashMap.put(3,"Wednesday");
        weekNumHashMap.put(4,"Thursday");
        weekNumHashMap.put(5,"Friday");
        weekNumHashMap.put(6,"Saturday");
        //31天的月份放入oddMonth集合
        oddMonth.add(1);
        oddMonth.add(3);
        oddMonth.add(5);
        oddMonth.add(7);
        oddMonth.add(8);
        oddMonth.add(10);
        oddMonth.add(12);
        //30天的月份放入evenMonth集合
        evenMonth.add(4);
        evenMonth.add(6);
        evenMonth.add(9);
        evenMonth.add(11);

        for(int i = 1;i <= 12;i++){     //i表示月份
            int number = 0;
            if(oddMonth.contains(i))  //如果是大月，有31天
                number = 31;
            else if(evenMonth.contains((i)))  //如果是小月，有30天
                number = 30;
            else if(i == 2){   //如果是2月
                if(isLeapYear(year))   //如果是闰年，有29天
                    number = 29;
                else
                    number = 28;    //否则，有28天
            }
            //创建每一天的日期对象
            for(int j = 1;j <= number;j++){
                dates.add(new Date(i,j,year));
            }
        }
    }

    public boolean isLeapYear(int year){    //闰年判断
        boolean ret = false;
        //能被4整除且不能被100整除，或者能被400整除的
        if( year%4 == 0 && year % 100 != 0 || year%400 == 0)
            ret = true;     //是闰年
        return ret;
    }

    public void printCalendar(){
        for(Date d : dates)
            System.out.println(weekNumHashMap.get(d.getweekNum())+" "+monthHashMap.get(d.getMonth()) + "," + d.getDay() + " " + d.getYear());
    }

    public int countDay(){
        int count = 0;
        //如果日期的个位数等于星期数
        for(Date d : dates) {
            if (d.getDay() % 10 == d.getweekNum()) {
                count++;
                System.out.println(weekNumHashMap.get(d.getweekNum()) + " " + monthHashMap.get(d.getMonth()) + "," + d.getDay() + " " + d.getYear());
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Calendar calendarOf2008 = new Calendar(1);
        calendarOf2008.printCalendar();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("日期个位数与星期恰好相同的有：");
        System.out.println("共"+calendarOf2008.countDay()+"天");
    }
}
