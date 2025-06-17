
package test.ooxml.drawingml.diagram;



public class ST_FunctionArgumentModel {

    private final Object value;

    public ST_FunctionArgumentModel(test.ooxml.drawingml.diagram.ST_VariableTypeModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.diagram.ST_VariableTypeModel getST_VariableType() {
        return (test.ooxml.drawingml.diagram.ST_VariableTypeModel) this.value;
    }
}