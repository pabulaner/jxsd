


public class UnsignedLongModel extends NonNegativeIntegerModel {

    public UnsignedLongModel(decimal value) {
        super(value);

        if (!(value <= 18446744073709551615)) throw new IllegalArgumentException();
    }
}