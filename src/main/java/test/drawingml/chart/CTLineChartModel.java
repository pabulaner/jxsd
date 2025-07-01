package test.drawingml.chart;

public class CTLineChartModel {
  private final CTGroupingModel grouping;

  private final CTBooleanModel varyColors;

  private final CTLineSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTChartLinesModel dropLines;

  private final CTChartLinesModel hiLowLines;

  private final CTUpDownBarsModel upDownBars;

  private final CTBooleanModel marker;

  private final CTBooleanModel smooth;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTLineChartModel(CTGroupingModel grouping, CTBooleanModel varyColors, CTLineSerModel ser,
      CTDLblsModel dLbls, CTChartLinesModel dropLines, CTChartLinesModel hiLowLines,
      CTUpDownBarsModel upDownBars, CTBooleanModel marker, CTBooleanModel smooth,
      CTUnsignedIntModel axId, CTExtensionListModel extLst) {
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.dropLines = dropLines;
    this.hiLowLines = hiLowLines;
    this.upDownBars = upDownBars;
    this.marker = marker;
    this.smooth = smooth;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CTGroupingModel getGrouping() {
    return this.grouping;
  }

  public CTBooleanModel getVaryColors() {
    return this.varyColors;
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

  public CTBooleanModel getMarker() {
    return this.marker;
  }

  public CTBooleanModel getSmooth() {
    return this.smooth;
  }

  public CTUnsignedIntModel getAxId() {
    return this.axId;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
