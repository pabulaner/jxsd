
package test.ooxml.drawingml.main;



public class ST_TextSpacingPercentOrPercentStringModel {

    private final Object value;

    public ST_TextSpacingPercentOrPercentStringModel(test.ooxml.officeDocument.sharedTypes.ST_PercentageModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.officeDocument.sharedTypes.ST_PercentageModel getST_Percentage() {
        return (test.ooxml.officeDocument.sharedTypes.ST_PercentageModel) this.value;
    }
}