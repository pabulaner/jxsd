
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.ByteModel;
import test.ooxml.drawingml.main.ST_TextTypefaceModel;
import test.ooxml.officeDocument.sharedTypes.ST_PanoseModel;
import test.ooxml.drawingml.main.ST_PitchFamilyModel;


public class CT_TextFontModel {


    private final ByteModel charset;
    private final ST_TextTypefaceModel typeface;
    private final ST_PanoseModel panose;
    private final ST_PitchFamilyModel pitchFamily;

    public CT_TextFontModel(ByteModel charset, ST_TextTypefaceModel typeface, ST_PanoseModel panose, ST_PitchFamilyModel pitchFamily) {
        this.charset = charset;
        this.typeface = typeface;
        this.panose = panose;
        this.pitchFamily = pitchFamily;
    }

    public ByteModel getCharset() {
        return this.charset;
    }
    public ST_TextTypefaceModel getTypeface() {
        return this.typeface;
    }
    public ST_PanoseModel getPanose() {
        return this.panose;
    }
    public ST_PitchFamilyModel getPitchFamily() {
        return this.pitchFamily;
    }
}
