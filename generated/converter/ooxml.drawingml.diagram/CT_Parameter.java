


public class CT_ParameterModel {


    private final ST_ParameterIdModel type;
    private final ST_ParameterValModel val;

    public CT_ParameterModel(ST_ParameterIdModel type , ST_ParameterValModel val ) {
        this.type = type;
        this.val = val;
    }

    public ST_ParameterIdModel getType() {
        return this.type;
    }
    public ST_ParameterValModel getVal() {
        return this.val;
    }
}