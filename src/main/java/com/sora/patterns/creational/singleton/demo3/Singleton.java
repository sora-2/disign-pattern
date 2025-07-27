package com.sora.patterns.creational.singleton.demo3;

/**
 * @Author : fanxuanyu
 * @Description : 懒汉式
 * @Date : 2025/7/27
 * @Time : 19:20
 * @Version : 1.0
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance;

//    public static Singleton getInstance(){
//        if (instance == null) {
//            // 此处存在线程安全问题
//            instance = new Singleton();
//        }
//        return instance;
//    }

    public static synchronized Singleton getInstance(){
        if (instance == null) {
            // 此处存在线程安全问题
            instance = new Singleton();
        }
        return instance;
    }
}
