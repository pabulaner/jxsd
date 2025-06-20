
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.StringModel;
import test.ooxml.officeDocument.sharedTypes.ST_GuidModel;
import test.ooxml.drawingml.main.CT_TextCharacterPropertiesModel;
import test.ooxml.drawingml.main.CT_TextParagraphPropertiesModel;
import test._2001.XMLSchema.StringModel;


public class CT_TextFieldModel {


    private final StringModel type;
    private final ST_GuidModel id;
    private final CT_TextCharacterPropertiesModel rPr;
    private final CT_TextParagraphPropertiesModel pPr;
    private final StringModel t;

    public CT_TextFieldModel(StringModel type, ST_GuidModel id, CT_TextCharacterPropertiesModel rPr, CT_TextParagraphPropertiesModel pPr, StringModel t) {
        this.type = type;
        this.id = id;
        this.rPr = rPr;
        this.pPr = pPr;
        this.t = t;
    }

    public StringModel getType() {
        return this.type;
    }
    public ST_GuidModel getId() {
        return this.id;
    }
    public CT_TextCharacterPropertiesModel getRPr() {
        return this.rPr;
    }
    public CT_TextParagraphPropertiesModel getPPr() {
        return this.pPr;
    }
    public StringModel getT() {
        return this.t;
    }
}
