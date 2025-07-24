package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DoubleModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LogBaseModel;
import com.scell.model.drawingml.chart.OrientationModel;
import com.scell.model.drawingml.chart.ScalingModel;

public class ScalingBuilder {
  private LogBaseModel logBase;

  private OrientationModel orientation;

  private DoubleModel max;

  private DoubleModel min;

  private ExtensionListModel extLst;

  public ScalingBuilder() {
  }

  public ScalingBuilder setLogBase(LogBaseModel logBase) {
    this.logBase = logBase;
    return this;
  }

  public ScalingBuilder setOrientation(OrientationModel orientation) {
    this.orientation = orientation;
    return this;
  }

  public ScalingBuilder setMax(DoubleModel max) {
    this.max = max;
    return this;
  }

  public ScalingBuilder setMin(DoubleModel min) {
    this.min = min;
    return this;
  }

  public ScalingBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ScalingModel build() {
    return new ScalingModel(this.logBase, this.orientation, this.max, this.min, this.extLst);
  }

  public ScalingBuilder from(ScalingModel value) {
    this.logBase = value.getLogBase();
    this.orientation = value.getOrientation();
    this.max = value.getMax();
    this.min = value.getMin();
    this.extLst = value.getExtLst();
    return this;
  }
}
