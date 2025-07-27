package com.sora.principle.openclosed;

public class Client {
    public static void main(String[] args) {

        SougouInput sougouInput = new SougouInput();

        AbstractSkin defaultSkin = new DefaultSkin();

        sougouInput.setSkin(defaultSkin);

        sougouInput.display();

    }
}
