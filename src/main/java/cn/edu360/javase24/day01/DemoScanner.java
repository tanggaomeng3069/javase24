package cn.edu360.javase24.day01;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String res = str + "您好，欢迎来到美丽的北京，祝" + str + "玩的开心！！";

        System.out.println(res);
    }
}
