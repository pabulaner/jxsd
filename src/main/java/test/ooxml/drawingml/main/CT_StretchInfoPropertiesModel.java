
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_RelativeRectModel;


public class CT_StretchInfoPropertiesModel {


    private final CT_RelativeRectModel fillRect;

    public CT_StretchInfoPropertiesModel(CT_RelativeRectModel fillRect) {
        this.fillRect = fillRect;
    }

    public CT_RelativeRectModel getFillRect() {
        return this.fillRect;
    }
}
