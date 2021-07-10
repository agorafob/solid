package InterfaceSegregationPrinciple.bad;

public class Dog implements AnimalBehaviour{
    @Override
    public void run() {
        System.out.println("Я могу бегать");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        System.out.println("Я могу плавать");
    }
}
