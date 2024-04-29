public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        super.check();
        checkEngine();
        checkTrailer();
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
