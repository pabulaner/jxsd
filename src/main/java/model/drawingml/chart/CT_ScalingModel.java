package model.drawingml.chart;

public class CT_ScalingModel {
  private final CT_LogBaseModel logBase;

  private final CT_OrientationModel orientation;

  private final CT_DoubleModel max;

  private final CT_DoubleModel min;

  private final CT_ExtensionListModel extLst;

  public CT_ScalingModel(CT_LogBaseModel logBase, CT_OrientationModel orientation,
      CT_DoubleModel max, CT_DoubleModel min, CT_ExtensionListModel extLst) {
    this.logBase = logBase;
    this.orientation = orientation;
    this.max = max;
    this.min = min;
    this.extLst = extLst;
  }

  public CT_LogBaseModel getLogBase() {
    return this.logBase;
  }

  public CT_OrientationModel getOrientation() {
    return this.orientation;
  }

  public CT_DoubleModel getMax() {
    return this.max;
  }

  public CT_DoubleModel getMin() {
    return this.min;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
