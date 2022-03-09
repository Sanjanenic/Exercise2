package com.company;


import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int[]numbers = new int []{10,20,30};

        calculateSum(numbers);
 //Scanner sc =new Scanner(System.in);
        //System.out.println("Enter the size of array!");
       // int size= sc.nextInt();
       // int array= new

    }
    public static int calculateSum(int[] numbers){
   int sum=0;

   for (int i =0; i<numbers.length; i++){
       sum += numbers[i];
   }
        System.out.println(sum);
   return sum;

    }
}

/*Write a static public method with the following signature:
public static int calculateSum(int[] numbers) {...}
The method should calculate the sum of the elements in the array and return it.
*/