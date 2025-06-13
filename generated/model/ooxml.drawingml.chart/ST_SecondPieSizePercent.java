


public class ST_SecondPieSizePercentModel extends StringModel {

    public ST_SecondPieSizePercentModel(string value) {
        super(value);

        if (!(value.matches("0*(([5-9])|([1-9][0-9])|(1[0-9][0-9])|200)%"))) throw new IllegalArgumentException();
    }
}