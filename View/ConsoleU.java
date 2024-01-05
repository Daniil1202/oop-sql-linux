package View;

import listAnimal.ListItem;
import presenter.Presenter;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleU implements  View {
    private boolean work;
    private ClassMenu menu;
    private Scanner sc;
    private Presenter presenter;

    @Override
    public void start() throws IOException, ClassNotFoundException {
        System.out.println(" добавить животных в реестр");
        while (work){
            System.out.println(menu.menu());
            String choice = sc.nextLine();
            int choiceInt = Integer.parseInt(choice);
            menu.execute(choiceInt);
        }
    }

    public ConsoleU(){
        work = true;
        menu = new ClassMenu(this);
        presenter = new Presenter (this);
        sc = new Scanner(System.in);


    }
    public void finish(){
        sc.close();
        work = false;
    }
    public void sortByBirthday(){
        presenter.sortByBirtday();
    }
    public void addAnimal(){
        ListItem animal = presenter.createAnimal(sc);
        presenter.addAnimal(animal);

    }
    public void setCommands(){
        System.out.println("Введите ID животного");
        String choice = sc.nextLine();
        long choiceInt = Integer.parseInt(choice);
        System.out.println("Введите команду");
        String comand = sc.nextLine();
        presenter.setCommands(choiceInt,comand);
    }
    public String getCommands()
    {
        System.out.println("Введите ID животного");
        String choice =sc.nextLine();
        long choiceInt = Integer.parseInt(choice);
        return presenter.getCommands(choiceInt);
    }
    public void getInfo(){
        presenter.getInfo();
    }

    @Override
    public void printAnswer ( String answer){
        System.out.println(answer);
    }
    public void save() throws IOException{
        presenter.save();
    }
    public void load() throws IOException,ClassNotFoundException{
        presenter.load();
    }
}
