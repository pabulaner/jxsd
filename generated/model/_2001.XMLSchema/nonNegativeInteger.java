


public class NonNegativeIntegerModel extends IntegerModel {

    public NonNegativeIntegerModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
    }
}