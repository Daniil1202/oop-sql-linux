package View.commands;

import View.ConsoleU;

import java.io.IOException;

public abstract class Command {
    private String description;
    private ConsoleU consoleU;
    public Command(String description, ConsoleU consoleU){
        this.consoleU = consoleU;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public ConsoleU getConsoleU() {
        return consoleU;
    }
    public abstract void execute() throws IOException, ClassNotFoundException;
}
