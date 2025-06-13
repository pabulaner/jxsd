


public class ByteModel extends ShortModel {

    public ByteModel(decimal value) {
        super(value);

        if (!(value >= -128)) throw new IllegalArgumentException();
        if (!(value <= 127)) throw new IllegalArgumentException();
    }
}