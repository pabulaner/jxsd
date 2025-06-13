


public class ST_GapAmountPercentModel extends StringModel {

    public ST_GapAmountPercentModel(string value) {
        super(value);

        if (!(value.matches("0*(([0-9])|([1-9][0-9])|([1-4][0-9][0-9])|500)%"))) throw new IllegalArgumentException();
    }
}