
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.IntModel;
import test.ooxml.officeDocument.sharedTypes.ST_GuidModel;


public class ST_ModelIdModel {

    private final Object value;

    public ST_ModelIdModel(IntModel value) {
        this.value = value;
    }
    public ST_ModelIdModel(ST_GuidModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public IntModel getInt() {
        return (IntModel) this.value;
    }
    public ST_GuidModel getST_Guid() {
        return (ST_GuidModel) this.value;
    }
}