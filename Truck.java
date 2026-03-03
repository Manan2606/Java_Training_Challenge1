// Inheritance: Truck extends Vehicle.
public class truck extends vehicle implements FuelEfficient {

    private final int axles;
    private final double mpg;    

    // Constructor to initialize all fields, including those from Vehicle.
    public truck(String make, String model, int year, double weightKg,
                 int axles, double mpg) {
        super(make, model, year, weightKg);
        this.axles = axles;
        this.mpg = mpg;
    }

    
    public int getAxles()               { return axles; }

    @Override
    public double getFuelEfficiency()   { return mpg; }

    // Polymorphism: Override start to provide truck-specific behavior.
    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + ": Diesel rumble... ready to work.");
    }

    @Override
    public String toString() {
        return "Truck[" + super.toString()
            + ", axles=" + axles
            + ", mpg=" + mpg + "]";
    }
}