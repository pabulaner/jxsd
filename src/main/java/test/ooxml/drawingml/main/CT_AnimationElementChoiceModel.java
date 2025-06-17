
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_AnimationDgmElementModel;
import test.ooxml.drawingml.main.CT_AnimationChartElementModel;


public class CT_AnimationElementChoiceModel {

public class DgmOrchartModel {


    private final Object value;

    public DgmOrchartModel(CT_AnimationDgmElementModel value) {
        this.value = value;
    }
    public DgmOrchartModel(CT_AnimationChartElementModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_AnimationDgmElementModel getDgm() {
        return (CT_AnimationDgmElementModel) value;
    }
    public CT_AnimationChartElementModel getChart() {
        return (CT_AnimationChartElementModel) value;
    }
}

    private final DgmOrchartModel dgmOrchart;

    public CT_AnimationElementChoiceModel(DgmOrchartModel dgmOrchart) {
        this.dgmOrchart = dgmOrchart;
    }

    public DgmOrchartModel getDgmOrchart() {
        return this.dgmOrchart;
    }
}
