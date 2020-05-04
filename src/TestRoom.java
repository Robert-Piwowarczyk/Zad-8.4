public class TestRoom {
    public static void main(String[] args) {
        GuestRoom guestRoom = new GuestRoom("10m", 21.0,
                1, "podstawowy klimatyzator");
        Kitchen kitchen = new Kitchen("8m", 20.0,
                2, "profesionalny klimatyzator");
        BasicConditioner basicConditioner = new BasicConditioner(20);
        ProConditioner proConditioner = new ProConditioner(18);

        System.out.println("Aktualna temperatura w pomieszczeniu: " +
                guestRoom.getRoomNumber() + " to " + guestRoom.getTemperature()
                + " stopni Celciusza");
        System.out.println("Po włączeniu się klimatyzatora temperatura w" +
                "pomieszczeniu: " + guestRoom.getRoomNumber() + " to "
                + basicConditioner.basicAirConditioner() + " stopni Celciusza");

        System.out.println("Aktualna temperatura w pomieszczeniu: " +
                kitchen.getRoomNumber() + " to " + kitchen.getTemperature()
                + "stopni Celciusza: ");
        System.out.println("Po włączeniu się klimatyzatora temperatura w" +
                "pomieszczeniu: " + kitchen.getRoomNumber() + " to "
                + proConditioner.proAirConditioner() + " stopni Celciusza");
    }
}
