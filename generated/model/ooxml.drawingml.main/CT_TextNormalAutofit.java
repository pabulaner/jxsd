


public class CT_TextNormalAutofitModel {


    private final ST_TextFontScalePercentOrPercentStringModel fontScale;
    private final ST_TextSpacingPercentOrPercentStringModel lnSpcReduction;

    public CT_TextNormalAutofitModel(ST_TextFontScalePercentOrPercentStringModel fontScale , ST_TextSpacingPercentOrPercentStringModel lnSpcReduction ) {
        this.fontScale = fontScale;
        this.lnSpcReduction = lnSpcReduction;
    }

    public ST_TextFontScalePercentOrPercentStringModel getFontScale() {
        return this.fontScale;
    }
    public ST_TextSpacingPercentOrPercentStringModel getLnSpcReduction() {
        return this.lnSpcReduction;
    }
}