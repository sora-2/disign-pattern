package com.sora.principle.openclosed;

public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin abstractSkin) {
        this.skin = abstractSkin;
    }

    public void display(){
        skin.display();
    }


}
