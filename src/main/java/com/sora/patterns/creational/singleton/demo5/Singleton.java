package com.sora.patterns.creational.singleton.demo5;


/**
 * @Author : fanxuanyu
 * @Description : 懒汉式（静态内部类）
 * @Date : 2025/7/27
 * @Time : 19:43
 * @Version : 1.0
 */
public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
