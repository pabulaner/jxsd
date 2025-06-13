


public class ST_Index1Model extends UnsignedIntModel {

    public ST_Index1Model(decimal value) {
        super(value);

        if (!(value >= 1)) throw new IllegalArgumentException();
    }
}