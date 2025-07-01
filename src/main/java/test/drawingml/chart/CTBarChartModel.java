package test.drawingml.chart;

public class CTBarChartModel {
  private final CTBarDirModel barDir;

  private final CTBarGroupingModel grouping;

  private final CTBooleanModel varyColors;

  private final CTBarSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTGapAmountModel gapWidth;

  private final CTOverlapModel overlap;

  private final CTChartLinesModel serLines;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTBarChartModel(CTBarDirModel barDir, CTBarGroupingModel grouping,
      CTBooleanModel varyColors, CTBarSerModel ser, CTDLblsModel dLbls, CTGapAmountModel gapWidth,
      CTOverlapModel overlap, CTChartLinesModel serLines, CTUnsignedIntModel axId,
      CTExtensionListModel extLst) {
    this.barDir = barDir;
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.gapWidth = gapWidth;
    this.overlap = overlap;
    this.serLines = serLines;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CTBarDirModel getBarDir() {
    return this.barDir;
  }

  public CTBarGroupingModel getGrouping() {
    return this.grouping;
  }

  public CTBooleanModel getVaryColors() {
    return this.varyColors;
  }

  public CTBarSerModel getSer() {
    return this.ser;
  }

  public CTDLblsModel getDLbls() {
    return this.dLbls;
  }

  public CTGapAmountModel getGapWidth() {
    return this.gapWidth;
  }

  public CTOverlapModel getOverlap() {
    return this.overlap;
  }

  public CTChartLinesModel getSerLines() {
    return this.serLines;
  }

  public CTUnsignedIntModel getAxId() {
    return this.axId;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
