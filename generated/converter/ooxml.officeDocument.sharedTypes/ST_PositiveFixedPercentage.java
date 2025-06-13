


public class ST_PositiveFixedPercentageModel extends ST_PercentageModel {

    public ST_PositiveFixedPercentageModel(string value) {
        super(value);

        if (!(value.matches("((100)|([0-9][0-9]?))(\.[0-9][0-9]?)?%"))) throw new IllegalArgumentException();
    }
}