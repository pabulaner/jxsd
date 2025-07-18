package com.scell.model.drawingml.chart;

import java.util.List;

public class CT_Bar3DChartModel {
  private final CT_BarDirModel barDir;

  private final CT_BarGroupingModel grouping;

  private final CT_BooleanModel varyColors;

  private final List<CT_BarSerModel> ser;

  private final CT_DLblsModel dLbls;

  private final CT_GapAmountModel gapWidth;

  private final CT_GapAmountModel gapDepth;

  private final CT_ShapeModel shape;

  private final List<CT_UnsignedIntModel> axId;

  private final CT_ExtensionListModel extLst;

  public CT_Bar3DChartModel(CT_BarDirModel barDir, CT_BarGroupingModel grouping,
      CT_BooleanModel varyColors, List<CT_BarSerModel> ser, CT_DLblsModel dLbls,
      CT_GapAmountModel gapWidth, CT_GapAmountModel gapDepth, CT_ShapeModel shape,
      List<CT_UnsignedIntModel> axId, CT_ExtensionListModel extLst) {
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

  public CT_BarDirModel getBarDir() {
    return this.barDir;
  }

  public CT_BarGroupingModel getGrouping() {
    return this.grouping;
  }

  public CT_BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<CT_BarSerModel> getSer() {
    return this.ser;
  }

  public CT_DLblsModel getDLbls() {
    return this.dLbls;
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
