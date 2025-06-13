


public class ST_ThicknessModel {

    private final Object value;

    public ST_ThicknessModel(ST_ThicknessPercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_ThicknessPercentModel getST_ThicknessPercent() {
        return (ST_ThicknessPercentModel) this.value;
    }
}