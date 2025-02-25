package autosaloon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CarDatabase {

    String owner;
    Car[] cars;

    public CarDatabase(String owner) {
        this.owner = owner;

    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu aut. A ty prida do pole aut.
     * @param count - pozadovany pocet aut
     */
    public void addCars(int count) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            System.out.println("Zadejte údaje pro auto č. " + (i + 1));

            System.out.print("Rok výroby: ");
            int year = scanner.nextInt();

            System.out.print("Najeté kilometry: ");
            int mileage = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Barva: ");
            String color = scanner.nextLine();

            System.out.print("Stav (NEW, USED, DAMAGED, EXCELLENT): ");
            Condition condition = Condition.valueOf(scanner.nextLine().toLowerCase());

            cars [i] = new Car(year, mileage, color, condition);
        }
    }


    /**
     * Vypise vsechna auta, jejijz stav je "good". Vypis bude ve formatu: Na prvnim radku bude vypis: Dobra auta jsou: .
     * Na kazdem dalsim radku bude vypis informaci o jednom aute - pouzij mezodu printInfo() tridy Car
     */
    public void printCarInGoodCondition(){

    }

}
