package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FontReferenceModel;
import com.scell.model.drawingml.main.ShapeStyleModel;
import com.scell.model.drawingml.main.StyleMatrixReferenceModel;

public class ShapeStyleBuilder {
  private StyleMatrixReferenceModel lnRef;

  private StyleMatrixReferenceModel fillRef;

  private StyleMatrixReferenceModel effectRef;

  private FontReferenceModel fontRef;

  public ShapeStyleBuilder() {
  }

  public ShapeStyleBuilder setLnRef(StyleMatrixReferenceModel lnRef) {
    this.lnRef = lnRef;
    return this;
  }

  public ShapeStyleBuilder setFillRef(StyleMatrixReferenceModel fillRef) {
    this.fillRef = fillRef;
    return this;
  }

  public ShapeStyleBuilder setEffectRef(StyleMatrixReferenceModel effectRef) {
    this.effectRef = effectRef;
    return this;
  }

  public ShapeStyleBuilder setFontRef(FontReferenceModel fontRef) {
    this.fontRef = fontRef;
    return this;
  }

  public ShapeStyleModel build() {
    return new ShapeStyleModel(this.lnRef, this.fillRef, this.effectRef, this.fontRef);
  }

  public ShapeStyleBuilder from(ShapeStyleModel value) {
    this.lnRef = value.getLnRef();
    this.fillRef = value.getFillRef();
    this.effectRef = value.getEffectRef();
    this.fontRef = value.getFontRef();
    return this;
  }
}
