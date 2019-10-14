package cn.edu360.javase24.day01;

import java.util.Scanner;

public class HelloWrld {
    //类体
    //main方法是jvm在执行一个类时的执行入口
    public static void main(String[] args) {

        //方法体
        //获取用户输入提示信息
        System.out.println("请输入：");
        //创建一个jdk中用于获取终端输入信息的工具，并且定义了一个变量 scanner 来代表这个创建出来的工具
        Scanner scanner = new Scanner(System.in);
        //用工具从终端获取用户输入信息
        String name = scanner.nextLine();
        //拼接字符串
        String res = name + "好美\n"
                + name + "好坏\n"
                + name + "真是人见人爱。";
        //将拼接的字符串输出到终端
        System.out.println(res);

    }
}
