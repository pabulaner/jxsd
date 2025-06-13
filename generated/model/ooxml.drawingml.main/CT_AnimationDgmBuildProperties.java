


public class CT_AnimationDgmBuildPropertiesModel {


    private final BooleanModel rev;
    private final ST_AnimationDgmBuildTypeModel bld;

    public CT_AnimationDgmBuildPropertiesModel(BooleanModel rev , ST_AnimationDgmBuildTypeModel bld ) {
        this.rev = rev;
        this.bld = bld;
    }

    public BooleanModel getRev() {
        return this.rev;
    }
    public ST_AnimationDgmBuildTypeModel getBld() {
        return this.bld;
    }
}