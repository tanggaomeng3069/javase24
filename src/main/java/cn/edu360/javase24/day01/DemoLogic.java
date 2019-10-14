package cn.edu360.javase24.day01;

import java.util.Scanner;

public class DemoLogic {
    public static void main(String[] args) {
        System.out.println("请输入客户姓名：");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if (name.equals("tom")) {
            System.out.println("欢迎您，" + name);
        }else if (name.equals("jim")){
            System.out.println("您好，" + name);
        }else {
            System.out.println("对不起，查无此人！！");
        }
    }
}
