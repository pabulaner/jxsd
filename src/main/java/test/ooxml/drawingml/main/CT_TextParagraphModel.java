
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_TextParagraphPropertiesModel;
import test.ooxml.drawingml.main.CT_TextCharacterPropertiesModel;


public class CT_TextParagraphModel {


    private final CT_TextParagraphPropertiesModel pPr;
    private final CT_TextCharacterPropertiesModel endParaRPr;

    public CT_TextParagraphModel(CT_TextParagraphPropertiesModel pPr, CT_TextCharacterPropertiesModel endParaRPr) {
        this.pPr = pPr;
        this.endParaRPr = endParaRPr;
    }

    public CT_TextParagraphPropertiesModel getPPr() {
        return this.pPr;
    }
    public CT_TextCharacterPropertiesModel getEndParaRPr() {
        return this.endParaRPr;
    }
}
