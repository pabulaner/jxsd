


public class ST_DepthPercentModel {

    private final Object value;

    public ST_DepthPercentModel(ST_DepthPercentWithSymbolModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_DepthPercentWithSymbolModel getST_DepthPercentWithSymbol() {
        return (ST_DepthPercentWithSymbolModel) this.value;
    }
}