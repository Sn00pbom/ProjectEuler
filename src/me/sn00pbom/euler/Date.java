package me.sn00pbom.euler;

public class Date {
    final int year;
    final int month;
    final int day;
    int foy = -1;

    int[] MDAYS = {0,31,28,31,30,31,30,31,31,30,31,30,31};//zero at start to make array easy :)

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date(int year, int month, int day,int foy){
        this.year = year;
        this.month = month;
        this.day = day;
        this.foy = foy;
    }

    public int getDayOfWeek(){
        if(foy == -1) return -1;
        int dow = foy;
        for(int i = 0;i<getPassedDaysInYear();i++){
            if(dow == 7){
                dow = 1;
            }else{
                dow ++;
            }
        }
        return dow;
    }
    public Date nextDay(){
        int year = this.year;
        int month = this.month;
        int day = this.day;
        MDAYS[2] = isLeap() ? 29 : 28;
        if(day + 1 > MDAYS[month]){
            if(month +1 > 12) {
                year++;
                month = 1;
                day = 1;
            }else{
                month ++;
                day = 1;
            }

        }else{
            day ++;
        }
        return new Date(year,month,day);
    }
    public int nextFoy(){
        if(foy == -1) return -1;
        int lastDow = new Date(year,12,31,foy).getDayOfWeek();

        Main.db(lastDow);
        if(lastDow == 7)return 1;
        else return lastDow + 1;
    }

    public boolean isLeap(){
        boolean century = false;
        boolean leap = false;
        if(year%100 == 0){
            century = true;

        }
        if(century == false){
            if(year %4 == 0){
                leap = true;
            }
        }else{
            if(year%400 == 0){
                leap = true;
            }
        }
        return leap;
    }

    public int getPassedDaysInYear(){
        int passed = 0;
        for(int i = 1; i<month; i++){
            if(i == 2)MDAYS[2] = isLeap() ? 29 : 28;
            passed += MDAYS[i];
        }
        passed += day-1;
        return passed;
    }
    public int getDaysInYear(){
        if(isLeap()) return 366;
        else return 365;
    }

    public boolean inBounds(Date start, Date end){
        boolean inBounds = true;
        //start check
        if(year == start.year){
            if(month == start.month){
                if(day<start.day){
                    inBounds = false;
                }
            }else if(month < start.month){
                inBounds = false;
            }
        }else if(year < start.year){
            inBounds = false;
        }
        //end check
        if(year == end.year){
            if(month == end.month){
                if(day>end.day){
                    inBounds = false;
                }
            }else if(month > end.month){
                inBounds = false;
            }
        }else if(year > end.year){
            inBounds = false;
        }
        return inBounds;
    }
    public void printDate(){
        Main.db(month +"/" + day + "/" + year);
    }

    //**********************STATIC METHODS

    public static boolean isLeap(int year){
        boolean century = false;
        boolean leap = false;
        if(year%100 == 0){
            century = true;

        }
        if(century == false){
            if(year %4 == 0){
                leap = true;
            }
        }else{
            if(year%400 == 0){
                leap = true;
            }
        }
        return leap;
    }
    public static int getDaysInYear(int year){
        if(isLeap(year)) return 366;
        else return 365;
    }



    public static int daysFrom(Date start, Date end){
        if(start.year>end.year){
            Main.db("not valid");
            return 0;
        }
        int totalDays = 0;
        for(int i = start.year; i<end.year; i++){
            totalDays += getDaysInYear(i);
        }
        totalDays += end.getPassedDaysInYear();
        return totalDays;
    }
}
