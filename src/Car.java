public class Car {
    int maxSpeed;
    int numberofSeats;
    String fuel;

    public Car(int maxSpeed, int numberofSeats, String fuel) {
        this.maxSpeed = maxSpeed;
        this.numberofSeats = numberofSeats;
        this.fuel = fuel;
    }
    public void fuelType(){
        System.out.println("usually use petrol");
    }

    public void speed(){
        System.out.println("around 160kmph");
    }
}
