


public class ST_OverlapPercentModel extends StringModel {

    public ST_OverlapPercentModel(string value) {
        super(value);

        if (!(value.matches("(-?0*(([0-9])|([1-9][0-9])|100))%"))) throw new IllegalArgumentException();
    }
}