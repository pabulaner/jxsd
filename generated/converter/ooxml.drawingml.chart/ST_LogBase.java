


public class ST_LogBaseModel extends DoubleModel {

    public ST_LogBaseModel(double value) {
        super(value);

        if (!(value >= 2)) throw new IllegalArgumentException();
        if (!(value <= 1000)) throw new IllegalArgumentException();
    }
}