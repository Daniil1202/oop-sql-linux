package servise;

import listAnimal.ListAnimal;
import listAnimal.ListItem;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Servise {
    private ListAnimal listAnimal;
    private FileHandler<ListAnimal> fileHandler;


    public Servise(){
        this.listAnimal = new ListAnimal();
        this.fileHandler = new FileHandler<ListAnimal>();
    }
    public ListItem createAnimal(Scanner sc){
        return listAnimal.createAnimal(sc);
    }
    public String addAnimal(ListItem animal){
        return listAnimal.addAnimal((ListAnimal) animal);
    }
    public String getInfo(){
        return listAnimal.toString();

    }
    public void sortByBirthday(){
        listAnimal.sortByBirthday();

    }
    public String getCommands(long Id){
        return listAnimal.getCommand(Id);
    }
    public void setCommands(long Id, String command){
        listAnimal.setCommands(Id,command);
    }
    public void save() throws IOException{
        fileHandler.load(listAnimal);
    }
    public void load() throws IOException, ClassNotFoundException {
        listAnimal = fileHandler.load();

    }

}
