package me.sn00pbom.euler;


import java.util.ArrayList;

public class Problem21 {
    public Problem21(){


        int out = 0;
        for(int x : amicables(10000)){
            out += x;
        }
        Main.db(out);

    }
    public ArrayList<Integer> getDivisors(int x){
        ArrayList<Integer> divs = new ArrayList<>();
        for(int i = 1; i<x ; i++){
            if(x%i == 0){
                divs.add((int)i);
            }
        }
        return divs;
    }
    static ArrayList<Integer> getFastDivisors(int n)
    {
        ArrayList<Integer> divs = new ArrayList<>();
        // Note that this loop runs till square root
        for (int i=1; i<=Math.sqrt(n)+1; i++)
        {
            if (n%i==0)
            {

                if(n/i != n){
                    if (n/i == i){
                        divs.add(i);
                    }else{
                        divs.add(i);
                        divs.add(n/i);
                    }
                }




            }
        }
        return divs;
    }
    public ArrayList<Integer> amicables(int under){
        ArrayList<Integer> amicables = new ArrayList<>();
        for(int i = 1; i<under; i++){
            for(int j = 1; j<under; j++){
                if(d(i) == j && d(j) == i && i!=j &&
                        !(amicables.contains(i) || amicables.contains(j) )){
                    Main.db(i +", " + j);
                    amicables.add(i);
                    amicables.add(j);
                }
            }
        }
        return amicables;
    }
    public int d(int n){
        int maxD = (int)Math.sqrt(n);
        int sum=1;
        for(int i = 2; i <= maxD; i++)
        {
            if(n % i == 0)
            {
                sum += i;
                int d = n/i;
                if(d!=i)
                    sum+=d;
            }
        }
        return sum;
    }
}
