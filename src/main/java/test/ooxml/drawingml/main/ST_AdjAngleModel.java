
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_AngleModel;
import test.ooxml.drawingml.main.ST_GeomGuideNameModel;


public class ST_AdjAngleModel {

    private final Object value;

    public ST_AdjAngleModel(ST_AngleModel value) {
        this.value = value;
    }
    public ST_AdjAngleModel(ST_GeomGuideNameModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_AngleModel getST_Angle() {
        return (ST_AngleModel) this.value;
    }
    public ST_GeomGuideNameModel getST_GeomGuideName() {
        return (ST_GeomGuideNameModel) this.value;
    }
}