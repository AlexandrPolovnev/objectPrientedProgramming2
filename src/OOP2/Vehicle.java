package OOP2;

public class Vehicle {
    public  String modelName;
    public int wheelsCount;

    public Vehicle (String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public static void addToUpdateTyre(UpdateTyre vehicle) {
        vehicle.updateElseTyres();
    }

    public static void addToCheckEngine(CheckEngine vehicle) {
        vehicle.checkElseEngine();
    }

    public static void addToCheckTrailer(CheckTrailer vehicle) {
        vehicle.checkElseTrailer();
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
