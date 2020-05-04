public class ProConditioner extends BasicConditioner {
    public ProConditioner(double temperature) {
        super(temperature);
    }

    public void proAirConditioner() {
        if (temperature > 18) {
            this.temperature = this.temperature - 0.2;
        }
    }
}