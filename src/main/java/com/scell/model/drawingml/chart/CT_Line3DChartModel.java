package com.scell.model.drawingml.chart;

import java.util.List;

public class CT_Line3DChartModel {
  private final CT_GroupingModel grouping;

  private final CT_BooleanModel varyColors;

  private final List<CT_LineSerModel> ser;

  private final CT_DLblsModel dLbls;

  private final CT_ChartLinesModel dropLines;

  private final CT_GapAmountModel gapDepth;

  private final List<CT_UnsignedIntModel> axId;

  private final CT_ExtensionListModel extLst;

  public CT_Line3DChartModel(CT_GroupingModel grouping, CT_BooleanModel varyColors,
      List<CT_LineSerModel> ser, CT_DLblsModel dLbls, CT_ChartLinesModel dropLines,
      CT_GapAmountModel gapDepth, List<CT_UnsignedIntModel> axId, CT_ExtensionListModel extLst) {
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.dropLines = dropLines;
    this.gapDepth = gapDepth;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CT_GroupingModel getGrouping() {
    return this.grouping;
  }

  public CT_BooleanModel getVaryColors() {
    return this.varyColors;
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

  public CT_GapAmountModel getGapDepth() {
    return this.gapDepth;
  }

  public List<CT_UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
