package listAnimal;

import java.time.LocalDate;
import java.util.List;

public interface ListItem {
    public void setID(long id);
    public long getId();
    public void setCommands (String command);
    public List<String> getCommands(long Id);
    public void setName(String name);
    public void setBirthday(LocalDate birthday);
    public LocalDate getBirthday();


}
