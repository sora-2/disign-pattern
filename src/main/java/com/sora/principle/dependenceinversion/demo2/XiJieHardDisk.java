package com.sora.principle.dependenceinversion.demo2;

public class XiJieHardDisk implements HardDisk{

    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据" + data);
    }

    public String get() {
        System.out.println("使用希捷硬盘取数据");
        return "数据";
    }
}
