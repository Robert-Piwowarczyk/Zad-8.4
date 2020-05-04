public class GuestRoom extends Room {
    private String BasicAirConditioner;

    public GuestRoom(String surfaceRoom, double temperature, int roomNumber,
                     String basicAirConditioner) {
        super(surfaceRoom, temperature, roomNumber);
        BasicAirConditioner = basicAirConditioner;
    }

    public void setBasicAirConditioner(String basicAirConditioner) {
        BasicAirConditioner = basicAirConditioner;
    }
}
