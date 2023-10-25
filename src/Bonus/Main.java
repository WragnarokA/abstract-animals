package Bonus;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();

        Object dispositivo1 = creator.create("lettore dvd");
        Object dispositivo2 = creator.create("playstation");

        if (dispositivo1 instanceof LettoreDvd) {
            ((LettoreDvd) dispositivo1).play();
        }
        if (dispositivo2 instanceof PlayStation) {
            ((PlayStation) dispositivo2).stop();
        }
    }
}
