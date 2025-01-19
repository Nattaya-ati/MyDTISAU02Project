package com.sau.workshop;

import java.util.Scanner;

public class WorkshopCF01 {
    //สร้างเมนูให้ผู้ใช้เลือก 1 , 2 , หรือ 3 หากไม่ใช่ 1 หรือ 2 หรือ 3 ให้แสดงข้อความขอบคุณ และ จบโปรแกรม
    //กรณีเลือก 1 คำนวนพื้นที่ สี่เหลื่ยม ป้อน กว้าง  ยาว คำนวณ แสดงผล (กว้าง*ยาว)
    //กรณีเลือก 2 คำนวนพื้นที่ สามเหลี่ยม ป้อน ฐาน สูง คำนวณ แสดงผล (ฐาน*สูง/2)
    //กรณีเลือก 3 คำนวนพื้นที่ วงกลม ป้อน รัศมี คำนวณ แสดงผล  (¶R²)

    public static void main(String[] args) {
        int menu;
        double wi, lo, ba, hi, ra, areaSquare, areaTriangle, areaCircle;

        Scanner sc = new Scanner(System.in);

        System.out.println("++++++++++++++++++++++");
        System.out.println("                   Shape Area Program");
        System.out.println("++++++++++++++++++++++");
        System.out.println("1.Square Area");
        System.out.println("2.Triangle Area");
        System.out.println("3.Circle Area");
        System.out.println("++++++++++++++++++++++");
        System.out.println("Select menu");
        menu = sc.nextInt();
        System.out.println("++++++++++++++++++++++");

        if (menu == 1) {

            //คำนวณพื้นที่สี่เหลี่ยม
            System.out.println("Input width:");
            wi=sc.nextDouble();
            System.out.println("Input long:");
            lo=sc.nextDouble();
            areaSquare=wi*lo;
            System.out.println("Area square is:"+areaSquare);
        } else if (menu == 2) {

            //คำนวณพื้นที่สามเหลี่ยม
            System.out.println("Input base:");
            ba=sc.nextDouble();
            System.out.println("Input hight:");
            hi=sc.nextDouble();
            areaTriangle = ba*hi/2;
            System.out.println("Area triangle is:"+areaTriangle);
            } else if (menu == 3) {

            //คำนวณพื้นที่วงกลม
            System.out.println("Input radius:");
            ra = sc.nextDouble();
            areaCircle = Math.PI * Math.pow(ra, 2);
            System.out.println("Area circle is:" + areaCircle);
            
            //ถ้าตอบเป็นอย่างอื่น
        } else {
            System.out.println("Thank you na ja ");
        }
        System.out.println("++++++++++++++++++++++");

    }

}
