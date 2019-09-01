package com.k003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        bill b=new rent();
        b.inputDate();

    }
}

class bill {
    Scanner scan = new Scanner(System.in);
    int id, date, month, year;
    String name;
    int idRoom, price;


    public void input() {
            System.out.print("Nhập mã hóa đơn: ");
            id = scan.nextInt();
            System.out.print("Ngày hóa đơn: ");
            date = scan.nextInt();
            System.out.print(" Tháng: ");
            month = scan.nextInt();
            System.out.print(" Năm: ");
            year = scan.nextInt();

            System.out.print("Tên khách hàng: ");
            scan.nextLine();
            name = scan.nextLine();
            System.out.print("Mã phòng: ");
            idRoom = scan.nextInt();
            System.out.print("Đơn giá: ");
            price = scan.nextInt();

        }
//    public void show(){
//        System.out.println("Mã hóa đơn : "+id+"\nNgày "+date+" tháng: "+month+" năm: "+year+"\n Tên khách hàng: "+name+
//                "\n Mã phòng: "+idRoom+"\n Đơn giá: "+price);
//    }
    public void inputHour(){

    }
    public void inputDate(){
    }
}

class rent extends bill{
    int intoMoney;
    int hourRents;
    Scanner scan = new Scanner(System.in);

        public void inputDate(){
            System.out.println("Nhap so gio thue: ");
            hourRents=scan.nextInt();

            if (hourRents<30) {
                System.out.println("Hoa don theo gio");
                super.input();
                intoMoney=hourRents*price;
                System.out.println("\nMã hóa đơn : "+id+"\nNgày "+date+" tháng "+month+" năm "+year+"\n Tên khách hàng: "+name+
                        "\n Mã phòng: "+idRoom+"\n Đơn giá: "+price+"\n Số lượng tiền: "+intoMoney);
            }
            else{
                System.out.println("Hoa don theo ngay: ");
                super.input();
                intoMoney=hourRents*price;
                System.out.println("\nMã hóa đơn : "+id+"\nNgày "+date+" tháng "+month+" năm "+year+"\nTên khách hàng: "+name+
                        "\nMã phòng: "+idRoom+"\nĐơn giá: "+price+"\nSố lượng tiền: "+intoMoney);
            }
        }
}


