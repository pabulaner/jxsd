
package test.ooxml.drawingml.diagram;



public class ST_PrSetCustValModel {

    private final Object value;

    public ST_PrSetCustValModel(test.ooxml.officeDocument.sharedTypes.ST_PercentageModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.officeDocument.sharedTypes.ST_PercentageModel getST_Percentage() {
        return (test.ooxml.officeDocument.sharedTypes.ST_PercentageModel) this.value;
    }
}