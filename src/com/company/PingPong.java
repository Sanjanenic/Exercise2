package com.company;

public class PingPong {
    public static void main(String[] args) {

        for (int i=0; i<100; i++){
        if(i%6==0){
            System.out.println (i+" ping pong");
        }
        else if (i%3==0){
            System.out.println (i+" pong");
        }
        else if(i%2==0){
            System.out.println (i+" ping");
        }
        else{
            System.out.println (i+" -");
        }

        }
    }

}


/*Create a new class with a main method. Write a while loop that
 increments a variable from 1 to 100. For each number,
check if it is divisible by the following values and output the respective term on the console
 */