


public class ST_TextColumnCountModel extends IntModel {

    public ST_TextColumnCountModel(decimal value) {
        super(value);

        if (!(value >= 1)) throw new IllegalArgumentException();
        if (!(value <= 16)) throw new IllegalArgumentException();
    }
}