


public class ST_PositivePercentageModel extends ST_PercentageModel {

    public ST_PositivePercentageModel(string value) {
        super(value);

        if (!(value.matches("[0-9]+(\.[0-9]+)?%"))) throw new IllegalArgumentException();
    }
}