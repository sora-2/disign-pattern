package com.sora.patterns.creational.singleton.demo4;


/**
 * @Author : fanxuanyu
 * @Description : 懒汉式（双重检查锁）
 * @Date : 2025/7/27
 * @Time : 19:43
 * @Version : 1.0
 */
public class Singleton {
    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    //抢到锁之后再次判断是否为null
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
