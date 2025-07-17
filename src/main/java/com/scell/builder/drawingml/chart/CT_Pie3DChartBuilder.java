package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_Pie3DChartModel;
import com.scell.model.drawingml.chart.CT_PieSerModel;
import java.util.List;

public class CT_Pie3DChartBuilder {
  private CT_BooleanModel varyColors;

  private List<CT_PieSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_ExtensionListModel extLst;

  public CT_Pie3DChartBuilder() {
  }

  public CT_Pie3DChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_Pie3DChartBuilder setSer(List<CT_PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_Pie3DChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_Pie3DChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_Pie3DChartModel build() {
    return new CT_Pie3DChartModel(this.varyColors, this.ser, this.dLbls, this.extLst);
  }

  public CT_Pie3DChartBuilder from(CT_Pie3DChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.extLst = value.getExtLst();
    return this;
  }
}
