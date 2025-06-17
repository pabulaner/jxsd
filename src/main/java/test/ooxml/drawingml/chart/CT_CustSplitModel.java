
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_UnsignedIntModel;


public class CT_CustSplitModel {


    private final CT_UnsignedIntModel secondPiePt;

    public CT_CustSplitModel(CT_UnsignedIntModel secondPiePt) {
        this.secondPiePt = secondPiePt;
    }

    public CT_UnsignedIntModel getSecondPiePt() {
        return this.secondPiePt;
    }
}
