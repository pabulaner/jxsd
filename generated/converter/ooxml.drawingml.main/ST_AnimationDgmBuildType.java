


public class ST_AnimationDgmBuildTypeModel {

    private final Object value;

    public ST_AnimationDgmBuildTypeModel(ST_AnimationBuildTypeModel value) {
        this.value = value;
    }
    public ST_AnimationDgmBuildTypeModel(ST_AnimationDgmOnlyBuildTypeModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_AnimationBuildTypeModel getST_AnimationBuildType() {
        return (ST_AnimationBuildTypeModel) this.value;
    }
    public ST_AnimationDgmOnlyBuildTypeModel getST_AnimationDgmOnlyBuildType() {
        return (ST_AnimationDgmOnlyBuildTypeModel) this.value;
    }
}