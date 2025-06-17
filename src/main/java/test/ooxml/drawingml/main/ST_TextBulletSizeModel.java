
package test.ooxml.drawingml.main;



public class ST_TextBulletSizeModel {

    private final Object value;

    public ST_TextBulletSizeModel(test.ooxml.drawingml.main.ST_TextBulletSizePercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.main.ST_TextBulletSizePercentModel getST_TextBulletSizePercent() {
        return (test.ooxml.drawingml.main.ST_TextBulletSizePercentModel) this.value;
    }
}