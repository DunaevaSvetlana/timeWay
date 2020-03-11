public class TimeWay {
    public static void main(String[] args) {
        final double putVKm = 10.5;
        final double sTaxi = 0.6;
        final double zamedlenee = 0.4;

        final double timeTester = putVKm / sTaxi;
        final double timeRealTester = zamedlenee * timeTester;

        System.out.println("putVKm = " + putVKm);
        System.out.println("sTaxi = " + sTaxi);
        System.out.println("zamedlenee = " + zamedlenee);

        System.out.println("timeTester = " + timeTester);
        System.out.println("timeRealTester = " + timeRealTester);

    }
}
