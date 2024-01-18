public class Main{
    public static void main(String args[]){
        Lamborghini l = new Lamborghini(300,2,"diesel");
        Toyota t = new Toyota(160,4,"petrol");


        System.out.println("lambo features --" + " maximum speed is " + l.maxSpeed + ", number of seats are " + l.numberofSeats + ", type of fuel is " + l.fuel + ", and made in " + l.manufacturer);
        System.out.println("Toyota features --" + " maximum speed is " + t.maxSpeed + ", number of seats are " + t.numberofSeats + ", type of fuel is " + t.fuel + ", and made in " + t.manufacturer);

        l.speed();
        l.fuelType();
        t.speed();
        t.fuelType();

    }
}