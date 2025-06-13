


public class ST_HPercentWithSymbolModel extends StringModel {

    public ST_HPercentWithSymbolModel(string value) {
        super(value);

        if (!(value.matches("0*(([5-9])|([1-9][0-9])|([1-4][0-9][0-9])|500)%"))) throw new IllegalArgumentException();
    }
}