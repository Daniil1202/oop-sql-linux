package listAnimal;

import java.util.Iterator;
import java.util.List;

public class ListIterator <Animal> implements Iterator<Animal>  {
    private int index;
    private List<Animal> animals;
    public ListIterator(List<Animal> animals){
        this.animals = animals;
    }
    @Override
    public boolean hasNext() {
        return animals.size() > index;
    }
    @Override
    public Animal next() {
        return animals.get(index++);
    }



}
