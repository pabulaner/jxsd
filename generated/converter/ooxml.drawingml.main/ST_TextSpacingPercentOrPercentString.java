


public class ST_TextSpacingPercentOrPercentStringModel {

    private final Object value;

    public ST_TextSpacingPercentOrPercentStringModel(ST_PercentageModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_PercentageModel getST_Percentage() {
        return (ST_PercentageModel) this.value;
    }
}