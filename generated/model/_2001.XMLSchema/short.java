


public class ShortModel extends IntModel {

    public ShortModel(decimal value) {
        super(value);

        if (!(value >= -32768)) throw new IllegalArgumentException();
        if (!(value <= 32767)) throw new IllegalArgumentException();
    }
}