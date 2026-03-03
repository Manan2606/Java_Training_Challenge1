// Inheritance: Car extends Vehicle to reuse common fields/behavior.
public class car extends vehicle implements FuelEfficient {

    // Encapsulation: car-specific fields are private.
    private final int doors;
    private final double mpg;

    public car(String make, String model, int year, double weightKg, int doors, double mpg) {
        super(make, model, year, weightKg);
        this.doors = doors;
        this.mpg = mpg;
    }

    public int getDoors() { return doors; }

    // Interface implementation: return car's fuel efficiency.
    @Override
    public double getFuelEfficiency() { return mpg; }

    public void openTrunk() {
        System.out.println(getMake() + " " + getModel() + ": Trunk opened.");
    }

    // Polymorphism: Override start to provide car-specific behavior.
    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + ": Smooth engine start.");
    }

    @Override
    public String toString() {
        return "Car " + super.toString() + ", doors=" + doors + ", mpg=" + mpg + "";
    }
}