package com.company;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;

public class CurrencyExchange {
    public static void main(String[] args) {


        double value=20;
        String id ="HUF";
        double result= exchangeCurrency(id,value);
        System.out.println(value + id +" is " + result);
    }

    public static double exchangeCurrency(String currencyID, double value){
         double result = 0.0;// moram uvijek da unutar metode definisem i izijalizuejm varijeblu koju ce vracati metoda
        if(currencyID.equals("HUF")){
             result = value* 328.61;

        }
        else if (currencyID.equals("SEK")){
             result = value* 10.76;

        }
        else if (currencyID.equals("USD")){
             result = value* 1.12;

        }
        else  if(currencyID.equals("CAD")){
             result = value* 1.47;

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
