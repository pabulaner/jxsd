


public class ST_RotXModel extends ByteModel {

    public ST_RotXModel(decimal value) {
        super(value);

        if (!(value >= -90)) throw new IllegalArgumentException();
        if (!(value <= 90)) throw new IllegalArgumentException();
    }
}