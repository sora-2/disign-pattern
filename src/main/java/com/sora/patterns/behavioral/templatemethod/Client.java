package com.sora.patterns.behavioral.templatemethod;

public class Client {
    public static void main(String[] args) {
        Concrete_Baocai concreteBaocai = new Concrete_Baocai();
        concreteBaocai.process();
    }
}
