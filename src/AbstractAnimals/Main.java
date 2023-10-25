package AbstractAnimals;

public class Main {
    public static void main(String[] args) {
        Dog fufy = new Dog("Fufy");
        Sparrow tomy = new Sparrow("Tomy");
        Eagle diablo = new Eagle("Diablo");
        Dolphin flipper = new Dolphin("Flipper");

        Animals[] animals = {fufy, tomy, diablo, flipper };

        for (Animals animal : animals) {
            System.out.println(animal.getName());
            animal.eat("food");
            animal.sleep();
            animal.makeNoise();
            if (animal instanceof CanSwim) {
                ((CanSwim) animal).swim();
            }

        }



    }


}