


public class CT_TextFontModel {


    private final ByteModel charset;
    private final ST_TextTypefaceModel typeface;
    private final ST_PanoseModel panose;
    private final ST_PitchFamilyModel pitchFamily;

    public CT_TextFontModel(ByteModel charset , ST_TextTypefaceModel typeface , ST_PanoseModel panose , ST_PitchFamilyModel pitchFamily ) {
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