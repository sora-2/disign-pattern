package com.sora.patterns.creational.singleton.demo8;

import com.sora.patterns.creational.singleton.demo7.Singleton;

import java.lang.reflect.Constructor;

/**
 * @Author : fanxuanyu
 * @Description : 测试使用反射破坏单例
 * @Date : 2025/7/27
 * @Time : 20:52
 * @Version : 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Class<Singleton> singletonClass = Singleton.class;
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton singleton1 = declaredConstructor.newInstance();
        Singleton singleton2 = declaredConstructor.newInstance();

        System.out.println(singleton1 == singleton2);//false
    }
}
