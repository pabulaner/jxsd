package com.scell.model.drawingml.chart;

import java.util.List;

public class OfPieChartModel {
  private final OfPieTypeModel ofPieType;

  private final BooleanModel varyColors;

  private final List<PieSerModel> ser;

  private final DLblsModel dLbls;

  private final GapAmountModel gapWidth;

  private final SplitTypeModel splitType;

  private final DoubleModel splitPos;

  private final CustSplitModel custSplit;

  private final SecondPieSizeModel secondPieSize;

  private final List<ChartLinesModel> serLines;

  private final ExtensionListModel extLst;

  public OfPieChartModel(OfPieTypeModel ofPieType, BooleanModel varyColors, List<PieSerModel> ser,
      DLblsModel dLbls, GapAmountModel gapWidth, SplitTypeModel splitType, DoubleModel splitPos,
      CustSplitModel custSplit, SecondPieSizeModel secondPieSize, List<ChartLinesModel> serLines,
      ExtensionListModel extLst) {
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

  public OfPieTypeModel getOfPieType() {
    return this.ofPieType;
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<PieSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public GapAmountModel getGapWidth() {
    return this.gapWidth;
  }

  public SplitTypeModel getSplitType() {
    return this.splitType;
  }

  public DoubleModel getSplitPos() {
    return this.splitPos;
  }

  public CustSplitModel getCustSplit() {
    return this.custSplit;
  }

  public SecondPieSizeModel getSecondPieSize() {
    return this.secondPieSize;
  }

  public List<ChartLinesModel> getSerLines() {
    return this.serLines;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
