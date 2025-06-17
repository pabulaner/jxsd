
package test.ooxml.drawingml.diagram;

import test.ooxml.drawingml.main.ST_ShapeTypeModel;
import test.ooxml.drawingml.diagram.ST_OutputShapeTypeModel;


public class ST_LayoutShapeTypeModel {

    private final Object value;

    public ST_LayoutShapeTypeModel(ST_ShapeTypeModel value) {
        this.value = value;
    }
    public ST_LayoutShapeTypeModel(ST_OutputShapeTypeModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_ShapeTypeModel getST_ShapeType() {
        return (ST_ShapeTypeModel) this.value;
    }
    public ST_OutputShapeTypeModel getST_OutputShapeType() {
        return (ST_OutputShapeTypeModel) this.value;
    }
}