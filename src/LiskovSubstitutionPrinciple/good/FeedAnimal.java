package LiskovSubstitutionPrinciple.good;

public class FeedAnimal {

    public static void feed (Animal animal){
        System.out.println("Еда для животного "+animal.getName() + " это "+ animal.getFood().nameOfFood);

    }

}
