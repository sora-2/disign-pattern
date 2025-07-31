package com.sora.patterns.behavioral.mediator;

public class MediatorStructure extends Mediator{

    private HouseOwner houseOwner;

    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String msg, Person person) {
        if(person == houseOwner){
            tenant.getMsg(msg);
        }else{
            houseOwner.getMsg(msg);
        }
    }
}
