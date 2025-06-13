


public class NonPositiveIntegerModel extends IntegerModel {

    public NonPositiveIntegerModel(decimal value) {
        super(value);

        if (!(value <= 0)) throw new IllegalArgumentException();
    }
}