
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_DgmBuildStepModel;
import test.ooxml.officeDocument.sharedTypes.ST_GuidModel;


public class CT_AnimationDgmElementModel {


    private final ST_DgmBuildStepModel bldStep;
    private final ST_GuidModel id;

    public CT_AnimationDgmElementModel(ST_DgmBuildStepModel bldStep, ST_GuidModel id) {
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
