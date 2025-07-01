package test.drawingml.chart;

public class CTBar3DChartModel {
  private final CTBarDirModel barDir;

  private final CTBarGroupingModel grouping;

  private final CTBooleanModel varyColors;

  private final CTBarSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTGapAmountModel gapWidth;

  private final CTGapAmountModel gapDepth;

  private final CTShapeModel shape;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTBar3DChartModel(CTBarDirModel barDir, CTBarGroupingModel grouping,
      CTBooleanModel varyColors, CTBarSerModel ser, CTDLblsModel dLbls, CTGapAmountModel gapWidth,
      CTGapAmountModel gapDepth, CTShapeModel shape, CTUnsignedIntModel axId,
      CTExtensionListModel extLst) {
    this.barDir = barDir;
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.gapWidth = gapWidth;
    this.gapDepth = gapDepth;
    this.shape = shape;
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

  public CTGapAmountModel getGapDepth() {
    return this.gapDepth;
  }

  public CTShapeModel getShape() {
    return this.shape;
  }

  public CTUnsignedIntModel getAxId() {
    return this.axId;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
