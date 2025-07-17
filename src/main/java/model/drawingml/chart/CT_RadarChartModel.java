package model.drawingml.chart;

import java.util.List;

public class CT_RadarChartModel {
  private final CT_RadarStyleModel radarStyle;

  private final CT_BooleanModel varyColors;

  private final List<CT_RadarSerModel> ser;

  private final CT_DLblsModel dLbls;

  private final List<CT_UnsignedIntModel> axId;

  private final CT_ExtensionListModel extLst;

  public CT_RadarChartModel(CT_RadarStyleModel radarStyle, CT_BooleanModel varyColors,
      List<CT_RadarSerModel> ser, CT_DLblsModel dLbls, List<CT_UnsignedIntModel> axId,
      CT_ExtensionListModel extLst) {
    this.radarStyle = radarStyle;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CT_RadarStyleModel getRadarStyle() {
    return this.radarStyle;
  }

  public CT_BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<CT_RadarSerModel> getSer() {
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
