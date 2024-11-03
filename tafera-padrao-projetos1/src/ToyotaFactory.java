
public class ToyotaFactory implements ICarFactory {
    public ISedan createSedan() {
        return new ToyotaSedan();
    }

    public ISuv createSUV() {
        return new ToyotaSUV();
    }
}