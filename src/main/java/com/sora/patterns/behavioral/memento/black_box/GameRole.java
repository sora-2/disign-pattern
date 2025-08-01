package com.sora.patterns.behavioral.memento.black_box;

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

    public Memento saveState(){
        Memento m = new RoleStateMemento(hp,atk,def);
        return m;
    }
    public void recover(Memento m){
        RoleStateMemento roleStateMemento = (RoleStateMemento) m;
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
        this.hp = roleStateMemento.getHp();
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

    private class RoleStateMemento implements Memento{

        private int hp;
        private int atk;
        private int def;

        public RoleStateMemento() {
        }

        public RoleStateMemento(int hp, int atk, int def) {
            this.hp = hp;
            this.atk = atk;
            this.def = def;
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
}
