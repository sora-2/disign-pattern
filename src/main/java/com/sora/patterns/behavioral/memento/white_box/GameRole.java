package com.sora.patterns.behavioral.memento.white_box;

public class GameRole {

    private int hp;
    private int atk;
    private int def;

    public void init(){
        this.atk = 10;
        this.def = 10;
        this.hp = 100;
    }

    public void fight(){
        this.atk = 0;
        this.def = 0;
        this.hp = 0;
    }

    public RoleStateMemento saveState(){
        RoleStateMemento m = new RoleStateMemento(hp,atk,def);

        return m;
    }
    public void recover(RoleStateMemento m){
        this.atk = m.getAtk();
        this.def = m.getDef();
        this.hp = m.getHp();
    }

    public void showStatus(){
        System.out.println(atk+" "+def+" "+hp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
