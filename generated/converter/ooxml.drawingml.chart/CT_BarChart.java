


public class CT_BarChartModel {


    private final CT_GapAmountModel gapWidth;
    private final CT_OverlapModel overlap;
    private final List<CT_ChartLinesModel> serLines;
    private final List<CT_UnsignedIntModel> axId;
    private final CT_ExtensionListModel extLst;

    public CT_BarChartModel(CT_GapAmountModel gapWidth , CT_OverlapModel overlap , List<CT_ChartLinesModel> serLines , List<CT_UnsignedIntModel> axId , CT_ExtensionListModel extLst ) {
        this.gapWidth = gapWidth;
        this.overlap = overlap;
        this.serLines = serLines;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_GapAmountModel getGapWidth() {
        return this.gapWidth;
    }
    public CT_OverlapModel getOverlap() {
        return this.overlap;
    }
    public List<CT_ChartLinesModel> getSerLines() {
        return this.serLines;
    }
    public List<CT_UnsignedIntModel> getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}