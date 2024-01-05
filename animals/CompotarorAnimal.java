package animals;

import listAnimal.ListItem;

import java.util.Comparator;

public class CompotarorAnimal implements Comparator<ListItem> {
    @Override
    public int compare(ListItem o1, ListItem o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
