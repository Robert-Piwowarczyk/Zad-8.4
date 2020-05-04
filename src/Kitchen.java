public class Kitchen extends Room {
    private String ProAirConditioner;

    public Kitchen(String surfaceRoom, double temperature, int roomNumber,
                   String proAirConditioner) {
        super(surfaceRoom, temperature, roomNumber);
        ProAirConditioner = proAirConditioner;
    }

    public String getProAirConditioner() {
        return ProAirConditioner;
    }

    public void setProAirConditioner(String proAirConditioner) {
        ProAirConditioner = proAirConditioner;
    }
}
