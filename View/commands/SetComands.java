package View.commands;

import View.ConsoleU;

public class SetComands extends Command{
    public SetComands(ConsoleU consoleU) {
        super("Установит команду животному ", consoleU);
    }

    @Override
    public void execute()  {
        super.getConsoleU().setCommands();

    }
}
