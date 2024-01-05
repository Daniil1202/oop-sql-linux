package animals.packAnimals;

import animals.Animal;
import listAnimal.ListItem;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class PackAnimals implements Animal, ListItem, Serializable {
    private String name;
    private long Id;
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
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
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

    public void setCommands(String command) {
        List<String> commandArray = List.of(command.split(","));
        this.commands.addAll(commandArray);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id:" + this.Id + ", Имя : " +getName() + ", Дата рождения : " +
                getBirthday() +", команды: ");
        String result = String.join("," ,commands);
        return stringBuilder.toString();
    }
}
