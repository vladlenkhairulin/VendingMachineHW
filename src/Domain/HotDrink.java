package Domain;

public class HotDrink extends Product{
    /* дополнительное поле температура */
    private int temperature;

    public HotDrink(double price, int place, String name, int temperature) {
        super(price, place, name);
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString(){
        return super.toString() + "temperature" + temperature;
    }
}
