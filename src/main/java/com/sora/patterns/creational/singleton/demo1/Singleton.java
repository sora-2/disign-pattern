package com.sora.patterns.creational.singleton.demo1;


/**
 * @Author : fanxuanyu
 * @Description : 饿汉式（静态变量）
 * @Date : 2025/7/27
 * @Time : 19:05
 * @Version : 1.0
 */
public class Singleton {
    private Singleton(){

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
