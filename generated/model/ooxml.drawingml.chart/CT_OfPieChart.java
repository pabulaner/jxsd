


public class CT_OfPieChartModel {


    private final CT_OfPieTypeModel ofPieType;
    private final CT_GapAmountModel gapWidth;
    private final CT_SplitTypeModel splitType;
    private final CT_DoubleModel splitPos;
    private final CT_CustSplitModel custSplit;
    private final CT_SecondPieSizeModel secondPieSize;
    private final List<CT_ChartLinesModel> serLines;
    private final CT_ExtensionListModel extLst;

    public CT_OfPieChartModel(CT_OfPieTypeModel ofPieType , CT_GapAmountModel gapWidth , CT_SplitTypeModel splitType , CT_DoubleModel splitPos , CT_CustSplitModel custSplit , CT_SecondPieSizeModel secondPieSize , List<CT_ChartLinesModel> serLines , CT_ExtensionListModel extLst ) {
        this.ofPieType = ofPieType;
        this.gapWidth = gapWidth;
        this.splitType = splitType;
        this.splitPos = splitPos;
        this.custSplit = custSplit;
        this.secondPieSize = secondPieSize;
        this.serLines = serLines;
        this.extLst = extLst;
    }

    public CT_OfPieTypeModel getOfPieType() {
        return this.ofPieType;
    }
    public CT_GapAmountModel getGapWidth() {
        return this.gapWidth;
    }
    public CT_SplitTypeModel getSplitType() {
        return this.splitType;
    }
    public CT_DoubleModel getSplitPos() {
        return this.splitPos;
    }
    public CT_CustSplitModel getCustSplit() {
        return this.custSplit;
    }
    public CT_SecondPieSizeModel getSecondPieSize() {
        return this.secondPieSize;
    }
    public List<CT_ChartLinesModel> getSerLines() {
        return this.serLines;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}