package OOP2;

public class Truck extends Vehicle
        implements UpdateTyre, CheckEngine, CheckTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void updateElseTyres() {
        System.out.println("Меняем покрышку " );
    }

    @Override
    public void checkElseEngine() {
        System.out.println("Проверяем двигатель ");
    }

    @Override
    public void checkElseTrailer() {
        System.out.println("Проверяем прицеп ");
    }
}
