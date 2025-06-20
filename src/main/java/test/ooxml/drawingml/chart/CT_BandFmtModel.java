
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.main.CT_ShapePropertiesModel;


public class CT_BandFmtModel {


    private final CT_UnsignedIntModel idx;
    private final CT_ShapePropertiesModel spPr;

    public CT_BandFmtModel(CT_UnsignedIntModel idx, CT_ShapePropertiesModel spPr) {
        this.idx = idx;
        this.spPr = spPr;
    }

    public CT_UnsignedIntModel getIdx() {
        return this.idx;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
}
