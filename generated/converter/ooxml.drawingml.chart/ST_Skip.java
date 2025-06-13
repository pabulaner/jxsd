


public class ST_SkipModel extends UnsignedIntModel {

    public ST_SkipModel(decimal value) {
        super(value);

        if (!(value >= 1)) throw new IllegalArgumentException();
    }
}