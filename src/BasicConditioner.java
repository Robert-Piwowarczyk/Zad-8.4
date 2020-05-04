public class BasicConditioner {
    double temperature;

    public BasicConditioner(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void basicAirConditioner() {
        if (temperature > 20) {
            this.temperature = this.temperature - 0.1;
        }
    }
}



