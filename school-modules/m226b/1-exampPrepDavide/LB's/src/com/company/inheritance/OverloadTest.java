package com.company.inheritance;

public class OverloadTest {
    public void test(String s) {
        System.out.println(s);
    }

    public void test(String s, int i) {
        System.out.println(s + " " + i);
    }
}
