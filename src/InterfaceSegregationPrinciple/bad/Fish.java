package InterfaceSegregationPrinciple.bad;

public class Fish implements AnimalBehaviour {
    @Override
    public void run() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        System.out.println("Я могу плавать");
    }
}
