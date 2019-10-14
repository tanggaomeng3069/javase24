package cn.edu360.javase24.day01;

import java.util.Scanner;

public class DemoLogicDigital {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if(num > 8){
            System.out.println("您猜的太大了");
        }else if(num < 8){
            System.out.println("您猜的太小了");
        }else {
            System.out.println("恭喜您，猜对了！！");
        }

    }
}
