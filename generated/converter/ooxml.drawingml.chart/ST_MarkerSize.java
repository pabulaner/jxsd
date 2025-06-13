


public class ST_MarkerSizeModel extends UnsignedByteModel {

    public ST_MarkerSizeModel(decimal value) {
        super(value);

        if (!(value >= 2)) throw new IllegalArgumentException();
        if (!(value <= 72)) throw new IllegalArgumentException();
    }
}