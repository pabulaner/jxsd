


public class ST_LblOffsetModel {

    private final Object value;

    public ST_LblOffsetModel(ST_LblOffsetPercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_LblOffsetPercentModel getST_LblOffsetPercent() {
        return (ST_LblOffsetPercentModel) this.value;
    }
}