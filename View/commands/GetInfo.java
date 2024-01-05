package View.commands;

import View.ConsoleU;

public class GetInfo extends Command{

    public GetInfo(ConsoleU consoleU) {
        super("Информация о реестре", consoleU);
    }




    @Override
    public void execute() {
        super.getConsoleU().getInfo();
    }
}
