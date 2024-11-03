public class CarClient {
    private ISedan sedan;
    private ISuv suv;

    public CarClient(ICarFactory factory) {
        sedan = factory.createSedan();
        suv = factory.createSUV();
    }

    public void testDrive() {
        sedan.drive();
        suv.drive();
    }
}