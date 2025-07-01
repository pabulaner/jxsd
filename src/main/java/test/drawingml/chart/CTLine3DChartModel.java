package test.drawingml.chart;

public class CTLine3DChartModel {
  private final CTGroupingModel grouping;

  private final CTBooleanModel varyColors;

  private final CTLineSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTChartLinesModel dropLines;

  private final CTGapAmountModel gapDepth;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTLine3DChartModel(CTGroupingModel grouping, CTBooleanModel varyColors, CTLineSerModel ser,
      CTDLblsModel dLbls, CTChartLinesModel dropLines, CTGapAmountModel gapDepth,
      CTUnsignedIntModel axId, CTExtensionListModel extLst) {
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.dropLines = dropLines;
    this.gapDepth = gapDepth;
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

  public CTGapAmountModel getGapDepth() {
    return this.gapDepth;
  }

  public CTUnsignedIntModel getAxId() {
    return this.axId;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
