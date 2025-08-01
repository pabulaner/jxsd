package com.scell.model.drawingml.chart;

import java.util.List;

public class DoughnutChartModel implements IPieChartValueModel {
  private final BooleanModel varyColors;

  private final List<PieSerModel> ser;

  private final DLblsModel dLbls;

  private final FirstSliceAngModel firstSliceAng;

  private final HoleSizeModel holeSize;

  private final ExtensionListModel extLst;

  public DoughnutChartModel(BooleanModel varyColors, List<PieSerModel> ser, DLblsModel dLbls,
      FirstSliceAngModel firstSliceAng, HoleSizeModel holeSize, ExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.firstSliceAng = firstSliceAng;
    this.holeSize = holeSize;
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

  public HoleSizeModel getHoleSize() {
    return this.holeSize;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
