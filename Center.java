public class Center {
    public static void main(String[] args) {

        car myCar = new car("Toyota", "Corolla", 2020, 1300.0, 4, 66.0);
        truck myTruck = new truck("Ford", "F-150", 2019, 2500.0, 2, 18.5);

        System.out.println(myCar);
        myCar.start();
        myCar.openTrunk();
        System.out.println("Car fuel efficiency: " + myCar.getFuelEfficiency() + " mpg");
        myCar.stop();

        System.out.println("-----------------------------");

        System.out.println(myTruck);
        myTruck.start();
        System.out.println("Truck fuel efficiency: " + myTruck.getFuelEfficiency() + " mpg");
        myTruck.stop();
    }
}