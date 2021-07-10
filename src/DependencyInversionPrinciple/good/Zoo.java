package DependencyInversionPrinciple.good;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<AnimalForZoo> zoo = new ArrayList<>();

    public void addAnimal (AnimalForZoo animal){
        zoo.add(animal);
    }
}
