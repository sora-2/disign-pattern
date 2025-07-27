package com.sora.patterns.creational.singleton.demo2;


/**
 * @Author : fanxuanyu
 * @Description : 饿汉式（静态代码块）
 * @Date : 2025/7/27
 * @Time : 19:07
 * @Version : 1.0
 */
public class Singleton {

    private Singleton(){}

    private static Singleton instance;  //null

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
