package com.design.patterns.behavioral.comand;

import java.util.Stack;

public class ACRemote {
    ICommand iCommand;
    Stack<ICommand> history = new Stack<>();

    public void back() {

        if (!history.isEmpty()) history.pop();
        if (!history.isEmpty()) {
            iCommand = history.pop();
            iCommand.execute();
        }
    }

    public void pressButton(ICommand command) {
        command.execute();
        history.add(command);
    }
}
