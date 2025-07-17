package model.drawingml.chart;

import java.util.List;

public class CT_LineChartModel {
  private final CT_GroupingModel grouping;

  private final CT_BooleanModel varyColors;

  private final List<CT_LineSerModel> ser;

  private final CT_DLblsModel dLbls;

  private final CT_ChartLinesModel dropLines;

  private final CT_ChartLinesModel hiLowLines;

  private final CT_UpDownBarsModel upDownBars;

  private final CT_BooleanModel marker;

  private final CT_BooleanModel smooth;

  private final List<CT_UnsignedIntModel> axId;

  private final CT_ExtensionListModel extLst;

  public CT_LineChartModel(CT_GroupingModel grouping, CT_BooleanModel varyColors,
      List<CT_LineSerModel> ser, CT_DLblsModel dLbls, CT_ChartLinesModel dropLines,
      CT_ChartLinesModel hiLowLines, CT_UpDownBarsModel upDownBars, CT_BooleanModel marker,
      CT_BooleanModel smooth, List<CT_UnsignedIntModel> axId, CT_ExtensionListModel extLst) {
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

  public CT_ChartLinesModel getHiLowLines() {
    return this.hiLowLines;
  }

  public CT_UpDownBarsModel getUpDownBars() {
    return this.upDownBars;
  }

  public CT_BooleanModel getMarker() {
    return this.marker;
  }

  public CT_BooleanModel getSmooth() {
    return this.smooth;
  }

  public List<CT_UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
