
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.IntModel;
import test._2001.XMLSchema.IntModel;
import test.ooxml.drawingml.main.ST_ChartBuildStepModel;


public class CT_AnimationChartElementModel {


    private final IntModel categoryIdx;
    private final IntModel seriesIdx;
    private final ST_ChartBuildStepModel bldStep;

    public CT_AnimationChartElementModel(IntModel categoryIdx, IntModel seriesIdx, ST_ChartBuildStepModel bldStep) {
        this.categoryIdx = categoryIdx;
        this.seriesIdx = seriesIdx;
        this.bldStep = bldStep;
    }

    public IntModel getCategoryIdx() {
        return this.categoryIdx;
    }
    public IntModel getSeriesIdx() {
        return this.seriesIdx;
    }
    public ST_ChartBuildStepModel getBldStep() {
        return this.bldStep;
    }
}
