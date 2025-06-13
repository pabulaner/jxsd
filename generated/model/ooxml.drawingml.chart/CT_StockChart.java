


public class CT_StockChartModel {


    private final List<CT_LineSerModel> ser;
    private final CT_DLblsModel dLbls;
    private final CT_ChartLinesModel dropLines;
    private final CT_ChartLinesModel hiLowLines;
    private final CT_UpDownBarsModel upDownBars;
    private final List<CT_UnsignedIntModel> axId;
    private final CT_ExtensionListModel extLst;

    public CT_StockChartModel(List<CT_LineSerModel> ser , CT_DLblsModel dLbls , CT_ChartLinesModel dropLines , CT_ChartLinesModel hiLowLines , CT_UpDownBarsModel upDownBars , List<CT_UnsignedIntModel> axId , CT_ExtensionListModel extLst ) {
        this.ser = ser;
        this.dLbls = dLbls;
        this.dropLines = dropLines;
        this.hiLowLines = hiLowLines;
        this.upDownBars = upDownBars;
        this.axId = axId;
        this.extLst = extLst;
    }

    public List<CT_LineSerModel> getSer() {
        return this.ser;
    }
    public CT_DLblsModel getDLbls() {
        return this.dLbls;
    }
    public CT_ChartLinesModel getDropLines() {
        return this.dropLines;
    }
    public CT_ChartLinesModel getHiLowLines() {
        return this.hiLowLines;
    }
    public CT_UpDownBarsModel getUpDownBars() {
        return this.upDownBars;
    }
    public List<CT_UnsignedIntModel> getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}