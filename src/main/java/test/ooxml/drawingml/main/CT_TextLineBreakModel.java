
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_TextCharacterPropertiesModel;


public class CT_TextLineBreakModel {


    private final CT_TextCharacterPropertiesModel rPr;

    public CT_TextLineBreakModel(CT_TextCharacterPropertiesModel rPr) {
        this.rPr = rPr;
    }

    public CT_TextCharacterPropertiesModel getRPr() {
        return this.rPr;
    }
}
