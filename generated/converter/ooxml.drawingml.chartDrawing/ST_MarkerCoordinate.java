


public class ST_MarkerCoordinateModel extends DoubleModel {

    public ST_MarkerCoordinateModel(double value) {
        super(value);

        if (!(value >= 0.0)) throw new IllegalArgumentException();
        if (!(value <= 1.0)) throw new IllegalArgumentException();
    }
}