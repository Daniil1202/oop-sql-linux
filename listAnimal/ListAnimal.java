package listAnimal;
import animals.CompotarorAnimal;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListAnimal implements Iterable<ListItem>, Serializable {
    private long animalId;
    private String name;
    private ArrayList<ListItem> animals;

    public ListAnimal(){
        this.animals = new ArrayList<>();
    }
    public ListItem getAnimalId(long id){
        for(ListItem animal : animals){
            if (animal.getId() == id){
                return animal;
            }
        }
        return null;
    }

    public ListItem createAnimal (Scanner sc) {
        System.out.println("Введите класс животного");
        try {
            String animalType = sc.nextLine();
            ListItem animal_item = FarmAnimal.getAnimal(animalType);
            System.out.println("Введите имя животного");
            String name = sc.nextLine();
            System.out.println("Введите дату рождения животного( фомрмат:ДД_ММ_ГГ)");
            DateTimeFormatter fr = DateTimeFormatter.ofPattern("DD_MM_YYYY");
            LocalDate birthday = LocalDate.parse(sc.nextLine());
            System.out.println("Введите команды");
            String commands = sc.nextLine();
            animal_item.setName(name);
            animal_item.setBirthday(birthday);
            animal_item.setCommands(commands);
            return animal_item;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }
    public String addAnimal (ListAnimal animal){
        if(!animals.contains(animal)){
            animals.add(animal);
            animal.setId(animalId++);
        }
        return "Животное добавлено";
    }




    public void setCommands(long Id,String command){
        ListItem animal = getAnimalId(Id);
        animal.setCommands(command);
    }
    public String getCommand(long Id){
        ListItem animal = getAnimalId(Id);
        List<String> command = animal.getCommands(Id);
        return String.join(",", command);

    }
    public void sortByBirthday() {
        animals.sort(new CompotarorAnimal());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("В реестре");
        stringBuilder.append(animals.size());
        stringBuilder.append("Объект: \n");
        for (ListItem animal: animals
             ) {
            stringBuilder.append(animal);
            stringBuilder.append("\n");


        }
        return stringBuilder.toString();
    }

    @Override
    public Iterator<ListItem> iterator() {
        return new ListIterator<>(animals);
    }


}
