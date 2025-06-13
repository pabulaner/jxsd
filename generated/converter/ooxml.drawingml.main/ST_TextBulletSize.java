


public class ST_TextBulletSizeModel {

    private final Object value;

    public ST_TextBulletSizeModel(ST_TextBulletSizePercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_TextBulletSizePercentModel getST_TextBulletSizePercent() {
        return (ST_TextBulletSizePercentModel) this.value;
    }
}