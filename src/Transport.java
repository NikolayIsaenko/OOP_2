public abstract class Transport implements Serviceable {
    private String modelName;
    private int wheelsCount;
    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + modelName);
        System.out.println("Обслуживаем колёса");
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
