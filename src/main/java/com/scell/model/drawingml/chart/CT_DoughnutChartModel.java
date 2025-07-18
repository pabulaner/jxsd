package com.scell.model.drawingml.chart;

import java.util.List;

public class CT_DoughnutChartModel {
  private final CT_BooleanModel varyColors;

  private final List<CT_PieSerModel> ser;

  private final CT_DLblsModel dLbls;

  private final CT_FirstSliceAngModel firstSliceAng;

  private final CT_HoleSizeModel holeSize;

  private final CT_ExtensionListModel extLst;

  public CT_DoughnutChartModel(CT_BooleanModel varyColors, List<CT_PieSerModel> ser,
      CT_DLblsModel dLbls, CT_FirstSliceAngModel firstSliceAng, CT_HoleSizeModel holeSize,
      CT_ExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.firstSliceAng = firstSliceAng;
    this.holeSize = holeSize;
    this.extLst = extLst;
  }

  public CT_BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<CT_PieSerModel> getSer() {
    return this.ser;
  }

  public CT_DLblsModel getDLbls() {
    return this.dLbls;
  }

  public CT_FirstSliceAngModel getFirstSliceAng() {
    return this.firstSliceAng;
  }

  public CT_HoleSizeModel getHoleSize() {
    return this.holeSize;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
