


public class ST_HoleSizePercentModel extends StringModel {

    public ST_HoleSizePercentModel(string value) {
        super(value);

        if (!(value.matches("0*([1-9]|([1-8][0-9])|90)%"))) throw new IllegalArgumentException();
    }
}