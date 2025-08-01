package com.sora.patterns.behavioral.memento.black_box;

import com.sora.patterns.behavioral.memento.white_box.RoleStateMemento;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.showStatus();

        RoleStateCareTaker roleStateCareTaker = new RoleStateCareTaker();
        roleStateCareTaker.setMemento(gameRole.saveState());

        gameRole.fight();
        gameRole.showStatus();

        gameRole.recover(roleStateCareTaker.getMemento());
        gameRole.showStatus();
    }
}
