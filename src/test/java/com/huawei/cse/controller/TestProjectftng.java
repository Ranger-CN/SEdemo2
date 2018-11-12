package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectftng {

        ProjectftngDelegate projectftngDelegate = new ProjectftngDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectftngDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}