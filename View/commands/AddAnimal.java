package View.commands;

import View.ConsoleU;

public class AddAnimal extends Command  {
    public AddAnimal(ConsoleU consoleU) {
        super("Добавление животного", consoleU);
    }

    @Override
    public void execute()  {
        super.getConsoleU().addAnimal();

    }
}
