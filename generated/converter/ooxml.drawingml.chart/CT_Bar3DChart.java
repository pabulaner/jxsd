


public class CT_Bar3DChartModel {


    private final CT_GapAmountModel gapWidth;
    private final CT_GapAmountModel gapDepth;
    private final CT_ShapeModel shape;
    private final List<CT_UnsignedIntModel> axId;
    private final CT_ExtensionListModel extLst;

    public CT_Bar3DChartModel(CT_GapAmountModel gapWidth , CT_GapAmountModel gapDepth , CT_ShapeModel shape , List<CT_UnsignedIntModel> axId , CT_ExtensionListModel extLst ) {
        this.gapWidth = gapWidth;
        this.gapDepth = gapDepth;
        this.shape = shape;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_GapAmountModel getGapWidth() {
        return this.gapWidth;
    }
    public CT_GapAmountModel getGapDepth() {
        return this.gapDepth;
    }
    public CT_ShapeModel getShape() {
        return this.shape;
    }
    public List<CT_UnsignedIntModel> getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}