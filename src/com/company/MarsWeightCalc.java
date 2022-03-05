package com.company;

public class MarsWeightCalc {

    public static void main(String[] args) {

        float earthWeight;
        float marsWeight ;
        double marsWeightINDouble;
	    int marsWeightINInt;

        earthWeight = 84;
        marsWeight = (earthWeight =  0.38F);
        System.out.println(earthWeight + "Fg on Earth is " + marsWeight + "Kg on Mars" );
// assignment (compatible types) from float to double
        marsWeightINDouble = marsWeight;
        System.out.println ("Kilogram on Mars after converting to Double" +marsWeightINDouble);

// printing a variable  limiting the length to 4 decimal places

        System.out.printf("Kilogram in Mars displayed to four decimal palces: %.4f %n", marsWeightINDouble);

//  a floating point type cast in integer

        marsWeightINInt = (int)marsWeightINDouble;
        System.out.println("Kilograms on Mars casted to integer" +marsWeightINInt);
// casting an int type to char
        char c = (char)marsWeightINInt;
        System.out.println("the ASCII table equivalent  of marsWeightInInt is:" +c);
//assign the value of performing some mathematical  operation on the char character to the new int variable
      int exampleOfMathOnChar = c * c;
      System.out.println("An example of a mathematical operation on the char type: "+ exampleOfMathOnChar);
    }
}
