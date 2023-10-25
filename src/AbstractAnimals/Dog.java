package AbstractAnimals;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }
}
