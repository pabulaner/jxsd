


public class ST_GapAmountModel {

    private final Object value;

    public ST_GapAmountModel(ST_GapAmountPercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_GapAmountPercentModel getST_GapAmountPercent() {
        return (ST_GapAmountPercentModel) this.value;
    }
}