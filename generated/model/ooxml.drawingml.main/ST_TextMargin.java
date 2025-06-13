


public class ST_TextMarginModel extends ST_Coordinate32UnqualifiedModel {

    public ST_TextMarginModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 51206400)) throw new IllegalArgumentException();
    }
}