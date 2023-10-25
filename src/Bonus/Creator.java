package Bonus;

public class Creator {
    public Object create(String tipo) {
        if ("lettore dvd".equalsIgnoreCase(tipo)) {
            return new LettoreDvd();
        } else if ("playstation".equalsIgnoreCase(tipo)) {
            return new PlayStation();
        } else {
            return null; // Gestire il caso in cui il tipo non sia valido
        }
    }
}
