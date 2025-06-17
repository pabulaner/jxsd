
package test.ooxml.drawingml.diagram;

import test.ooxml.drawingml.diagram.ST_ClrAppMethodModel;
import test.ooxml.drawingml.diagram.ST_HueDirModel;


public class CT_ColorsModel {


    private final ST_ClrAppMethodModel meth;
    private final ST_HueDirModel hueDir;

    public CT_ColorsModel(ST_ClrAppMethodModel meth, ST_HueDirModel hueDir) {
        this.meth = meth;
        this.hueDir = hueDir;
    }

    public ST_ClrAppMethodModel getMeth() {
        return this.meth;
    }
    public ST_HueDirModel getHueDir() {
        return this.hueDir;
    }
}
