


public class CT_AnimationDgmElementModel {


    private final ST_DgmBuildStepModel bldStep;
    private final ST_GuidModel id;

    public CT_AnimationDgmElementModel(ST_DgmBuildStepModel bldStep , ST_GuidModel id ) {
        this.bldStep = bldStep;
        this.id = id;
    }

    public ST_DgmBuildStepModel getBldStep() {
        return this.bldStep;
    }
    public ST_GuidModel getId() {
        return this.id;
    }
}