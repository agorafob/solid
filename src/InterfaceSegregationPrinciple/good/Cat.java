package InterfaceSegregationPrinciple.good;

public class Cat implements Runnable {
    @Override
    public void run() {
        System.out.println("Я могу бегать");
    }
}
