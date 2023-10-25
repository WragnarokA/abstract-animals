package AbstractAnimals;

public class Sparrow extends Animals implements CanFly{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Twitter");
    }

    @Override
    public void fly() {
        System.out.print("I know how to fly! 🦢🪁");
    }
}
