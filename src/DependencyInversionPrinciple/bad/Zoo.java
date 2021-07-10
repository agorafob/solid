package DependencyInversionPrinciple.bad;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> zoo = new ArrayList<>();

    public void addAnimal(Animal animal){
        if(!animal.isHasWings()||!animal.getName().equals("Собака")||!animal.getName().equals("Кошка")){
            zoo.add(animal);
        }else {
            System.out.println("Не подходит для зоопарка");
        }
    }
}
