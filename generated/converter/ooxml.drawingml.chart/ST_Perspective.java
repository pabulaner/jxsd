


public class ST_PerspectiveModel extends UnsignedByteModel {

    public ST_PerspectiveModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 240)) throw new IllegalArgumentException();
    }
}