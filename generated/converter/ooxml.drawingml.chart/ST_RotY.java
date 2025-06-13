


public class ST_RotYModel extends UnsignedShortModel {

    public ST_RotYModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 360)) throw new IllegalArgumentException();
    }
}