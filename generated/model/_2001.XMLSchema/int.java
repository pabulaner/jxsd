


public class IntModel extends LongModel {

    public IntModel(decimal value) {
        super(value);

        if (!(value >= -2147483648)) throw new IllegalArgumentException();
        if (!(value <= 2147483647)) throw new IllegalArgumentException();
    }
}