


public class ST_PercentageModel {

    private final Object value;

    public ST_PercentageModel(ST_PercentageModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_PercentageModel getST_Percentage() {
        return (ST_PercentageModel) this.value;
    }
}