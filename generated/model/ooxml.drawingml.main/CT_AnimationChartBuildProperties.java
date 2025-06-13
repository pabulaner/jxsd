


public class CT_AnimationChartBuildPropertiesModel {


    private final ST_AnimationChartBuildTypeModel bld;
    private final BooleanModel animBg;

    public CT_AnimationChartBuildPropertiesModel(ST_AnimationChartBuildTypeModel bld , BooleanModel animBg ) {
        this.bld = bld;
        this.animBg = animBg;
    }

    public ST_AnimationChartBuildTypeModel getBld() {
        return this.bld;
    }
    public BooleanModel getAnimBg() {
        return this.animBg;
    }
}