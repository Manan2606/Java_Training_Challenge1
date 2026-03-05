// Abstract class 
public abstract class Vehicle {

    // Encapsulation: keep fields private and expose via getters.
    private final String make;
    private final String model;
    private final int year;
    private final double weightKg;

    protected Vehicle(String make, String model, int year, double weightKg) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.weightKg = weightKg;
    }

    // Encapsulation: Public getters to access vehicle properties
    public String getMake()     { return make; }
    public String getModel()    { return model; }
    public int getYear()        { return year; }
    public double getWeightKg() { return weightKg; }

    public void start() {
        System.out.println(make + " " + model + " (" + year + ") is starting...");
    }
    public void stop() {
        System.out.println(make + " " + model + " (" + year + ") is stopping.");
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + "), " + weightKg + " kg";
    }
}