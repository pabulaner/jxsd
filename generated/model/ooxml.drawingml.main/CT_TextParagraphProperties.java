


public class CT_TextParagraphPropertiesModel {


    private final ST_TextIndentModel indent;
    private final BooleanModel latinLnBrk;
    private final ST_TextMarginModel marR;
    private final BooleanModel hangingPunct;
    private final ST_TextFontAlignTypeModel fontAlgn;
    private final BooleanModel eaLnBrk;
    private final BooleanModel rtl;
    private final ST_TextIndentLevelTypeModel lvl;
    private final ST_TextMarginModel marL;
    private final ST_Coordinate32Model defTabSz;
    private final ST_TextAlignTypeModel algn;
    private final CT_TextSpacingModel lnSpc;
    private final CT_TextSpacingModel spcBef;
    private final CT_TextSpacingModel spcAft;
    private final CT_TextTabStopListModel tabLst;
    private final CT_TextCharacterPropertiesModel defRPr;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TextParagraphPropertiesModel(ST_TextIndentModel indent , BooleanModel latinLnBrk , ST_TextMarginModel marR , BooleanModel hangingPunct , ST_TextFontAlignTypeModel fontAlgn , BooleanModel eaLnBrk , BooleanModel rtl , ST_TextIndentLevelTypeModel lvl , ST_TextMarginModel marL , ST_Coordinate32Model defTabSz , ST_TextAlignTypeModel algn , CT_TextSpacingModel lnSpc , CT_TextSpacingModel spcBef , CT_TextSpacingModel spcAft , CT_TextTabStopListModel tabLst , CT_TextCharacterPropertiesModel defRPr , CT_OfficeArtExtensionListModel extLst ) {
        this.indent = indent;
        this.latinLnBrk = latinLnBrk;
        this.marR = marR;
        this.hangingPunct = hangingPunct;
        this.fontAlgn = fontAlgn;
        this.eaLnBrk = eaLnBrk;
        this.rtl = rtl;
        this.lvl = lvl;
        this.marL = marL;
        this.defTabSz = defTabSz;
        this.algn = algn;
        this.lnSpc = lnSpc;
        this.spcBef = spcBef;
        this.spcAft = spcAft;
        this.tabLst = tabLst;
        this.defRPr = defRPr;
        this.extLst = extLst;
    }

    public ST_TextIndentModel getIndent() {
        return this.indent;
    }
    public BooleanModel getLatinLnBrk() {
        return this.latinLnBrk;
    }
    public ST_TextMarginModel getMarR() {
        return this.marR;
    }
    public BooleanModel getHangingPunct() {
        return this.hangingPunct;
    }
    public ST_TextFontAlignTypeModel getFontAlgn() {
        return this.fontAlgn;
    }
    public BooleanModel getEaLnBrk() {
        return this.eaLnBrk;
    }
    public BooleanModel getRtl() {
        return this.rtl;
    }
    public ST_TextIndentLevelTypeModel getLvl() {
        return this.lvl;
    }
    public ST_TextMarginModel getMarL() {
        return this.marL;
    }
    public ST_Coordinate32Model getDefTabSz() {
        return this.defTabSz;
    }
    public ST_TextAlignTypeModel getAlgn() {
        return this.algn;
    }
    public CT_TextSpacingModel getLnSpc() {
        return this.lnSpc;
    }
    public CT_TextSpacingModel getSpcBef() {
        return this.spcBef;
    }
    public CT_TextSpacingModel getSpcAft() {
        return this.spcAft;
    }
    public CT_TextTabStopListModel getTabLst() {
        return this.tabLst;
    }
    public CT_TextCharacterPropertiesModel getDefRPr() {
        return this.defRPr;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}