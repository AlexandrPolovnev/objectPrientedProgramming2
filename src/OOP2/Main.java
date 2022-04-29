package OOP2;

public class Main {

    public static void main(String[] args) {

       Vehicle[]vehicles = {
               new Car("car1",4),
               new Car("car2",4),
               new Truck("truck1",6),
               new Truck("truck2",8),
               new Bicycle("bicycle1",2),
               new Bicycle("bicycle2",2)
       };



        ServiceStation station = new ServiceStation();
        station.check((Car)vehicles[0]);
        station.check((Car)vehicles[1]);
        station.check((Truck)vehicles[2]);
        station.check((Truck)vehicles[3]);
        station.check((Bicycle)vehicles[4]);
        station.check((Bicycle)vehicles[5]);



    }
}
