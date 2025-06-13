


public class ST_LineWidthModel extends ST_Coordinate32UnqualifiedModel {

    public ST_LineWidthModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 20116800)) throw new IllegalArgumentException();
    }
}