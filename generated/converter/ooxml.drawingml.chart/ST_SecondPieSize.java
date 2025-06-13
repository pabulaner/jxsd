


public class ST_SecondPieSizeModel {

    private final Object value;

    public ST_SecondPieSizeModel(ST_SecondPieSizePercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_SecondPieSizePercentModel getST_SecondPieSizePercent() {
        return (ST_SecondPieSizePercentModel) this.value;
    }
}