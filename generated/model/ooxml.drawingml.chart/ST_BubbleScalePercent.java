


public class ST_BubbleScalePercentModel extends StringModel {

    public ST_BubbleScalePercentModel(string value) {
        super(value);

        if (!(value.matches("0*(([0-9])|([1-9][0-9])|([1-2][0-9][0-9])|300)%"))) throw new IllegalArgumentException();
    }
}