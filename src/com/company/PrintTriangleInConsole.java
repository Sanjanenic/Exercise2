package com.company;

public class PrintTriangleInConsole {
    public static void main(String[] args) {
        for (int i =0; i<10; i++){ //definise kiliko puta ce raditi
            for(int j=0; j<=i; j++){ //

                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
