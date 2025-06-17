
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_TextCharacterPropertiesModel;
import test._2001.XMLSchema.StringModel;


public class CT_RegularTextRunModel {


    private final CT_TextCharacterPropertiesModel rPr;
    private final StringModel t;

    public CT_RegularTextRunModel(CT_TextCharacterPropertiesModel rPr, StringModel t) {
        this.rPr = rPr;
        this.t = t;
    }

    public CT_TextCharacterPropertiesModel getRPr() {
        return this.rPr;
    }
    public StringModel getT() {
        return this.t;
    }
}
