


public class UnsignedByteModel extends UnsignedShortModel {

    public UnsignedByteModel(decimal value) {
        super(value);

        if (!(value <= 255)) throw new IllegalArgumentException();
    }
}