package LiskovSubstitutionPrinciple.bad;

public class FeedAnimalException extends Exception{
    public FeedAnimalException(String message) {
        super(message);
    }
}
