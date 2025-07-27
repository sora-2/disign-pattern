package com.sora.principle.interfacesegregation.demo2;

public class ItcastSafetyDoor implements AntiTheft,FireProof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
