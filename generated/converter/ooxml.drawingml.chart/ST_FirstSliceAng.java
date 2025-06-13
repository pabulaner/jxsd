


public class ST_FirstSliceAngModel extends UnsignedShortModel {

    public ST_FirstSliceAngModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 360)) throw new IllegalArgumentException();
    }
}