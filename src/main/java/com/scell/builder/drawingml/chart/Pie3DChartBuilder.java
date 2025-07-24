package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.Pie3DChartModel;
import com.scell.model.drawingml.chart.PieSerModel;
import java.util.List;

public class Pie3DChartBuilder {
  private BooleanModel varyColors;

  private List<PieSerModel> ser;

  private DLblsModel dLbls;

  private ExtensionListModel extLst;

  public Pie3DChartBuilder() {
  }

  public Pie3DChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public Pie3DChartBuilder setSer(List<PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public Pie3DChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public Pie3DChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public Pie3DChartModel build() {
    return new Pie3DChartModel(this.varyColors, this.ser, this.dLbls, this.extLst);
  }

  public Pie3DChartBuilder from(Pie3DChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.extLst = value.getExtLst();
    return this;
  }
}
