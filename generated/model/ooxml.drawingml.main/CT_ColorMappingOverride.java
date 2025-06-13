


public class CT_ColorMappingOverrideModel {




public class MasterClrMappingOroverrideClrMappingModel {


    private final Object value;

    public MasterClrMappingOroverrideClrMappingModel(CT_EmptyElementModel value) {
        this.value = value;
    }
    public MasterClrMappingOroverrideClrMappingModel(CT_ColorMappingModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_EmptyElementModel getMasterClrMapping() {
        return (CT_EmptyElementModel) value;
    }
    public CT_ColorMappingModel getOverrideClrMapping() {
        return (CT_ColorMappingModel) value;
    }
}

    private final MasterClrMappingOroverrideClrMappingModel masterClrMappingOroverrideClrMapping;

    public CT_ColorMappingOverrideModel(MasterClrMappingOroverrideClrMappingModel masterClrMappingOroverrideClrMapping ) {
        this.masterClrMappingOroverrideClrMapping = masterClrMappingOroverrideClrMapping;
    }

    public MasterClrMappingOroverrideClrMappingModel getMasterClrMappingOroverrideClrMapping() {
        return this.masterClrMappingOroverrideClrMapping;
    }
}