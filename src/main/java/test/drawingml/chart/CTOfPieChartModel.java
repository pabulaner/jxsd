package test.drawingml.chart;

public class CTOfPieChartModel {
  private final CTOfPieTypeModel ofPieType;

  private final CTBooleanModel varyColors;

  private final CTPieSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTGapAmountModel gapWidth;

  private final CTSplitTypeModel splitType;

  private final CTDoubleModel splitPos;

  private final CTCustSplitModel custSplit;

  private final CTSecondPieSizeModel secondPieSize;

  private final CTChartLinesModel serLines;

  private final CTExtensionListModel extLst;

  public CTOfPieChartModel(CTOfPieTypeModel ofPieType, CTBooleanModel varyColors, CTPieSerModel ser,
      CTDLblsModel dLbls, CTGapAmountModel gapWidth, CTSplitTypeModel splitType,
      CTDoubleModel splitPos, CTCustSplitModel custSplit, CTSecondPieSizeModel secondPieSize,
      CTChartLinesModel serLines, CTExtensionListModel extLst) {
    this.ofPieType = ofPieType;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.gapWidth = gapWidth;
    this.splitType = splitType;
    this.splitPos = splitPos;
    this.custSplit = custSplit;
    this.secondPieSize = secondPieSize;
    this.serLines = serLines;
    this.extLst = extLst;
  }

  public CTOfPieTypeModel getOfPieType() {
    return this.ofPieType;
  }

  public CTBooleanModel getVaryColors() {
    return this.varyColors;
  }

  public CTPieSerModel getSer() {
    return this.ser;
  }

  public CTDLblsModel getDLbls() {
    return this.dLbls;
  }

  public CTGapAmountModel getGapWidth() {
    return this.gapWidth;
  }

  public CTSplitTypeModel getSplitType() {
    return this.splitType;
  }

  public CTDoubleModel getSplitPos() {
    return this.splitPos;
  }

  public CTCustSplitModel getCustSplit() {
    return this.custSplit;
  }

  public CTSecondPieSizeModel getSecondPieSize() {
    return this.secondPieSize;
  }

  public CTChartLinesModel getSerLines() {
    return this.serLines;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
