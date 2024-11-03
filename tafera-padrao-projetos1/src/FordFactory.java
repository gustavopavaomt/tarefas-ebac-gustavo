public class FordFactory implements ICarFactory {
    public ISedan createSedan() {
        return new FordSedan();
    }

    public ISuv createSUV() {
        return new FordSUV();
    }
}