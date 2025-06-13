


public class ST_PositiveFixedAngleModel extends ST_AngleModel {

    public ST_PositiveFixedAngleModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(true)) throw new IllegalArgumentException();
    }
}