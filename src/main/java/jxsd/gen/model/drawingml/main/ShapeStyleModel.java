package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.ShapeStyleBuilder;

/**
 * This is a generated sequence class.
 */
public class ShapeStyleModel {
  private final StyleMatrixReferenceModel lnRef;

  private final StyleMatrixReferenceModel fillRef;

  private final StyleMatrixReferenceModel effectRef;

  private final FontReferenceModel fontRef;

  public ShapeStyleModel(StyleMatrixReferenceModel lnRef, StyleMatrixReferenceModel fillRef,
      StyleMatrixReferenceModel effectRef, FontReferenceModel fontRef) {
    this.lnRef = lnRef;
    this.fillRef = fillRef;
    this.effectRef = effectRef;
    this.fontRef = fontRef;
  }

  public ShapeStyleBuilder builder() {
    return new ShapeStyleBuilder().from(this);
  }

  public StyleMatrixReferenceModel getLnRef() {
    return this.lnRef;
  }

  public StyleMatrixReferenceModel getFillRef() {
    return this.fillRef;
  }

  public StyleMatrixReferenceModel getEffectRef() {
    return this.effectRef;
  }

  public FontReferenceModel getFontRef() {
    return this.fontRef;
  }
}
