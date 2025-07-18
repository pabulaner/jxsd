package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Bar3DChartModel;
import com.scell.model.drawingml.chart.CT_BarDirModel;
import com.scell.model.drawingml.chart.CT_BarGroupingModel;
import com.scell.model.drawingml.chart.CT_BarSerModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_GapAmountModel;
import com.scell.model.drawingml.chart.CT_ShapeModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_Bar3DChartBuilder {
  private CT_BarDirModel barDir;

  private CT_BarGroupingModel grouping;

  private CT_BooleanModel varyColors;

  private List<CT_BarSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_GapAmountModel gapWidth;

  private CT_GapAmountModel gapDepth;

  private CT_ShapeModel shape;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_Bar3DChartBuilder() {
  }

  public CT_Bar3DChartBuilder setBarDir(CT_BarDirModel barDir) {
    this.barDir = barDir;
    return this;
  }

  public CT_Bar3DChartBuilder setGrouping(CT_BarGroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public CT_Bar3DChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_Bar3DChartBuilder setSer(List<CT_BarSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_Bar3DChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_Bar3DChartBuilder setGapWidth(CT_GapAmountModel gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

  public CT_Bar3DChartBuilder setGapDepth(CT_GapAmountModel gapDepth) {
    this.gapDepth = gapDepth;
    return this;
  }

  public CT_Bar3DChartBuilder setShape(CT_ShapeModel shape) {
    this.shape = shape;
    return this;
  }

  public CT_Bar3DChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_Bar3DChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_Bar3DChartModel build() {
    return new CT_Bar3DChartModel(this.barDir, this.grouping, this.varyColors, this.ser, this.dLbls, this.gapWidth, this.gapDepth, this.shape, this.axId, this.extLst);
  }

  public CT_Bar3DChartBuilder from(CT_Bar3DChartModel value) {
    this.barDir = value.getBarDir();
    this.grouping = value.getGrouping();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.gapWidth = value.getGapWidth();
    this.gapDepth = value.getGapDepth();
    this.shape = value.getShape();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
