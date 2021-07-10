package InterfaceSegregationPrinciple.bad;

public class Cat implements AnimalBehaviour{
    @Override
    public void run() {
        System.out.println("Я могу бегать");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
