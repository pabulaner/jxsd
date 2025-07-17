package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_AbsSizeAnchorModel;
import com.scell.model.drawingml.chartDrawing.CT_DrawingModel;
import com.scell.model.drawingml.chartDrawing.CT_RelSizeAnchorModel;
import java.lang.Object;

public class CT_DrawingBuilder {
  private int type;

  private Object value;

  public CT_DrawingBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_DrawingBuilder setRelSizeAnchor(CT_RelSizeAnchorModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_DrawingBuilder setAbsSizeAnchor(CT_AbsSizeAnchorModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_DrawingModel build() {
    if (this.type == -1) return new CT_DrawingModel();
    if (this.type == 0) return CT_DrawingModel.newRelSizeAnchor((CT_RelSizeAnchorModel) this.value);
    if (this.type == 1) return CT_DrawingModel.newAbsSizeAnchor((CT_AbsSizeAnchorModel) this.value);
    return null;
  }

  public CT_DrawingBuilder from(CT_DrawingModel value) {
    this.type = -1;
    this.value = null;
    if (value.isRelSizeAnchor()) {
      this.type = 0;
      this.value = value.getRelSizeAnchor();
    }
    if (value.isAbsSizeAnchor()) {
      this.type = 1;
      this.value = value.getAbsSizeAnchor();
    }
    return this;
  }
}
