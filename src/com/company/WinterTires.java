package com.company;

import java.util.Scanner;

public class WinterTires {
    public static void main(String[] args) {

        double t;
        String s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Is Road slippery?! Y/N");
        s= sc.nextLine();

        System.out.println("Giv me a temperature!");
        t= sc.nextDouble();


        boolean slipp;
        if (s.equalsIgnoreCase("Y")){
            slipp=true;
        }
        else{
            slipp=false;

        }

        boolean useWinterTires;
        useWinterTires=  needWinterTires( t, slipp);
        if(useWinterTires==true){
            System.out.println("Use Winter Tires!");
        }
        else{
            System.out.println("Do not use Winter Tires!");
        }


    }

    public static boolean needWinterTires(double temperature,boolean slipperyRoad) {

        boolean result;
        if((temperature<10 && slipperyRoad==true) || temperature<4){
            result=true;

        }

        else {
            result=false;
        }

        return result;

        /*Winter tires should be used if:
•	Temperature < 10°C and the road is slippery.
•	Temperature < 4°C
Call the method in the main program using different values, and depending on the return, write the text "Please use winter tires" or "Winter tires are not required" and check if your results make sense.
´*/
    }
}
