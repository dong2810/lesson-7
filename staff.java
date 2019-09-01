package com.k003;

import java.util.Scanner;

public class staff extends person {
    protected long salary;
    protected String position;

    void change(staff st,int salary_1,String position_1){
        st.salary=salary_1;
        st.position=position_1;
    }

    Scanner scan = new Scanner(System.in);
    public void input(){
        super.input();
        System.out.println("Enter the salary: ");
        salary=scan.nextInt();
        System.out.println("Enter the positon ");
        scan.nextLine();
        position=scan.nextLine();
    }

    public void show(){
        super.show();
        System.out.print("\n" + name + "\n" + address + "\n" + salary + "\n" + position);
    }

    public void main(){
        super.main();
        int choice;
        staff st=new staff();
        int salaryChange;
        st.input();
        String positionChange;
        System.out.println("Change salary: ");
        System.out.println("Change position: ");
        System.out.println("You choose? ");
        choice=scan.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Enter the salary want to change. ");
                salaryChange=scan.nextInt();
                change(st,salaryChange,st.position);
            }
            case 2:{
                System.out.println("Enter the position want to change. ");
                scan.nextLine();
                positionChange=scan.nextLine();
                change(st, (int) st.salary,positionChange);
            }

        }
        st.show();
    }
}
