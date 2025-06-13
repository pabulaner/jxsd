


public class ST_FOVAngleModel extends ST_AngleModel {

    public ST_FOVAngleModel(decimal value) {
        super(value);

        if (!(value >= 0)) throw new IllegalArgumentException();
        if (!(value <= 10800000)) throw new IllegalArgumentException();
    }
}