
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_TextBodyPropertiesModel;
import test.ooxml.drawingml.main.CT_TextListStyleModel;
import test.ooxml.drawingml.main.CT_TextParagraphModel;


public class CT_TextBodyModel {


    private final CT_TextBodyPropertiesModel bodyPr;
    private final CT_TextListStyleModel lstStyle;
    private final CT_TextParagraphModel p;

    public CT_TextBodyModel(CT_TextBodyPropertiesModel bodyPr, CT_TextListStyleModel lstStyle, CT_TextParagraphModel p) {
        this.bodyPr = bodyPr;
        this.lstStyle = lstStyle;
        this.p = p;
    }

    public CT_TextBodyPropertiesModel getBodyPr() {
        return this.bodyPr;
    }
    public CT_TextListStyleModel getLstStyle() {
        return this.lstStyle;
    }
    public CT_TextParagraphModel getP() {
        return this.p;
    }
}
