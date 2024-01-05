package presenter;

import listAnimal.ListItem;
import servise.Servise;

import javax.swing.text.View;
import java.io.IOException;
import java.util.Scanner;

public class Presenter {
    private Servise servise;
    private View view;

    public Presenter( View view) {
        this.servise = new Servise();
        this.view = view;
    }
    public ListItem createAnimal(Scanner sc) {
        return servise.createAnimal(sc);
    }
    public String addAnimal (ListItem animal) {
        return servise.addAnimal(animal);

    }
    public void sortByBirtday(){
        servise.sortByBirthday();
    }
    public String getInfo(){
        String answer = servise.getInfo();
        view.printAnswer(answer);
    }
    public String getCommands(long Id){
        return servise.getCommands(Id);
    }
    public void setCommands(Long Id, String command) {
        servise.setCommands(Id, command);
    }
    public void save() throws IOException {
        servise.save();
        System.out.println("Данные сохранены в файл");
    }
    public void load() throws IOException, ClassNotFoundException {
        servise.load();
        System.out.println("Данные загружены из файла");
    }



}

