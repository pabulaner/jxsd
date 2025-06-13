


public class CT_Line3DChartModel {


    private final CT_GapAmountModel gapDepth;
    private final List<CT_UnsignedIntModel> axId;
    private final CT_ExtensionListModel extLst;

    public CT_Line3DChartModel(CT_GapAmountModel gapDepth , List<CT_UnsignedIntModel> axId , CT_ExtensionListModel extLst ) {
        this.gapDepth = gapDepth;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_GapAmountModel getGapDepth() {
        return this.gapDepth;
    }
    public List<CT_UnsignedIntModel> getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}