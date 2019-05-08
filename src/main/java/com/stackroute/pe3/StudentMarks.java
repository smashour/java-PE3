//Create a class called StudentMarks, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//grades of each of the students and saves them in an int array called stuGrades. Your program shall
//check that the grade is between 0 and 100 else has to trow an error message.


package com.stackroute.pe3;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        int lowest_score=0;
        int high_score=100;
        Scanner input = new Scanner(System.in); //scanner
        System.out.println("enter");
        int numOfStudents = input.nextInt(); //scanning number of students
        int stuGrades[] = new int[100];
        for (int i = 0; i < numOfStudents; i++)
        {
            stuGrades[i]=input.nextInt();   //scanning the grades
            if (stuGrades[i] <=lowest_score) //checking wheather score is less than 0
            {
                System.out.println("error");
            }
            else if (stuGrades[i]>=100){    //checking wheather score is higher than 100
                System.out.println("error");

            }
            else{
                System.out.println("valid");
            }
        }

    }
}
