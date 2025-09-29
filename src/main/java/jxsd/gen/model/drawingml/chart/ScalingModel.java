package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ScalingBuilder;

/**
 * This is a generated sequence class.
 */
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

  public ScalingBuilder builder() {
    return new ScalingBuilder().from(this);
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
