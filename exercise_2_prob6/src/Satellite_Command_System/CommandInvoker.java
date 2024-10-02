package Satellite_Command_System;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

class CommandInvoker {
    private static final Logger logger = Logger.getLogger(CommandInvoker.class.getName());
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        commandHistory.add(command);
        command.execute();
        logger.info("Executed command: " + command.getClass().getSimpleName());
    }

    public void showHistory() {
        System.out.println("Command history:");
        for (Command command : commandHistory) {
            System.out.println(command.getClass().getSimpleName());
        }
        logger.info("Displayed command history.");
    }
}
