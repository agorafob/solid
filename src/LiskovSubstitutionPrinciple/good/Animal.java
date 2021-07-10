package LiskovSubstitutionPrinciple.good;

public class Animal {

    private String name;
    private FoodForAnimal food;

    public Animal(String name , String foodName){
        this.name = name;
        this.food = new FoodForAnimal(foodName);
    }

    public FoodForAnimal getFood() {
        return food;
    }

    public String getName() {
        return name;
    }
}
