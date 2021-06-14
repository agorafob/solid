package OpenClosePrinciple.bad;

public class Animals {
    String name;

    Animals(String name){
        this.name=name;
    }

    public void makeSound(){
        if(this.name.equals("dog")){
            System.out.println("bark");
        }
        if(this.name.equals("cat")){
            System.out.println("meow");
        }
    }

}
