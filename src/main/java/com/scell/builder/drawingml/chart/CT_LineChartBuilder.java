package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_GroupingModel;
import com.scell.model.drawingml.chart.CT_LineChartModel;
import com.scell.model.drawingml.chart.CT_LineSerModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.chart.CT_UpDownBarsModel;
import java.util.List;

public class CT_LineChartBuilder {
  private CT_GroupingModel grouping;

  private CT_BooleanModel varyColors;

  private List<CT_LineSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_ChartLinesModel dropLines;

  private CT_ChartLinesModel hiLowLines;

  private CT_UpDownBarsModel upDownBars;

  private CT_BooleanModel marker;

  private CT_BooleanModel smooth;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_LineChartBuilder() {
  }

  public CT_LineChartBuilder setGrouping(CT_GroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public CT_LineChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_LineChartBuilder setSer(List<CT_LineSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_LineChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_LineChartBuilder setDropLines(CT_ChartLinesModel dropLines) {
    this.dropLines = dropLines;
    return this;
  }

  public CT_LineChartBuilder setHiLowLines(CT_ChartLinesModel hiLowLines) {
    this.hiLowLines = hiLowLines;
    return this;
  }

  public CT_LineChartBuilder setUpDownBars(CT_UpDownBarsModel upDownBars) {
    this.upDownBars = upDownBars;
    return this;
  }

  public CT_LineChartBuilder setMarker(CT_BooleanModel marker) {
    this.marker = marker;
    return this;
  }

  public CT_LineChartBuilder setSmooth(CT_BooleanModel smooth) {
    this.smooth = smooth;
    return this;
  }

  public CT_LineChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_LineChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_LineChartModel build() {
    return new CT_LineChartModel(this.grouping, this.varyColors, this.ser, this.dLbls, this.dropLines, this.hiLowLines, this.upDownBars, this.marker, this.smooth, this.axId, this.extLst);
  }

  public CT_LineChartBuilder from(CT_LineChartModel value) {
    this.grouping = value.getGrouping();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.dropLines = value.getDropLines();
    this.hiLowLines = value.getHiLowLines();
    this.upDownBars = value.getUpDownBars();
    this.marker = value.getMarker();
    this.smooth = value.getSmooth();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
