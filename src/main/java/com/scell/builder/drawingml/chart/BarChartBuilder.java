package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BarChartModel;
import com.scell.model.drawingml.chart.BarDirModel;
import com.scell.model.drawingml.chart.BarGroupingModel;
import com.scell.model.drawingml.chart.BarSerModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ChartLinesModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.GapAmountModel;
import com.scell.model.drawingml.chart.OverlapModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class BarChartBuilder {
  private BarDirModel barDir;

  private BarGroupingModel grouping;

  private BooleanModel varyColors;

  private List<BarSerModel> ser;

  private DLblsModel dLbls;

  private GapAmountModel gapWidth;

  private OverlapModel overlap;

  private List<ChartLinesModel> serLines;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public BarChartBuilder() {
  }

  public BarChartBuilder setBarDir(BarDirModel barDir) {
    this.barDir = barDir;
    return this;
  }

  public BarChartBuilder setGrouping(BarGroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public BarChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public BarChartBuilder setSer(List<BarSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public BarChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public BarChartBuilder setGapWidth(GapAmountModel gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

  public BarChartBuilder setOverlap(OverlapModel overlap) {
    this.overlap = overlap;
    return this;
  }

  public BarChartBuilder setSerLines(List<ChartLinesModel> serLines) {
    this.serLines = serLines;
    return this;
  }

  public BarChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public BarChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public BarChartModel build() {
    return new BarChartModel(this.barDir, this.grouping, this.varyColors, this.ser, this.dLbls, this.gapWidth, this.overlap, this.serLines, this.axId, this.extLst);
  }

  public BarChartBuilder from(BarChartModel value) {
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
