package model.drawingml.chart;

import java.util.List;

public class CT_AreaChartModel {
  private final CT_GroupingModel grouping;

  private final CT_BooleanModel varyColors;

  private final List<CT_AreaSerModel> ser;

  private final CT_DLblsModel dLbls;

  private final CT_ChartLinesModel dropLines;

  private final List<CT_UnsignedIntModel> axId;

  private final CT_ExtensionListModel extLst;

  public CT_AreaChartModel(CT_GroupingModel grouping, CT_BooleanModel varyColors,
      List<CT_AreaSerModel> ser, CT_DLblsModel dLbls, CT_ChartLinesModel dropLines,
      List<CT_UnsignedIntModel> axId, CT_ExtensionListModel extLst) {
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.dropLines = dropLines;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CT_GroupingModel getGrouping() {
    return this.grouping;
  }

  public CT_BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<CT_AreaSerModel> getSer() {
    return this.ser;
  }

  public CT_DLblsModel getDLbls() {
    return this.dLbls;
  }

  public CT_ChartLinesModel getDropLines() {
    return this.dropLines;
  }

  public List<CT_UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
