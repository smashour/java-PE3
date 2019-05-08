
//program to compute the addition of two matrix, Read the number of rows and columns
//as input, also the values of each matrix


package com.stackroute.pe3;
import java.util.Scanner;

public class MatrixAddition {
    int m,n;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows & columns in matrix");
        int m=input.nextInt();//scanning rows
        int n=input.nextInt(); //scanning columns
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        int[][] c=new int[m][n];
        System.out.println("enter first matrix");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("enter second matrix");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++){
                b[i][j]=input.nextInt();
            }
        }
        for (int i=0;i<m;i++) //matrix addition
        {
            for (int j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        //printing matrix after addition
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++){
                System.out.println(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
