
package test.ooxml.drawingml.main;



public class ST_TextFontScalePercentOrPercentStringModel {

    private final Object value;

    public ST_TextFontScalePercentOrPercentStringModel(test.ooxml.officeDocument.sharedTypes.ST_PercentageModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.officeDocument.sharedTypes.ST_PercentageModel getST_Percentage() {
        return (test.ooxml.officeDocument.sharedTypes.ST_PercentageModel) this.value;
    }
}