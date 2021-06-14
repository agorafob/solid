package OpenClosePrinciple.good;

public class Dog implements Sound{
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
