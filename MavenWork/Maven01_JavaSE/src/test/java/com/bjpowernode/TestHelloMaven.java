package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/21-11:29
 */

public class TestHelloMaven {

    @Test
    public void testAddNum(){
        System.out.println("testAddNum1111111");
        HelloMaven hello = new HelloMaven();
        int res = hello.addNum(10,20);
        Assert.assertEquals(30,res);

    }

    @Test
    public void testAddNum2(){
        System.out.println("testAddNum2222222");
        HelloMaven hello = new HelloMaven();
        int res = hello.addNum(10,20);
        Assert.assertEquals(30,res);

    }
}
