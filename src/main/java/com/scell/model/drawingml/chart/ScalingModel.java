package com.scell.model.drawingml.chart;

public class ScalingModel {
  private final LogBaseModel logBase;

  private final OrientationModel orientation;

  private final DoubleModel max;

  private final DoubleModel min;

  private final ExtensionListModel extLst;

  public ScalingModel(LogBaseModel logBase, OrientationModel orientation, DoubleModel max,
      DoubleModel min, ExtensionListModel extLst) {
    this.logBase = logBase;
    this.orientation = orientation;
    this.max = max;
    this.min = min;
    this.extLst = extLst;
  }

  public LogBaseModel getLogBase() {
    return this.logBase;
  }

  public OrientationModel getOrientation() {
    return this.orientation;
  }

  public DoubleModel getMax() {
    return this.max;
  }

  public DoubleModel getMin() {
    return this.min;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
