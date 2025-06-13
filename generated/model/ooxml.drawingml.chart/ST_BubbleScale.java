


public class ST_BubbleScaleModel {

    private final Object value;

    public ST_BubbleScaleModel(ST_BubbleScalePercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_BubbleScalePercentModel getST_BubbleScalePercent() {
        return (ST_BubbleScalePercentModel) this.value;
    }
}