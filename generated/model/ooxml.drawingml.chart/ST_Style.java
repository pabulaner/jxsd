


public class ST_StyleModel extends UnsignedByteModel {

    public ST_StyleModel(decimal value) {
        super(value);

        if (!(value >= 1)) throw new IllegalArgumentException();
        if (!(value <= 48)) throw new IllegalArgumentException();
    }
}