


public class ST_DepthPercentWithSymbolModel extends StringModel {

    public ST_DepthPercentWithSymbolModel(string value) {
        super(value);

        if (!(value.matches("0*(([2-9][0-9])|([1-9][0-9][0-9])|(1[0-9][0-9][0-9])|2000)%"))) throw new IllegalArgumentException();
    }
}