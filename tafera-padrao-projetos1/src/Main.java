public class Main {

    public static void main(String[] args) {

        ICarFactory toyotaFactory = new ToyotaFactory();
        CarClient toyotaClient = new CarClient(toyotaFactory);
        System.out.println("Testando carros da Toyota:");
        toyotaClient.testDrive();

        ICarFactory fordFactory = new FordFactory();
        CarClient fordClient = new CarClient(fordFactory);
        System.out.println("\nTestando carros da Ford:");
        fordClient.testDrive();
    }
}