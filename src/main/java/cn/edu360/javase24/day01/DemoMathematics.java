package cn.edu360.javase24.day01;

import java.util.Scanner;

public class DemoMathematics {
    public static void main(String[] args) {
        System.out.println("请输入a:");
        Scanner scanner1 = new Scanner(System.in);
        String stra = scanner1.nextLine();
        int inta = Integer.parseInt(stra);

        System.out.println("请输入b:");
        Scanner scanner2 = new Scanner(System.in);
        String strb = scanner2.nextLine();
        int intb = Integer.parseInt(strb);

        int intc1 = inta + intb;
        int intc2 = inta - intb;
        int intc3 = inta * intb;
        float intc4 = (float) inta / (float) intb;


        System.out.println(inta + " + " + intb + " = " + intc1);
        System.out.println(inta + " - " + intb + " = " + intc2);
        System.out.println(inta + " * " + intb + " = " + intc3);
        System.out.println(inta + " / " + intb + " = " + intc4);


    }
}
