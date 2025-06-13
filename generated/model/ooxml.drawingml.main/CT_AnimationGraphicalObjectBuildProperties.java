


public class CT_AnimationGraphicalObjectBuildPropertiesModel {




public class BldDgmOrbldChartModel {


    private final Object value;

    public BldDgmOrbldChartModel(CT_AnimationDgmBuildPropertiesModel value) {
        this.value = value;
    }
    public BldDgmOrbldChartModel(CT_AnimationChartBuildPropertiesModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_AnimationDgmBuildPropertiesModel getBldDgm() {
        return (CT_AnimationDgmBuildPropertiesModel) value;
    }
    public CT_AnimationChartBuildPropertiesModel getBldChart() {
        return (CT_AnimationChartBuildPropertiesModel) value;
    }
}

    private final BldDgmOrbldChartModel bldDgmOrbldChart;

    public CT_AnimationGraphicalObjectBuildPropertiesModel(BldDgmOrbldChartModel bldDgmOrbldChart ) {
        this.bldDgmOrbldChart = bldDgmOrbldChart;
    }

    public BldDgmOrbldChartModel getBldDgmOrbldChart() {
        return this.bldDgmOrbldChart;
    }
}