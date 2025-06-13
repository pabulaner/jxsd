


public class ST_FunctionArgumentModel {

    private final Object value;

    public ST_FunctionArgumentModel(ST_VariableTypeModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_VariableTypeModel getST_VariableType() {
        return (ST_VariableTypeModel) this.value;
    }
}