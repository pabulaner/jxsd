


public class CT_DataModelModel {


    private final CT_PtListModel ptLst;
    private final CT_CxnListModel cxnLst;
    private final CT_BackgroundFormattingModel bg;
    private final CT_WholeE2oFormattingModel whole;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_DataModelModel(CT_PtListModel ptLst , CT_CxnListModel cxnLst , CT_BackgroundFormattingModel bg , CT_WholeE2oFormattingModel whole , CT_OfficeArtExtensionListModel extLst ) {
        this.ptLst = ptLst;
        this.cxnLst = cxnLst;
        this.bg = bg;
        this.whole = whole;
        this.extLst = extLst;
    }

    public CT_PtListModel getPtLst() {
        return this.ptLst;
    }
    public CT_CxnListModel getCxnLst() {
        return this.cxnLst;
    }
    public CT_BackgroundFormattingModel getBg() {
        return this.bg;
    }
    public CT_WholeE2oFormattingModel getWhole() {
        return this.whole;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}