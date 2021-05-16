package com.bjpowernode;

import com.bjpowernode.HelloMaven;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/20-19:27
 */

public class testHelloMaven {

    @Test
    public void testAddNum(){
        HelloMaven hello = new HelloMaven();
        int res = hello.addNum(10, 20);
        assertEquals(30, res);
        System.out.println("30="+res);
    }
    @Test
    public void testAddNum2(){
        HelloMaven hello = new HelloMaven();
        int res = hello.addNum(50, 20);
        assertEquals(70, res);
        System.out.println("70="+res);
    }
}
