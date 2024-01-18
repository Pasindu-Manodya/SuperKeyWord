public class Lamborghini extends Car{

    String manufacturer = "Italy";
    public Lamborghini(int maxSpeed, int numberofSeats, String fuel) {
        super(maxSpeed, numberofSeats, fuel);
    }

    @Override
    public void fuelType() {
        System.out.println("lamborghini use diesel as fuel");
    }

    @Override
    public void speed() {
        System.out.println("around 300kmph");
    }

}
