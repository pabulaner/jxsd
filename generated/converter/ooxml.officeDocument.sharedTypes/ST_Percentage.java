


public class ST_PercentageModel extends StringModel {

    public ST_PercentageModel(string value) {
        super(value);

        if (!(value.matches("-?[0-9]+(\.[0-9]+)?%"))) throw new IllegalArgumentException();
    }
}