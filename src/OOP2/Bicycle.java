package OOP2;

public class Bicycle extends Vehicle
implements UpdateTyre {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public static void updateTyre(){
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void updateElseTyres() {
        System.out.println( " Меняем покрышку");
    }

}
