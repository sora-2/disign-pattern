package com.sora.patterns.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("rose",mediatorStructure);
        Tenant tenant = new Tenant("jack",mediatorStructure);

        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);

        tenant.contact("there's shit in the house");
        houseOwner.contact("bullshit");
    }
}
