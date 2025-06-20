
package test.ooxml.drawingml.chart;

import test._2001.XMLSchema.DoubleModel;
import test._2001.XMLSchema.DoubleModel;
import test._2001.XMLSchema.DoubleModel;
import test._2001.XMLSchema.DoubleModel;
import test._2001.XMLSchema.DoubleModel;
import test._2001.XMLSchema.DoubleModel;


public class CT_PageMarginsModel {


    private final DoubleModel footer;
    private final DoubleModel l;
    private final DoubleModel t;
    private final DoubleModel header;
    private final DoubleModel r;
    private final DoubleModel b;

    public CT_PageMarginsModel(DoubleModel footer, DoubleModel l, DoubleModel t, DoubleModel header, DoubleModel r, DoubleModel b) {
        this.footer = footer;
        this.l = l;
        this.t = t;
        this.header = header;
        this.r = r;
        this.b = b;
    }

    public DoubleModel getFooter() {
        return this.footer;
    }
    public DoubleModel getL() {
        return this.l;
    }
    public DoubleModel getT() {
        return this.t;
    }
    public DoubleModel getHeader() {
        return this.header;
    }
    public DoubleModel getR() {
        return this.r;
    }
    public DoubleModel getB() {
        return this.b;
    }
}
