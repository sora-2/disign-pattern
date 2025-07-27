package com.sora.patterns.creational.singleton.demo7;

import java.io.*;

/**
 * @Author : fanxuanyu
 * @Description : 测试使用序列化反序列化破坏单例
 * @Date : 2025/7/27
 * @Time : 20:42
 * @Version : 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writeObject2File();

        readObjectFromFile();
        readObjectFromFile();
    }

    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("D:\\轩宇\\OneDrive\\桌面\\a.txt"));
        Singleton singleton = (Singleton) stream.readObject();
        System.out.println(singleton);
        stream.close();
    }

    public static void writeObject2File() throws IOException {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("D:\\轩宇\\OneDrive\\桌面\\a.txt"));
        stream.writeObject(instance);
        stream.close();
    }
}
