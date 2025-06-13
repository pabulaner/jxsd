


public class ST_AnimationChartBuildTypeModel {

    private final Object value;

    public ST_AnimationChartBuildTypeModel(ST_AnimationBuildTypeModel value) {
        this.value = value;
    }
    public ST_AnimationChartBuildTypeModel(ST_AnimationChartOnlyBuildTypeModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public ST_AnimationBuildTypeModel getST_AnimationBuildType() {
        return (ST_AnimationBuildTypeModel) this.value;
    }
    public ST_AnimationChartOnlyBuildTypeModel getST_AnimationChartOnlyBuildType() {
        return (ST_AnimationChartOnlyBuildTypeModel) this.value;
    }
}