


public class ST_TextIndentModel extends ST_Coordinate32UnqualifiedModel {

    public ST_TextIndentModel(decimal value) {
        super(value);

        if (!(value >= -51206400)) throw new IllegalArgumentException();
        if (!(value <= 51206400)) throw new IllegalArgumentException();
    }
}