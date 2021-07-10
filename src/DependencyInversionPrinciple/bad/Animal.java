package DependencyInversionPrinciple.bad;

public class Animal {
    private String name;
    private boolean hasWings;

    Animal(String name,boolean hasWings){
        this.name=name;
        this.hasWings=hasWings;
    }

    public String getName() {
        return name;
    }

    public boolean isHasWings(){
        return hasWings;
    }
}
