package LiskovSubstitutionPrinciple.bad;

public class Main {
    public static void main(String[] args) throws FeedAnimalException {
        Animal animal = new Animal("Собака");
        FeedAnimal.feed(animal);
    }
}
