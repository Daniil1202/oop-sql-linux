package servise;

import animals.packAnimals.Donkeys;
import animals.packAnimals.Horses;
import animals.pets.Cats;
import animals.pets.Dogs;
import animals.pets.Hamsters;
import listAnimal.ListItem;

public enum AnimalType {
    CAMEL(Camels.class),
    CAT(Cats.class),
    DOG(Dogs.class),
    DONKEY(Donkeys.class),
    HAMSTER(Hamsters.class),
    HORSE(Horses.class);

    private final Class<?extends ListItem> animalClass;
    AnimalType(Class<?extends ListItem> animalClass){
        this.animalClass = animalClass;
    }
    public ListItem createInstance() throws Exception{
        return animalClass.getDeclaredConstructor().newInstance();
    }
}
