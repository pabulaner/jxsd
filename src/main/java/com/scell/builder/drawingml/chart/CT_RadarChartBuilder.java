package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_RadarChartModel;
import com.scell.model.drawingml.chart.CT_RadarSerModel;
import com.scell.model.drawingml.chart.CT_RadarStyleModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_RadarChartBuilder {
  private CT_RadarStyleModel radarStyle;

  private CT_BooleanModel varyColors;

  private List<CT_RadarSerModel> ser;

  private CT_DLblsModel dLbls;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_RadarChartBuilder() {
  }

  public CT_RadarChartBuilder setRadarStyle(CT_RadarStyleModel radarStyle) {
    this.radarStyle = radarStyle;
    return this;
  }

  public CT_RadarChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_RadarChartBuilder setSer(List<CT_RadarSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_RadarChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_RadarChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_RadarChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_RadarChartModel build() {
    return new CT_RadarChartModel(this.radarStyle, this.varyColors, this.ser, this.dLbls, this.axId, this.extLst);
  }

  public CT_RadarChartBuilder from(CT_RadarChartModel value) {
    this.radarStyle = value.getRadarStyle();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
