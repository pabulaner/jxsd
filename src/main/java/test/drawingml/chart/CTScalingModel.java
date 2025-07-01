package test.drawingml.chart;

public class CTScalingModel {
  private final CTLogBaseModel logBase;

  private final CTOrientationModel orientation;

  private final CTDoubleModel max;

  private final CTDoubleModel min;

  private final CTExtensionListModel extLst;

  public CTScalingModel(CTLogBaseModel logBase, CTOrientationModel orientation, CTDoubleModel max,
      CTDoubleModel min, CTExtensionListModel extLst) {
    this.logBase = logBase;
    this.orientation = orientation;
    this.max = max;
    this.min = min;
    this.extLst = extLst;
  }

  public CTLogBaseModel getLogBase() {
    return this.logBase;
  }

  public CTOrientationModel getOrientation() {
    return this.orientation;
  }

  public CTDoubleModel getMax() {
    return this.max;
  }

  public CTDoubleModel getMin() {
    return this.min;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
