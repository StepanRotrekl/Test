package elektroshop;

public class Fridge {
    private EnergyRating energyRating;
    private String brand;
    private String model;
    private int year;

    // Parametrický konstruktor
    public Fridge(EnergyRating energyRating, String brand, String model, int year) {
        this.energyRating = energyRating;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Metoda pro výpis informací o lednici
    public void printInfo() {
        System.out.println(year + ": " + energyRating);
    }

    // Getter pro energetickou náročnost
    public EnergyRating getEnergyRating() {
        return energyRating;
    }
}