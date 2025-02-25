package autosaloon;

public class Car {
    private int year;
    private int mileage;
    private String color;
    private Condition condition;

    public Car(int year, int mileage, String color, Condition condition) {
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.condition = condition;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public Condition getCondition() {
        return condition;
    }


    public String toString() {
        return "Roky: " + year + "Delka: " + mileage + "Barva: " + color + "Kondice: " + condition;



    }
}

