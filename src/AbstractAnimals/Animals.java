package AbstractAnimals;

public abstract class Animals {
    private final String name;

    public Animals(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void sleep() {
        System.out.println("Zzzzzzz");
    }

    public void eat(String what) {
        System.out.println("I'm eating " + what);
    }
    public abstract void makeNoise();


}
