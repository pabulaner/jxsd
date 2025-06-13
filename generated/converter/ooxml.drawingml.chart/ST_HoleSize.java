


public class ST_HoleSizeModel {

    private final Object value;

    public ST_HoleSizeModel(ST_HoleSizePercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_HoleSizePercentModel getST_HoleSizePercent() {
        return (ST_HoleSizePercentModel) this.value;
    }
}