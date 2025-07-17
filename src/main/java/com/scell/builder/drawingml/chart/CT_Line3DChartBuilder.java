package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_GapAmountModel;
import com.scell.model.drawingml.chart.CT_GroupingModel;
import com.scell.model.drawingml.chart.CT_Line3DChartModel;
import com.scell.model.drawingml.chart.CT_LineSerModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_Line3DChartBuilder {
  private CT_GroupingModel grouping;

  private CT_BooleanModel varyColors;

  private List<CT_LineSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_ChartLinesModel dropLines;

  private CT_GapAmountModel gapDepth;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_Line3DChartBuilder() {
  }

  public CT_Line3DChartBuilder setGrouping(CT_GroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public CT_Line3DChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_Line3DChartBuilder setSer(List<CT_LineSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_Line3DChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_Line3DChartBuilder setDropLines(CT_ChartLinesModel dropLines) {
    this.dropLines = dropLines;
    return this;
  }

  public CT_Line3DChartBuilder setGapDepth(CT_GapAmountModel gapDepth) {
    this.gapDepth = gapDepth;
    return this;
  }

  public CT_Line3DChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_Line3DChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_Line3DChartModel build() {
    return new CT_Line3DChartModel(this.grouping, this.varyColors, this.ser, this.dLbls, this.dropLines, this.gapDepth, this.axId, this.extLst);
  }

  public CT_Line3DChartBuilder from(CT_Line3DChartModel value) {
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
