package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.DoughnutChartModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.FirstSliceAngModel;
import com.scell.model.drawingml.chart.HoleSizeModel;
import com.scell.model.drawingml.chart.PieSerModel;
import java.util.List;

public class DoughnutChartBuilder {
  private BooleanModel varyColors;

  private List<PieSerModel> ser;

  private DLblsModel dLbls;

  private FirstSliceAngModel firstSliceAng;

  private HoleSizeModel holeSize;

  private ExtensionListModel extLst;

  public DoughnutChartBuilder() {
  }

  public DoughnutChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public DoughnutChartBuilder setSer(List<PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public DoughnutChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public DoughnutChartBuilder setFirstSliceAng(FirstSliceAngModel firstSliceAng) {
    this.firstSliceAng = firstSliceAng;
    return this;
  }

  public DoughnutChartBuilder setHoleSize(HoleSizeModel holeSize) {
    this.holeSize = holeSize;
    return this;
  }

  public DoughnutChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DoughnutChartModel build() {
    return new DoughnutChartModel(this.varyColors, this.ser, this.dLbls, this.firstSliceAng, this.holeSize, this.extLst);
  }

  public DoughnutChartBuilder from(DoughnutChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.firstSliceAng = value.getFirstSliceAng();
    this.holeSize = value.getHoleSize();
    this.extLst = value.getExtLst();
    return this;
  }
}
