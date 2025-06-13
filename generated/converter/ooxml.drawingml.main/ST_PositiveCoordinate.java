


public class ST_PositiveCoordinateModel extends LongModel {

    public ST_PositiveCoordinateModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 27273042316900)) throw new IllegalArgumentException();
    }
}