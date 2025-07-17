package model.drawingml.chart;

import java.util.List;

public class CT_Pie3DChartModel {
  private final CT_BooleanModel varyColors;

  private final List<CT_PieSerModel> ser;

  private final CT_DLblsModel dLbls;

  private final CT_ExtensionListModel extLst;

  public CT_Pie3DChartModel(CT_BooleanModel varyColors, List<CT_PieSerModel> ser,
      CT_DLblsModel dLbls, CT_ExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
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

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
