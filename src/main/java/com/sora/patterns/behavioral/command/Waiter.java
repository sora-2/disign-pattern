package com.sora.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> commandList = new ArrayList<>();


    public void setCommandList(Command command) {
        this.commandList.add(command);
    }

    public void orderComing(){
        for (Command command : commandList) {
            command.exec();
        }
    }
}
