package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_ScatterChartModel;
import com.scell.model.drawingml.chart.CT_ScatterSerModel;
import com.scell.model.drawingml.chart.CT_ScatterStyleModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_ScatterChartBuilder {
  private CT_ScatterStyleModel scatterStyle;

  private CT_BooleanModel varyColors;

  private List<CT_ScatterSerModel> ser;

  private CT_DLblsModel dLbls;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_ScatterChartBuilder() {
  }

  public CT_ScatterChartBuilder setScatterStyle(CT_ScatterStyleModel scatterStyle) {
    this.scatterStyle = scatterStyle;
    return this;
  }

  public CT_ScatterChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_ScatterChartBuilder setSer(List<CT_ScatterSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_ScatterChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_ScatterChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_ScatterChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ScatterChartModel build() {
    return new CT_ScatterChartModel(this.scatterStyle, this.varyColors, this.ser, this.dLbls, this.axId, this.extLst);
  }

  public CT_ScatterChartBuilder from(CT_ScatterChartModel value) {
    this.scatterStyle = value.getScatterStyle();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
