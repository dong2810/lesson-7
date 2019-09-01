package com.k003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        person[] a=new person[30];
        Scanner scan=new Scanner(System.in);
        int number,choice;
        System.out.printf("Enter number of people: ");
        number=scan.nextInt();

        for (int i=0;i<number;i++) {
            System.out.println("\n1.Student");
            System.out.println("2.Employee");
            System.out.println("3.Customer");
            choice=scan.nextInt();
            switch (choice) {

                case 1: {
                    a[i] = new students();
                    a[i].main();
                    break;
                }
                case 2:{
                    a[i]=new staff();
                    a[i].main();
                    break;
                }
                case 3:{
                    a[i]=new customer();
                    a[i].main();
                    break;
                }
            }
        }
    }
}





