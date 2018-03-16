package me.sn00pbom.euler.problem15;



import java.util.ArrayList;

public class Problem15 {

    public Problem15(){
        System.out.println("All combos");
        genCombos();
        printCombos();
        System.out.println("Valid combos");
        //clean();
        //printCombos();
        System.out.println("Total # combos\n" + combos.size());


    }

    public static int size = 2;
    public static int moves = size *2;
    public static int lastIndex = moves -1;

    public static boolean clean = false;
    public static ArrayList<int[]> combos = new ArrayList<>();



    public static void printCombos(){
        for(int[] combo : combos){
            for(int val : combo){
                System.out.print(val + ", ");
            }
            System.out.println();
        }
    }

    public static void clean(){
        ArrayList<int[]> cleaned = new ArrayList<>();
        for(int[] combo : combos){
            int ones = 0;
            int zeros = 0;
            boolean add = true;
            for(int val : combo){
                if(val == 1) ones ++;
                if(val == 0) zeros ++;
                if(val == 2){
                    ones = 3;
                    zeros = 3;
                    System.out.println("db");
                }
                if(ones > size || zeros > size){
                    add = false;
                    break;
//                    break;
                }
            }
            if(add){
                cleaned.add(combo);
            }
        }



        combos = cleaned;
    }
    public static void genCombos(){


        int[] pw = new int[moves];

        recurseArray(lastIndex,-1,pw,0,0);

        //return combos;
    }
    public static void recurseArray(int lastIndex, int index, int[] pw,int ones, int zeros){
        index ++;

        if(ones >size || zeros >size){

        }else{

        }

        for (pw[index] = 0 ; pw[index] <= 1 ; pw[index]++){
            if(index == lastIndex){
//                for(int x : pw){
//                    //System.out.print(x + ",- ");
//                }
//                int ones = 0;
//                int zeros = 0;
                boolean add = true;
//                if(clean){
//                    for(int val : pw){
//                        if(val == 1) ones ++;
//                        if(val == 0) zeros ++;
//                        if(val == 2){
//                            ones = 3;
//                            zeros = 3;
//                            System.out.println("db");
//                        }
//                        if(ones > size || zeros > size){
//                            add = false;
//
////
//                        }
//                    }
//                }

                if(add){

                    combos.add(pw.clone());
                }


                //System.out.println();
            }else{

//                for(int val : pw)
//                {
//                    if(val == 1) ones ++;
//                    if(val == 0) zeros ++;
//                }
                if(pw[index] == 0) zeros ++;
                if(pw[index] == 1) ones ++;
//                System.out.println(zeros);
//                System.out.println(ones);
//                if(ones > size || zeros > size){
                recurseArray(lastIndex,index,pw,ones,zeros);
//                }

            }
        }
    }

}
