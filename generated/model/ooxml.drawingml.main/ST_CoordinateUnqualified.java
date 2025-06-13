


public class ST_CoordinateUnqualifiedModel extends LongModel {

    public ST_CoordinateUnqualifiedModel(decimal value) {
        super(value);

        if (!(value >= -27273042329600)) throw new IllegalArgumentException();
        if (!(value <= 27273042316900)) throw new IllegalArgumentException();
    }
}