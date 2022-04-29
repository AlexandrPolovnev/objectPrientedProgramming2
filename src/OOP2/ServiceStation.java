package OOP2;

public class ServiceStation {

    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            Vehicle.addToUpdateTyre(car);
            Vehicle.addToCheckEngine(car);
            break;

        }

        System.out.println();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            Vehicle.addToUpdateTyre(truck);
            Vehicle.addToCheckEngine(truck);
            Vehicle.addToCheckTrailer(truck);
            break;
        }

        System.out.println();
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            Vehicle.addToUpdateTyre(bicycle);
            break;
        }
        System.out.println();
    }

}
