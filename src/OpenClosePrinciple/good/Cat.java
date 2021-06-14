package OpenClosePrinciple.good;

public class Cat implements Sound{
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

}
