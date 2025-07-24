package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ChartLinesModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.GapAmountModel;
import com.scell.model.drawingml.chart.GroupingModel;
import com.scell.model.drawingml.chart.Line3DChartModel;
import com.scell.model.drawingml.chart.LineSerModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class Line3DChartBuilder {
  private GroupingModel grouping;

  private BooleanModel varyColors;

  private List<LineSerModel> ser;

  private DLblsModel dLbls;

  private ChartLinesModel dropLines;

  private GapAmountModel gapDepth;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public Line3DChartBuilder() {
  }

  public Line3DChartBuilder setGrouping(GroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public Line3DChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public Line3DChartBuilder setSer(List<LineSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public Line3DChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public Line3DChartBuilder setDropLines(ChartLinesModel dropLines) {
    this.dropLines = dropLines;
    return this;
  }

  public Line3DChartBuilder setGapDepth(GapAmountModel gapDepth) {
    this.gapDepth = gapDepth;
    return this;
  }

  public Line3DChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public Line3DChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public Line3DChartModel build() {
    return new Line3DChartModel(this.grouping, this.varyColors, this.ser, this.dLbls, this.dropLines, this.gapDepth, this.axId, this.extLst);
  }

  public Line3DChartBuilder from(Line3DChartModel value) {
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
