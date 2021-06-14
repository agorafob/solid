package SingleResponsibility.bad;

import java.util.ArrayList;

public class Animals {

    String name;
    String foodType;
    int age;
    boolean hasWings;
    ArrayList<Animals> zoo = new ArrayList<>();

    Animals(String name,String foodType,int age,boolean hasWings){
        this.name=name;
        this.foodType = foodType;
        this.age = age;
        this.hasWings=hasWings;
    }

    public void addToZoo(Animals a){
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
