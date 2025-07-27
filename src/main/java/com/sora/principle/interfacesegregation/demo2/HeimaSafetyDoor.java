package com.sora.principle.interfacesegregation.demo2;

public class HeimaSafetyDoor implements AntiTheft ,FireProof,WaterProof{

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
