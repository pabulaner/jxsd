


public class CT_SupplementalFontModel {


    private final ST_TextTypefaceModel typeface;
    private final StringModel script;

    public CT_SupplementalFontModel(ST_TextTypefaceModel typeface , StringModel script ) {
        this.typeface = typeface;
        this.script = script;
    }

    public ST_TextTypefaceModel getTypeface() {
        return this.typeface;
    }
    public StringModel getScript() {
        return this.script;
    }
}