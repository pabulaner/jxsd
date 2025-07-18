package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_FirstSliceAngModel;
import com.scell.model.drawingml.chart.CT_PieChartModel;
import com.scell.model.drawingml.chart.CT_PieSerModel;
import java.util.List;

public class CT_PieChartBuilder {
  private CT_BooleanModel varyColors;

  private List<CT_PieSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_FirstSliceAngModel firstSliceAng;

  private CT_ExtensionListModel extLst;

  public CT_PieChartBuilder() {
  }

  public CT_PieChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_PieChartBuilder setSer(List<CT_PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_PieChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_PieChartBuilder setFirstSliceAng(CT_FirstSliceAngModel firstSliceAng) {
    this.firstSliceAng = firstSliceAng;
    return this;
  }

  public CT_PieChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_PieChartModel build() {
    return new CT_PieChartModel(this.varyColors, this.ser, this.dLbls, this.firstSliceAng, this.extLst);
  }

  public CT_PieChartBuilder from(CT_PieChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.firstSliceAng = value.getFirstSliceAng();
    this.extLst = value.getExtLst();
    return this;
  }
}
