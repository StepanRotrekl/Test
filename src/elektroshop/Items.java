package elektroshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Items {
    private List<Fridge> fridges = new ArrayList<>();

    // Přidání ledniček podle vstupu uživatele
    public void addItems(int count) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            System.out.println("Zadejte značku ledničky:");
            String brand = scanner.nextLine();

            System.out.println("Zadejte model ledničky:");
            String model = scanner.nextLine();

            System.out.println("Zadejte rok výroby:");
            int year = Integer.parseInt(scanner.nextLine());

            System.out.println("Zadejte energetickou náročnost (A-G):");
            String ratingInput = scanner.nextLine().toUpperCase();
            EnergyRating rating = EnergyRating.valueOf(ratingInput);

            fridges.add(new Fridge(rating, brand, model, year));
        }
    }

    // Výpis všech ledniček
    public void printInfo() {
        System.out.println("----- INFO O LEDNIČKÁCH -----");
        for (Fridge fridge : fridges) {
            fridge.printInfo();
        }
        System.out.println("----------------------------");
    }

    // Výpis ledniček s konkrétní energetickou náročností
    public void printByEnergyRating(EnergyRating rating) {
        System.out.println("Ledničky s energetickou náročností " + rating + ":");
        for (Fridge fridge : fridges) {
            if (fridge.getEnergyRating() == rating) {
                fridge.printInfo();
            }
        }
    }

    // Počet všech ledniček
    public int getTotalFridges() {
        return fridges.size();
    }

    // Počet ledniček dle energetické náročnosti
    public int getCountByEnergyRating() {
        int count = 0;
        for (Fridge fridge : fridges) {
            if (fridge.getEnergyRating() == EnergyRating.A) {
                count++;
            }
        }
        return count;
    }
}