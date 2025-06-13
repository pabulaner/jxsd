


public class ST_PeriodModel extends UnsignedIntModel {

    public ST_PeriodModel(decimal value) {
        super(value);

        if (!(value >= 2)) throw new IllegalArgumentException();
    }
}