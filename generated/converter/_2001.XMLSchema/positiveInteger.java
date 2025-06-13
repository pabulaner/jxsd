


public class PositiveIntegerModel extends NonNegativeIntegerModel {

    public PositiveIntegerModel(decimal value) {
        super(value);

        if (!(value >= 1)) throw new IllegalArgumentException();
    }
}