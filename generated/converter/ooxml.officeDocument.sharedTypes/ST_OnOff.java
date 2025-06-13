


public class ST_OnOffModel {

    private final Object value;

    public ST_OnOffModel(BooleanModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public BooleanModel getBoolean() {
        return (BooleanModel) this.value;
    }
}