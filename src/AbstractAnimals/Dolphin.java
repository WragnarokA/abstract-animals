package AbstractAnimals;

public class Dolphin extends Animals implements CanSwim{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Click");
    }

    @Override
    public void swim() {
        System.out.print("I can swim! 🐠🐠🐠");
    }
}
