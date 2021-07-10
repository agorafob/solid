package InterfaceSegregationPrinciple.good;


public class Dog implements Runnable,Swimable{
    @Override
    public void run() {
        System.out.println("Я могу бегать");
    }

    @Override
    public void swim() {
        System.out.println("Я могу плавать");
    }
}
