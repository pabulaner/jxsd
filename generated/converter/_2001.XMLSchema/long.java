


public class LongModel extends IntegerModel {

    public LongModel(decimal value) {
        super(value);

        if (!(value >= -9223372036854775808)) throw new IllegalArgumentException();
        if (!(value <= 9223372036854775807)) throw new IllegalArgumentException();
    }
}