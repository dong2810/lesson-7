package com.k003;

import java.util.Scanner;

public class students extends person {
    protected int point1;
    protected int point2;
    protected int sum;

    void change(students stu,int point_1, int point_2){
        stu.point1=point_1;
        stu.point2=point_2;
    }
    Scanner scan = new Scanner(System.in);
    @Override
    public void input() {
        super.input();

        System.out.println("Enter point of subject 1 : ");
        point1 = scan.nextInt();
        System.out.println("Enter point of subject 2 :");
        point2 = scan.nextInt();
    }
    @Override
    public void show() {
        super.show();
        System.out.print("\n" + name + "\n" + address + "\n" + point1 + "\n" + point2);
    }
    @Override
    public void main(){
        super.main();
        int point;
        students stu=new students();
        sum=stu.point1+stu.point2;
        int choice;
        stu.input();

        System.out.println("Change point 1: ");
        System.out.println("Change point 2");
        System.out.println("You choose? ");
        choice=scan.nextInt();
        switch (choice){
            case 1: {
                System.out.println("Change point 1: ");
                point = scan.nextInt();
                change(stu, point, stu.point2);
                break;
            }
            case 2: {
                System.out.println("Change point 2: ");
                point = scan.nextInt();
                change(stu, stu.point1, point);
                break;
            }

        }
        stu.show();
    }
}

