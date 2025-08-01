package com.scell.model.drawingml.chart;

import java.util.List;

public class AreaChartModel implements IAreaChartValueModel {
  private final GroupingModel grouping;

  private final BooleanModel varyColors;

  private final List<AreaSerModel> ser;

  private final DLblsModel dLbls;

  private final ChartLinesModel dropLines;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public AreaChartModel(GroupingModel grouping, BooleanModel varyColors, List<AreaSerModel> ser,
      DLblsModel dLbls, ChartLinesModel dropLines, List<UnsignedIntModel> axId,
      ExtensionListModel extLst) {
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.dropLines = dropLines;
    this.axId = axId;
    this.extLst = extLst;
  }

  public GroupingModel getGrouping() {
    return this.grouping;
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<AreaSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public ChartLinesModel getDropLines() {
    return this.dropLines;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
