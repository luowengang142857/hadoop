package com.star.util;

/**
 * @author lwg
 * @Date: 2019/6/11 22:08
 */
public class A {
    public static void main(String[] args) {
        /**
         * 你知道吗，这是我拉取下来的代码，并且修改了其中的类
         */
        final A a = new A();
        a.print();
        new Thread(new Runnable() {
            public void run() {
                a.print();
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                a.print();
            }
        }).start();
    }

    public static void print(){
        System.out.println("h");
        System.out.println("e");
        System.out.println("l");
        System.out.println("l");
        System.out.println("o");
    }
}
