package test.drawingml.chart;

public class CTArea3DChartModel {
  private final CTGroupingModel grouping;

  private final CTBooleanModel varyColors;

  private final CTAreaSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTChartLinesModel dropLines;

  private final CTGapAmountModel gapDepth;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTArea3DChartModel(CTGroupingModel grouping, CTBooleanModel varyColors, CTAreaSerModel ser,
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

  public CTAreaSerModel getSer() {
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
