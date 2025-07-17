package model.drawingml.chart;

import java.util.List;

public class CT_ScatterChartModel {
  private final CT_ScatterStyleModel scatterStyle;

  private final CT_BooleanModel varyColors;

  private final List<CT_ScatterSerModel> ser;

  private final CT_DLblsModel dLbls;

  private final List<CT_UnsignedIntModel> axId;

  private final CT_ExtensionListModel extLst;

  public CT_ScatterChartModel(CT_ScatterStyleModel scatterStyle, CT_BooleanModel varyColors,
      List<CT_ScatterSerModel> ser, CT_DLblsModel dLbls, List<CT_UnsignedIntModel> axId,
      CT_ExtensionListModel extLst) {
    this.scatterStyle = scatterStyle;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CT_ScatterStyleModel getScatterStyle() {
    return this.scatterStyle;
  }

  public CT_BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<CT_ScatterSerModel> getSer() {
    return this.ser;
  }

  public CT_DLblsModel getDLbls() {
    return this.dLbls;
  }

  public List<CT_UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
