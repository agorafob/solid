package LiskovSubstitutionPrinciple.good;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Собака","кость");
        FeedAnimal.feed(animal1);
    }
}
