package com.k003;

import java.util.Scanner;

public class customer extends person {
    protected String car;
    Scanner scan = new Scanner(System.in);
    public void input(){
        super.input();
        System.out.println("Enter the type of car: ");
        car=scan.nextLine();
    }
    public  void show(){
        super.show();
        System.out.print("\n" + name + "\n" + address + "\n" + car);
    }

    public void main(){
        super.main();
        customer cu=new customer();
        cu.input();
        cu.show();
    }
}
