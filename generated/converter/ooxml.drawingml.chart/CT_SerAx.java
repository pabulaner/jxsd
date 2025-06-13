


public class CT_SerAxModel {


    private final CT_SkipModel tickLblSkip;
    private final CT_SkipModel tickMarkSkip;
    private final CT_ExtensionListModel extLst;

    public CT_SerAxModel(CT_SkipModel tickLblSkip , CT_SkipModel tickMarkSkip , CT_ExtensionListModel extLst ) {
        this.tickLblSkip = tickLblSkip;
        this.tickMarkSkip = tickMarkSkip;
        this.extLst = extLst;
    }

    public CT_SkipModel getTickLblSkip() {
        return this.tickLblSkip;
    }
    public CT_SkipModel getTickMarkSkip() {
        return this.tickMarkSkip;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}