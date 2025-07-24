package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.Area3DChartModel;
import com.scell.model.drawingml.chart.AreaSerModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ChartLinesModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.GapAmountModel;
import com.scell.model.drawingml.chart.GroupingModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class Area3DChartBuilder {
  private GroupingModel grouping;

  private BooleanModel varyColors;

  private List<AreaSerModel> ser;

  private DLblsModel dLbls;

  private ChartLinesModel dropLines;

  private GapAmountModel gapDepth;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public Area3DChartBuilder() {
  }

  public Area3DChartBuilder setGrouping(GroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public Area3DChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public Area3DChartBuilder setSer(List<AreaSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public Area3DChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public Area3DChartBuilder setDropLines(ChartLinesModel dropLines) {
    this.dropLines = dropLines;
    return this;
  }

  public Area3DChartBuilder setGapDepth(GapAmountModel gapDepth) {
    this.gapDepth = gapDepth;
    return this;
  }

  public Area3DChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public Area3DChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public Area3DChartModel build() {
    return new Area3DChartModel(this.grouping, this.varyColors, this.ser, this.dLbls, this.dropLines, this.gapDepth, this.axId, this.extLst);
  }

  public Area3DChartBuilder from(Area3DChartModel value) {
    this.grouping = value.getGrouping();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.dropLines = value.getDropLines();
    this.gapDepth = value.getGapDepth();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
