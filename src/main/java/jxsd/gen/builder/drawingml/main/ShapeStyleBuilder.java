package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.FontReferenceModel;
import jxsd.gen.model.drawingml.main.ShapeStyleModel;
import jxsd.gen.model.drawingml.main.StyleMatrixReferenceModel;

/**
 * This is a generated sequence class.
 */
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

  public ShapeStyleBuilder from(ShapeStyleModel value) {
    this.lnRef = value.getLnRef();
    this.fillRef = value.getFillRef();
    this.effectRef = value.getEffectRef();
    this.fontRef = value.getFontRef();
    return this;
  }

  public ShapeStyleModel build() {
    return new ShapeStyleModel(this.lnRef, this.fillRef, this.effectRef, this.fontRef);
  }
}
