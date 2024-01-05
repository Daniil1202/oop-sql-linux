package listAnimal;

import servise.AnimalType;


public class FarmAnimal {
    public static ListItem getAnimal(String animalType) throws Exception{
        return AnimalType.valueOf(animalType.toUpperCase()).createInstance();
    }
}
