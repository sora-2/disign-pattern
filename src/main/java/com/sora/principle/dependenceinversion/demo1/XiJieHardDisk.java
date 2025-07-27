package com.sora.principle.dependenceinversion.demo1;

public class XiJieHardDisk {

    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据" + data);
    }

    public String get() {
        System.out.println("使用希捷硬盘取数据");
        return "数据";
    }
}
