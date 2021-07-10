package LiskovSubstitutionPrinciple.bad;

public class FeedAnimal {

    public static void feed (Animal animal) throws FeedAnimalException {
        if(animal.getName().equals("Cat")){
            System.out.println("Я покормил кошку");
        }else{
            throw new FeedAnimalException("Животное не КОТ") ;
        }
    }
}
