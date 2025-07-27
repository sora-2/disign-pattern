package com.sora.principle.interfacesegregation.demo2;


public class Client {
    public static void main(String[] args) {
        HeimaSafetyDoor heimaSafetyDoor = new HeimaSafetyDoor();
        heimaSafetyDoor.antiTheft();
        heimaSafetyDoor.fireProof();
        heimaSafetyDoor.waterProof();

        System.out.println("===========");

        ItcastSafetyDoor itcastSafetyDoor = new ItcastSafetyDoor();
        itcastSafetyDoor.antiTheft();
        itcastSafetyDoor.fireProof();
    }
}
