


public class ST_OverlapModel {

    private final Object value;

    public ST_OverlapModel(ST_OverlapPercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_OverlapPercentModel getST_OverlapPercent() {
        return (ST_OverlapPercentModel) this.value;
    }
}