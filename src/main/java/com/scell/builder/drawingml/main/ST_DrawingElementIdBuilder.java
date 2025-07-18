package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_DrawingElementIdModel;

public class ST_DrawingElementIdBuilder {
  private Long value;

  public ST_DrawingElementIdBuilder() {
    this.value = null;
  }

  public ST_DrawingElementIdBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_DrawingElementIdBuilder from(ST_DrawingElementIdModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_DrawingElementIdModel build() {
    return new ST_DrawingElementIdModel(this.value);
  }
}
