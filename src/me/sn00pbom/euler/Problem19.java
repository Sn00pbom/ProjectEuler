package me.sn00pbom.euler;

import java.util.ArrayList;

public class Problem19 {

    public Problem19(){
        Date date = new Date(2000,3,12);
        date.isLeap();

//        Main.db(new Date(1900,4,7).getDayOfWeek(1));
//        Main.db(Date.getNextFirstOfYearDOW(1,1900));
//        Main.db(new Date(2018,2,3).getPassedDaysInYear());
        new Date(2000,2,29).nextDay().printDate();
        Date firstKnown = new Date(1900,1,1,1);
        Date start = new Date(1901,1,1);
        Date end = new Date(2000,12,31);

//        Main.db(new Date(1900,12,31,1).getDayOfWeek());
        Main.db(firstKnown.nextFoy());


        Main.db(numSundaysOnFirstofMonth(firstKnown,start,end));
    }


    public int numSundaysOnFirstofMonth(Date firstknown, Date start, Date end){
        ArrayList<Date> sundays = new ArrayList<>();

        Date date = firstknown;
        int year = firstknown.year;
        int numDays = Date.daysFrom(firstknown,end);
        for(int i = 0; i<numDays; i++){
            if(date.foy == -1){
                //generate foy
            }
            if(date.inBounds(start,end) && date.day == 1 &&  date.getDayOfWeek() == 7){
                sundays.add(date);
            }
            int foy = date.foy;
            if(date.month == 12 && date.day == 31)foy = date.nextFoy();
            date = date.nextDay();
            date.foy = foy;

        }
        return sundays.size();
    }

}
