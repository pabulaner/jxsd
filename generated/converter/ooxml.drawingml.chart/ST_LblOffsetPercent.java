


public class ST_LblOffsetPercentModel extends StringModel {

    public ST_LblOffsetPercentModel(string value) {
        super(value);

        if (!(value.matches("0*(([0-9])|([1-9][0-9])|([1-9][0-9][0-9])|1000)%"))) throw new IllegalArgumentException();
    }
}