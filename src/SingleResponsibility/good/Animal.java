package SingleResponsibility.good;

public class Animal {
    String name;
    String foodType;
    int age;
    boolean hasWings;

    Animal(String name, String foodType, int age, boolean hasWings){
        this.name=name;
        this.foodType = foodType;
        this.age = age;
        this.hasWings=hasWings;
    }
}
