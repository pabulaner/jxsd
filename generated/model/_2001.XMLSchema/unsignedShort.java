


public class UnsignedShortModel extends UnsignedIntModel {

    public UnsignedShortModel(decimal value) {
        super(value);

        if (!(value <= 65535)) throw new IllegalArgumentException();
    }
}