package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_FontReferenceModel;
import com.scell.model.drawingml.main.CT_ShapeStyleModel;
import com.scell.model.drawingml.main.CT_StyleMatrixReferenceModel;

public class CT_ShapeStyleBuilder {
  private CT_StyleMatrixReferenceModel lnRef;

  private CT_StyleMatrixReferenceModel fillRef;

  private CT_StyleMatrixReferenceModel effectRef;

  private CT_FontReferenceModel fontRef;

  public CT_ShapeStyleBuilder() {
  }

  public CT_ShapeStyleBuilder setLnRef(CT_StyleMatrixReferenceModel lnRef) {
    this.lnRef = lnRef;
    return this;
  }

  public CT_ShapeStyleBuilder setFillRef(CT_StyleMatrixReferenceModel fillRef) {
    this.fillRef = fillRef;
    return this;
  }

  public CT_ShapeStyleBuilder setEffectRef(CT_StyleMatrixReferenceModel effectRef) {
    this.effectRef = effectRef;
    return this;
  }

  public CT_ShapeStyleBuilder setFontRef(CT_FontReferenceModel fontRef) {
    this.fontRef = fontRef;
    return this;
  }

  public CT_ShapeStyleModel build() {
    return new CT_ShapeStyleModel(this.lnRef, this.fillRef, this.effectRef, this.fontRef);
  }

  public CT_ShapeStyleBuilder from(CT_ShapeStyleModel value) {
    this.lnRef = value.getLnRef();
    this.fillRef = value.getFillRef();
    this.effectRef = value.getEffectRef();
    this.fontRef = value.getFontRef();
    return this;
  }
}
