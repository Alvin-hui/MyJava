package com.company;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by kingdee on 2016/8/12.
 */
public class MainTest {
    private Main main;
    @BeforeMethod
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testTestCase() throws Exception {
        assertEquals("hello world!", main.testCase());
    }

}