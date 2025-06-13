


public class ST_CoordinateModel {

    private final Object value;

    public ST_CoordinateModel(ST_CoordinateUnqualifiedModel value) {
        this.value = value;
    }
    public ST_CoordinateModel(ST_UniversalMeasureModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_CoordinateUnqualifiedModel getST_CoordinateUnqualified() {
        return (ST_CoordinateUnqualifiedModel) this.value;
    }
    public ST_UniversalMeasureModel getST_UniversalMeasure() {
        return (ST_UniversalMeasureModel) this.value;
    }
}