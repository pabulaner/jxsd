


public class ST_FixedPercentageModel extends ST_PercentageModel {

    public ST_FixedPercentageModel(string value) {
        super(value);

        if (!(value.matches("-?((100)|([0-9][0-9]?))(\.[0-9][0-9]?)?%"))) throw new IllegalArgumentException();
    }
}