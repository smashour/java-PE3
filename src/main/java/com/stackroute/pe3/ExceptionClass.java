//Create a class with a main( ) that throws an object of class Exception inside a try block.
//a. Give the constructor for Exception a ​ String​ argument.
//b. Catch the exception inside a catch clause and print the ​ String​ argument.
//c. Add a finally clause and print a message to prove you were there.


package com.stackroute.pe3;
import javax.naming.LimitExceededException;

public class ExceptionClass {
    private static String name="Sherin";

    public ExceptionClass(String name) {
        this.name = name;
    }

    public int getLength() throws LimitExceededException
    {
        int length=name.length();
        return length;
    }

    public static void main(String[] args) {
        try{
            ExceptionClass ex=new ExceptionClass(name);
            int length=ex.getLength();


            if(length>2)    //check wheather length is greater than 2 and throw exception
                throw new LimitExceededException(name);
            System.out.println("Inside try block");


        } catch (Exception LimitExceededException)  //catch statement for exception
        {
            System.out.println(name);
            System.out.println("Exception caught");
        }
        finally  //final block
        {
            System.out.println("finally block executed");
        }
    }
}


