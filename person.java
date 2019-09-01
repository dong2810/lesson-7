package com.k003;

import java.util.Scanner;

public class person {
    Scanner scan=new Scanner(System.in);
    protected String name;
    protected String address;
    public void input(){
        System.out.println("Enter the name: ");
        name=scan.nextLine();
        System.out.println("Enter the address: ");
        address=scan.nextLine();
    }

    public void show(){

    }
    public void main(){

    }
}
