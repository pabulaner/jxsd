
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_Coordinate32UnqualifiedModel;
import test.ooxml.officeDocument.sharedTypes.ST_UniversalMeasureModel;


public class ST_Coordinate32Model {

    private final Object value;

    public ST_Coordinate32Model(ST_Coordinate32UnqualifiedModel value) {
        this.value = value;
    }
    public ST_Coordinate32Model(ST_UniversalMeasureModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_Coordinate32UnqualifiedModel getST_Coordinate32Unqualified() {
        return (ST_Coordinate32UnqualifiedModel) this.value;
    }
    public ST_UniversalMeasureModel getST_UniversalMeasure() {
        return (ST_UniversalMeasureModel) this.value;
    }
}