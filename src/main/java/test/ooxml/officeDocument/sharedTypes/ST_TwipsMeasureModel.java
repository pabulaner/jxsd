
package test.ooxml.officeDocument.sharedTypes;

import test.ooxml.officeDocument.sharedTypes.ST_UnsignedDecimalNumberModel;
import test.ooxml.officeDocument.sharedTypes.ST_PositiveUniversalMeasureModel;


public class ST_TwipsMeasureModel {

    private final Object value;

    public ST_TwipsMeasureModel(ST_UnsignedDecimalNumberModel value) {
        this.value = value;
    }
    public ST_TwipsMeasureModel(ST_PositiveUniversalMeasureModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_UnsignedDecimalNumberModel getST_UnsignedDecimalNumber() {
        return (ST_UnsignedDecimalNumberModel) this.value;
    }
    public ST_PositiveUniversalMeasureModel getST_PositiveUniversalMeasure() {
        return (ST_PositiveUniversalMeasureModel) this.value;
    }
}