package com.timesTable21;

import java.util.Scanner;

public class Timestable {
    public static void main(String[] args) {
        timetable();


    }


    public static void timetable() {
        Scanner sc = new Scanner(System.in);
        int N;


        System.out.println("please enter a number N");
        N = sc.nextInt();


        if (N >= 10 && N <= 20) {
            System.out.println("\tTimestable from 1 to" + N);

            int i,j;



            for (i = 1; i <= N; i++) {
                System.out.print("\t" + i);
            }
            System.out.println("\n\t__________________________________________________________");

            for (i = 1; i <= 12; i++) {
                System.out.print("\n" + i + "\t|");
                for (j = 1; j <= N; j++) {
                    System.out.print(i * j + "\t");
                }
            }


        } else
        {
            System.out.printf("%d is not between 10 and 20",N);
        }
    }
}
