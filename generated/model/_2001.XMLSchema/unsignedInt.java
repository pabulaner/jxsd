


public class UnsignedIntModel extends UnsignedLongModel {

    public UnsignedIntModel(decimal value) {
        super(value);

        if (!(value <= 4294967295)) throw new IllegalArgumentException();
    }
}