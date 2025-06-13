


public class ST_TextPointModel {

    private final Object value;

    public ST_TextPointModel(ST_TextPointUnqualifiedModel value) {
        this.value = value;
    }
    public ST_TextPointModel(ST_UniversalMeasureModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_TextPointUnqualifiedModel getST_TextPointUnqualified() {
        return (ST_TextPointUnqualifiedModel) this.value;
    }
    public ST_UniversalMeasureModel getST_UniversalMeasure() {
        return (ST_UniversalMeasureModel) this.value;
    }
}