package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_DoughnutChartModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_FirstSliceAngModel;
import com.scell.model.drawingml.chart.CT_HoleSizeModel;
import com.scell.model.drawingml.chart.CT_PieSerModel;
import java.util.List;

public class CT_DoughnutChartBuilder {
  private CT_BooleanModel varyColors;

  private List<CT_PieSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_FirstSliceAngModel firstSliceAng;

  private CT_HoleSizeModel holeSize;

  private CT_ExtensionListModel extLst;

  public CT_DoughnutChartBuilder() {
  }

  public CT_DoughnutChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_DoughnutChartBuilder setSer(List<CT_PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_DoughnutChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_DoughnutChartBuilder setFirstSliceAng(CT_FirstSliceAngModel firstSliceAng) {
    this.firstSliceAng = firstSliceAng;
    return this;
  }

  public CT_DoughnutChartBuilder setHoleSize(CT_HoleSizeModel holeSize) {
    this.holeSize = holeSize;
    return this;
  }

  public CT_DoughnutChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_DoughnutChartModel build() {
    return new CT_DoughnutChartModel(this.varyColors, this.ser, this.dLbls, this.firstSliceAng, this.holeSize, this.extLst);
  }

  public CT_DoughnutChartBuilder from(CT_DoughnutChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.firstSliceAng = value.getFirstSliceAng();
    this.holeSize = value.getHoleSize();
    this.extLst = value.getExtLst();
    return this;
  }
}
