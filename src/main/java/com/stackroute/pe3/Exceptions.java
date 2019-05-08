//program that will generate ​ exceptions​ of type NegativeArraySizeException,
//IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
//displaying the message stored in the exception object.



package com.stackroute.pe3;
public class Exceptions {
    public static void main (String[] args)
    {

        int[] array = new int[4];
        try
        {
            int i = array[5];
            String s=null;
            int length=s.length();
            int[] negative=new int[-7];

            System.out.println("Inside try block");
        }

        catch(ArrayIndexOutOfBoundsException ex) //catch statement for array index out of bounds
        {
            System.out.println("Exception caught in Catch block");
        }

        catch(NullPointerException ex) //catch statement for null pointer exception
        {
            System.out.println("Exception caught");
        }

        catch(NegativeArraySizeException ex)    { //catch statement for negative array size
            System.out.println("EXception caught");
        }


        System.out.println("Outside try-catch clause");
    }
}

