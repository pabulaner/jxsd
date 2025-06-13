


public class ST_HPercentModel {

    private final Object value;

    public ST_HPercentModel(ST_HPercentWithSymbolModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_HPercentWithSymbolModel getST_HPercentWithSymbol() {
        return (ST_HPercentWithSymbolModel) this.value;
    }
}