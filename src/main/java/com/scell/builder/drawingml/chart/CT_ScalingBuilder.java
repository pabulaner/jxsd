package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DoubleModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LogBaseModel;
import com.scell.model.drawingml.chart.CT_OrientationModel;
import com.scell.model.drawingml.chart.CT_ScalingModel;

public class CT_ScalingBuilder {
  private CT_LogBaseModel logBase;

  private CT_OrientationModel orientation;

  private CT_DoubleModel max;

  private CT_DoubleModel min;

  private CT_ExtensionListModel extLst;

  public CT_ScalingBuilder() {
  }

  public CT_ScalingBuilder setLogBase(CT_LogBaseModel logBase) {
    this.logBase = logBase;
    return this;
  }

  public CT_ScalingBuilder setOrientation(CT_OrientationModel orientation) {
    this.orientation = orientation;
    return this;
  }

  public CT_ScalingBuilder setMax(CT_DoubleModel max) {
    this.max = max;
    return this;
  }

  public CT_ScalingBuilder setMin(CT_DoubleModel min) {
    this.min = min;
    return this;
  }

  public CT_ScalingBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ScalingModel build() {
    return new CT_ScalingModel(this.logBase, this.orientation, this.max, this.min, this.extLst);
  }

  public CT_ScalingBuilder from(CT_ScalingModel value) {
    this.logBase = value.getLogBase();
    this.orientation = value.getOrientation();
    this.max = value.getMax();
    this.min = value.getMin();
    this.extLst = value.getExtLst();
    return this;
  }
}
