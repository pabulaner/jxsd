package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BarChartModel;
import com.scell.model.drawingml.chart.CT_BarDirModel;
import com.scell.model.drawingml.chart.CT_BarGroupingModel;
import com.scell.model.drawingml.chart.CT_BarSerModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_GapAmountModel;
import com.scell.model.drawingml.chart.CT_OverlapModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_BarChartBuilder {
  private CT_BarDirModel barDir;

  private CT_BarGroupingModel grouping;

  private CT_BooleanModel varyColors;

  private List<CT_BarSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_GapAmountModel gapWidth;

  private CT_OverlapModel overlap;

  private List<CT_ChartLinesModel> serLines;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_BarChartBuilder() {
  }

  public CT_BarChartBuilder setBarDir(CT_BarDirModel barDir) {
    this.barDir = barDir;
    return this;
  }

  public CT_BarChartBuilder setGrouping(CT_BarGroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public CT_BarChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_BarChartBuilder setSer(List<CT_BarSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_BarChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_BarChartBuilder setGapWidth(CT_GapAmountModel gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

  public CT_BarChartBuilder setOverlap(CT_OverlapModel overlap) {
    this.overlap = overlap;
    return this;
  }

  public CT_BarChartBuilder setSerLines(List<CT_ChartLinesModel> serLines) {
    this.serLines = serLines;
    return this;
  }

  public CT_BarChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_BarChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_BarChartModel build() {
    return new CT_BarChartModel(this.barDir, this.grouping, this.varyColors, this.ser, this.dLbls, this.gapWidth, this.overlap, this.serLines, this.axId, this.extLst);
  }

  public CT_BarChartBuilder from(CT_BarChartModel value) {
    this.barDir = value.getBarDir();
    this.grouping = value.getGrouping();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.gapWidth = value.getGapWidth();
    this.overlap = value.getOverlap();
    this.serLines = value.getSerLines();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
