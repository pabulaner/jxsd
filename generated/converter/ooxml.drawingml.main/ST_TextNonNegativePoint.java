


public class ST_TextNonNegativePointModel extends IntModel {

    public ST_TextNonNegativePointModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 400000)) throw new IllegalArgumentException();
    }
}