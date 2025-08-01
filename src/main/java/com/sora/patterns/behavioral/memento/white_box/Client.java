package com.sora.patterns.behavioral.memento.white_box;

public class Client {
    public static void main(String[] args) {

        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.showStatus();

        RoleStateCareTaker roleStateCareTaker = new RoleStateCareTaker();
        roleStateCareTaker.setRoleStateMemento(new RoleStateMemento(gameRole.getHp(), gameRole.getAtk(), gameRole.getDef()));

        gameRole.fight();
        gameRole.showStatus();

        gameRole.recover(roleStateCareTaker.getRoleStateMemento());
        gameRole.showStatus();
    }
}
