/**
 *要求编程输出2008年日历。日历中要求含有月份、日期与星期(如星期一和星期二等)。
 *然后统计并输出2008年日期的个位数与相应的星期恰好相同的总天数(例如：2000年9月1日恰好是星期一)。
 */
package Homework3_2;

import java.util.HashMap;
import java.util.Set;

public class Calendar {
    private HashMap<Integer,String> stringHashMap;  //整型->字符串散列表
    private Set<Integer> oddMonth,evenMonth;    //大月、小月集合


    public Calendar(int year){  //根据年份生成日期
        //月份对应的名称
        stringHashMap.put(1,"January");
        stringHashMap.put(2,"February");
        stringHashMap.put(3,"March");
        stringHashMap.put(4,"April");
        stringHashMap.put(5,"May");
        stringHashMap.put(6,"June");
        stringHashMap.put(7,"July");
        stringHashMap.put(8,"August");
        stringHashMap.put(9,"September");
        stringHashMap.put(10,"October");
        stringHashMap.put(11,"November");
        stringHashMap.put(12,"December");
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
            if(oddMonth.contains(i)){   //如果月份31天
                for
            }
        }
    }
}
