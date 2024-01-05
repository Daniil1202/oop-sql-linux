package View.commands;

import View.ConsoleU;

public class Finish extends Command{
    public Finish(ConsoleU consoleU) {
        super("Завершение работы", consoleU);
    }

    @Override
    public void execute()  {
        super.getConsoleU().finish();

    }
}
