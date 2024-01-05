package View.commands;

import View.ConsoleU;

public class GetCommands  extends Command{
    public GetCommands(ConsoleU consoleU) {
        super("Команды животонго по ID", consoleU);
    }

    @Override
    public void execute()  {
        super.getConsoleU().getCommands();
    }
}
