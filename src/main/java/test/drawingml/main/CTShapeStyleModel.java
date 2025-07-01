package test.drawingml.main;

public class CTShapeStyleModel {
  private final CTStyleMatrixReferenceModel lnRef;

  private final CTStyleMatrixReferenceModel fillRef;

  private final CTStyleMatrixReferenceModel effectRef;

  private final CTFontReferenceModel fontRef;

  public CTShapeStyleModel(CTStyleMatrixReferenceModel lnRef, CTStyleMatrixReferenceModel fillRef,
      CTStyleMatrixReferenceModel effectRef, CTFontReferenceModel fontRef) {
    this.lnRef = lnRef;
    this.fillRef = fillRef;
    this.effectRef = effectRef;
    this.fontRef = fontRef;
  }

  public CTStyleMatrixReferenceModel getLnRef() {
    return this.lnRef;
  }

  public CTStyleMatrixReferenceModel getFillRef() {
    return this.fillRef;
  }

  public CTStyleMatrixReferenceModel getEffectRef() {
    return this.effectRef;
  }

  public CTFontReferenceModel getFontRef() {
    return this.fontRef;
  }
}
