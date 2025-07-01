package test.drawingml.chart;

public class CTStockChartModel {
  private final CTLineSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTChartLinesModel dropLines;

  private final CTChartLinesModel hiLowLines;

  private final CTUpDownBarsModel upDownBars;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTStockChartModel(CTLineSerModel ser, CTDLblsModel dLbls, CTChartLinesModel dropLines,
      CTChartLinesModel hiLowLines, CTUpDownBarsModel upDownBars, CTUnsignedIntModel axId,
      CTExtensionListModel extLst) {
    this.ser = ser;
    this.dLbls = dLbls;
    this.dropLines = dropLines;
    this.hiLowLines = hiLowLines;
    this.upDownBars = upDownBars;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CTLineSerModel getSer() {
    return this.ser;
  }

  public CTDLblsModel getDLbls() {
    return this.dLbls;
  }

  public CTChartLinesModel getDropLines() {
    return this.dropLines;
  }

  public CTChartLinesModel getHiLowLines() {
    return this.hiLowLines;
  }

  public CTUpDownBarsModel getUpDownBars() {
    return this.upDownBars;
  }

  public CTUnsignedIntModel getAxId() {
    return this.axId;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
