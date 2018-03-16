package me.sn00pbom.euler;

import me.sn00pbom.euler.problem11.Problem11;
import me.sn00pbom.euler.problem13.Problem13;
import me.sn00pbom.euler.problem15.Problem15;
import me.sn00pbom.euler.problem18.Problem18;
import me.sn00pbom.euler.problem19.Problem19;
import me.sn00pbom.euler.problem21.Problem21;
import me.sn00pbom.euler.problem22.Problem22;

public class Main {

    public static void main(String[] args) {
        //new Problem11();
//        new Problem13();
        //new Problem15();
        //new Problem18();
        //new Problem19();
        //
        // new Problem21();
        new Problem22();

    }

    public static double factorial(double x){
        for(double i = x-1; i>=1; i--){
            x = x*i;
        }
        return x;
    }
    public static void db(Object object){
        System.out.println("db " +object);
    }
}
