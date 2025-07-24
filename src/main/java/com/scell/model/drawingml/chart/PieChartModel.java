package com.scell.model.drawingml.chart;

import java.util.List;

public class PieChartModel {
  private final BooleanModel varyColors;

  private final List<PieSerModel> ser;

  private final DLblsModel dLbls;

  private final FirstSliceAngModel firstSliceAng;

  private final ExtensionListModel extLst;

  public PieChartModel(BooleanModel varyColors, List<PieSerModel> ser, DLblsModel dLbls,
      FirstSliceAngModel firstSliceAng, ExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.firstSliceAng = firstSliceAng;
    this.extLst = extLst;
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<PieSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public FirstSliceAngModel getFirstSliceAng() {
    return this.firstSliceAng;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
