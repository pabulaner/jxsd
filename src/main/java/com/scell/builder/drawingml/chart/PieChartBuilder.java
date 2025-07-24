package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.FirstSliceAngModel;
import com.scell.model.drawingml.chart.PieChartModel;
import com.scell.model.drawingml.chart.PieSerModel;
import java.util.List;

public class PieChartBuilder {
  private BooleanModel varyColors;

  private List<PieSerModel> ser;

  private DLblsModel dLbls;

  private FirstSliceAngModel firstSliceAng;

  private ExtensionListModel extLst;

  public PieChartBuilder() {
  }

  public PieChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public PieChartBuilder setSer(List<PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public PieChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public PieChartBuilder setFirstSliceAng(FirstSliceAngModel firstSliceAng) {
    this.firstSliceAng = firstSliceAng;
    return this;
  }

  public PieChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public PieChartModel build() {
    return new PieChartModel(this.varyColors, this.ser, this.dLbls, this.firstSliceAng, this.extLst);
  }

  public PieChartBuilder from(PieChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.firstSliceAng = value.getFirstSliceAng();
    this.extLst = value.getExtLst();
    return this;
  }
}
