package View.commands;

import View.ConsoleU;

public class SortBirthday extends Command{
    public SortBirthday(ConsoleU consoleU) {
        super("Сортировка по дате рождения", consoleU);
    }

    @Override
    public void execute() {
        super.getConsoleU().sortByBirthday();

    }
}
