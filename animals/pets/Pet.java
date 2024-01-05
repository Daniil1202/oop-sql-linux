package animals.pets;

import animals.Animal;
import listAnimal.ListAnimal;
import listAnimal.ListItem;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Pet  implements Animal, Serializable, ListItem {
    private String name;
    private long id;
    private LocalDate age;
    private LocalDate birthday;
    private List<String> commands = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        List<String> commandsArray = List.of(commands.split(","));
        this.commands.addAll(commandsArray);
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id:" + this.id + ", Имя : " +getName() + ", Дата рождения : " +
                getBirthday() + ", команды:");
        String result = String.join(",", commands);
        return stringBuilder.toString();
    }
}
