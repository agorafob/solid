package SingleResponsibility.good;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> zoo = new ArrayList<>();

    public void addToZoo(Animal a){
        zoo.add(a);
    }

    public void deleteBirds(){
        for (int i = 0; i < zoo.size(); i++) {
            if(zoo.get(i).hasWings){
                zoo.remove(i);
            }
        }
    }
}
