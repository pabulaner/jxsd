


public class CT_UpDownBarsModel {


    private final CT_GapAmountModel gapWidth;
    private final CT_UpDownBarModel upBars;
    private final CT_UpDownBarModel downBars;
    private final CT_ExtensionListModel extLst;

    public CT_UpDownBarsModel(CT_GapAmountModel gapWidth , CT_UpDownBarModel upBars , CT_UpDownBarModel downBars , CT_ExtensionListModel extLst ) {
        this.gapWidth = gapWidth;
        this.upBars = upBars;
        this.downBars = downBars;
        this.extLst = extLst;
    }

    public CT_GapAmountModel getGapWidth() {
        return this.gapWidth;
    }
    public CT_UpDownBarModel getUpBars() {
        return this.upBars;
    }
    public CT_UpDownBarModel getDownBars() {
        return this.downBars;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}