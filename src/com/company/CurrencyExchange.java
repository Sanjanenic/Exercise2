package com.company;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;

public class CurrencyExchange {
    public static void main(String[] args) {
  exchangeCurrency("CAD", 20);
    }

    public static double exchangeCurrency(String currencyID, double value){
         double result = 0.0;// moram uvijek da unutar metode definisem i izijalizuejm varijeblu koju ce vracati metoda
        if(currencyID.equals("HUF")){
             result = value* 328.61;
            //return result;ovako ne moze jer ne kraju opet ne prepoznaje tu avrijablu
            System.out.println(value + " HUF is "+ result);

        }
        else if (currencyID.equals("SEK")){
             result = value* 10.76;

            System.out.println(value + "SEK is "+ result);
        }
        else if (currencyID.equals("USD")){
             result = value* 1.12;

            System.out.println(value + "USD is "+ result);
            
        }
        else  if(currencyID.equals("CAD")){
             result = value* 1.47;

           System.out.println(value + "CAD is "+ result);
        }
        return result;

    }
}

/*Create a new class with a main method. Create another method:
public static double exchangeCurrency(String currencyID, double value) {…}
This method converts a given value into a target currency. The method takes a String as a target currency (e.g.: "HUF", "SEK", "USD", "CAD") and converts the passed value (parameter) into the target currency.
Example
exchangeCurrency(“HUF“, 12) results in 12 * 328,61
exchangeCurrency(“SEK“, 100) results in 100 * 10,76
Remember: comparing Strings works with the .equals() method
Currency	Conversion rate
HUF	328,61
SEK	10,76
USD	1,12
CAD	1,47*/
