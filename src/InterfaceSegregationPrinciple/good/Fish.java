package InterfaceSegregationPrinciple.good;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Я могу плавать");
    }
}
