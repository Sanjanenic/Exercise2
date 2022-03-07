package com.company;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};

      int[]result=reverse(array1);

        for(int i=0; i<=result.length-1; i++){
            System.out.print(result[i] + " ");

        }
        System.out.println();

    }
    public static int[] reverse(int[] original){
        int[] result = new int[original.length];


        for(int i=0; i<=original.length-1; i++){
            result[i]=original[original.length-1-i];

        }
        return result;

    }
}

/*In your main method create and initialize an int array.
Write a static public method with the following signature:
public static int[] reverse(int[] original) {...}
The method should be able to create a new array. This new array should contain the same numbers as the passed array, but in reverse order. The resulting array should be returned.
Example:
1,2,3,4 => 4,3,2,1
*/

