package View;

import View.commands.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassMenu {
    private List<Command> commands;
    public ClassMenu(ConsoleU consoleU){
        this.commands= new ArrayList<>();
        commands.add(new AddAnimal(consoleU));
        commands.add(new SetComands(consoleU));
        commands.add(new GetCommands(consoleU));
        commands.add(new GetInfo(consoleU));
        commands.add(new Finish(consoleU));
        commands.add(new SortBirthday(consoleU));
        commands.add(new Load(consoleU));
        commands.add(new Save(consoleU));




    }
    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }
    public void execute( int nCommand)throws IOException,ClassNotFoundException {
        Command command = commands.get(nCommand -1 );
        command.execute();
    }
    public int size(){
        return commands.size();
    }

}
