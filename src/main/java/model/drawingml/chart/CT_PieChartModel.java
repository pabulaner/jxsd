package model.drawingml.chart;

import java.util.List;

public class CT_PieChartModel {
  private final CT_BooleanModel varyColors;

  private final List<CT_PieSerModel> ser;

  private final CT_DLblsModel dLbls;

  private final CT_FirstSliceAngModel firstSliceAng;

  private final CT_ExtensionListModel extLst;

  public CT_PieChartModel(CT_BooleanModel varyColors, List<CT_PieSerModel> ser, CT_DLblsModel dLbls,
      CT_FirstSliceAngModel firstSliceAng, CT_ExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.firstSliceAng = firstSliceAng;
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

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
