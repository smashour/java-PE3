//a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//assume the digits are a ​ string​ and use split()



package com.stackroute.pe3;
import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {

            int flag=1;

            Scanner s=new Scanner(System.in);
            System.out.println("Enter the digits:   ");
            String input=s.nextLine();

            String[] inputArray=input.split(",");
            int[] inputArrayInteger=new int[4];

            for(int i=0;i<inputArray.length;i++)
            {
                inputArrayInteger[i]=Integer.parseInt(inputArray[i]);

            }

            for(int i=0;i<inputArray.length;i++)
            {
                int number=inputArrayInteger[i];
                if(inputArrayInteger[i+1]==(number+1) || inputArrayInteger[i+1]==(number-1)) {
                    i++;
                    flag=0;
                }
                else
                {
                    break;
                }
            }

            if(flag==0)
            {
                System.out.println("consecutive");
            }
            else
            {
                System.out.println("not");
            }
        }
    }