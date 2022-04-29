package OOP2;

public class Car extends Vehicle
implements UpdateTyre, CheckEngine{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static  void updateTyre() {

        System.out.println("Меняем покрышку");
    }

    public static void checkEngine() {

        System.out.println("Проверяем двигатель");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void checkElseEngine() {
        System.out.println(" Проверяем двигатель");
    }

    @Override
    public void updateElseTyres() {

        System.out.println(" Меняем покрышку");
    }
}
