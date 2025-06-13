


public class ST_FixedPercentageModel {

    private final Object value;

    public ST_FixedPercentageModel(ST_FixedPercentageModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_FixedPercentageModel getST_FixedPercentage() {
        return (ST_FixedPercentageModel) this.value;
    }
}