package AbstractAnimals;

public class Eagle extends Animals implements CanFly{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.print("Cry");
    }

    @Override
    public void fly() {
        System.out.println("I know how to fly! 🦢🪁");
    }
}
