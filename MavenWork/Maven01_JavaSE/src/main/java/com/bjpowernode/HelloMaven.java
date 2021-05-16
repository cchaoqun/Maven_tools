package com.bjpowernode;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/21-11:28
 */

public class HelloMaven {
    public int addNum(int n1, int n2){
        return n1+n2;
    }

    public static void main(String[] args) {
        HelloMaven hello = new HelloMaven();
        int res = hello.addNum(10,20);
        System.out.println("res="+res);
    }
}
