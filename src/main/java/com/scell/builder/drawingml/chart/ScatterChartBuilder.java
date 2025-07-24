package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.ScatterChartModel;
import com.scell.model.drawingml.chart.ScatterSerModel;
import com.scell.model.drawingml.chart.ScatterStyleModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class ScatterChartBuilder {
  private ScatterStyleModel scatterStyle;

  private BooleanModel varyColors;

  private List<ScatterSerModel> ser;

  private DLblsModel dLbls;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public ScatterChartBuilder() {
  }

  public ScatterChartBuilder setScatterStyle(ScatterStyleModel scatterStyle) {
    this.scatterStyle = scatterStyle;
    return this;
  }

  public ScatterChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public ScatterChartBuilder setSer(List<ScatterSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public ScatterChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public ScatterChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public ScatterChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ScatterChartModel build() {
    return new ScatterChartModel(this.scatterStyle, this.varyColors, this.ser, this.dLbls, this.axId, this.extLst);
  }

  public ScatterChartBuilder from(ScatterChartModel value) {
    this.scatterStyle = value.getScatterStyle();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
