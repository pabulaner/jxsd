package com.scell.model.drawingml.chartDrawing;

import java.lang.Integer;
import java.lang.Object;

public class CT_DrawingModel {
  private final int type;

  private final Object value;

  public CT_DrawingModel() {
    this(-1, null);
  }

  private CT_DrawingModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_DrawingModel newRelSizeAnchor(CT_RelSizeAnchorModel value) {
    return new CT_DrawingModel(0, value);
  }

  public boolean isRelSizeAnchor() {
    return this.type == 0;
  }

  public CT_RelSizeAnchorModel getRelSizeAnchor() {
    return (CT_RelSizeAnchorModel) this.value;
  }

  public static CT_DrawingModel newAbsSizeAnchor(CT_AbsSizeAnchorModel value) {
    return new CT_DrawingModel(1, value);
  }

  public boolean isAbsSizeAnchor() {
    return this.type == 1;
  }

  public CT_AbsSizeAnchorModel getAbsSizeAnchor() {
    return (CT_AbsSizeAnchorModel) this.value;
  }
}
