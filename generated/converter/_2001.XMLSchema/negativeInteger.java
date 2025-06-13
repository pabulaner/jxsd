


public class NegativeIntegerModel extends NonPositiveIntegerModel {

    public NegativeIntegerModel(decimal value) {
        super(value);

        if (!(value <= -1)) throw new IllegalArgumentException();
    }
}