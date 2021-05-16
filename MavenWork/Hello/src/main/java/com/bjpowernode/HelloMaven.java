package com.bjpowernode;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/20-19:27
 */

public class HelloMaven {

    public int addNum(int n1, int n2){
        System.out.println("HelloMaven addNumber");
        return n1+n2;
    }

    public static void main(String[] args) {
        HelloMaven hello = new HelloMaven();
        int res = hello.addNum(10,20);
        System.out.println(res);
    }
}
