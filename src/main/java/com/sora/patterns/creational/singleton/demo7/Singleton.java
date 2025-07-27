package com.sora.patterns.creational.singleton.demo7;


import java.io.Serial;
import java.io.Serializable;

/**
 * @Author : fanxuanyu
 * @Description : 懒汉式（静态内部类）
 * @Date : 2025/7/27
 * @Time : 19:43
 * @Version : 1.0
 */
public class Singleton implements Serializable {

    private static Boolean flag = false;
    private Singleton(){         //
        synchronized (Singleton.class){
            if (flag) {
                throw new RuntimeException("已有对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder{
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }


    //重写readResolve方法可以解决序列化反序列化破坏单例
    @Serial
    private Object readResolve(){
        return SingletonHolder.INSTANCE;
    }

}
