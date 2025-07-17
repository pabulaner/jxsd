package model.drawingml.main;

import model.XMLSchema.byteModel;
import model.XMLSchema.stringModel;

public class CT_TextFontModel {
  private final byteModel charset;

  private final typefaceModel typeface;

  private final panoseModel panose;

  private final byteModel pitchFamily;

  public CT_TextFontModel(byteModel charset, typefaceModel typeface, panoseModel panose,
      byteModel pitchFamily) {
    this.charset = charset;
    this.typeface = typeface;
    this.panose = panose;
    this.pitchFamily = pitchFamily;
  }

  public byteModel getCharset() {
    return this.charset;
  }

  public typefaceModel getTypeface() {
    return this.typeface;
  }

  public panoseModel getPanose() {
    return this.panose;
  }

  public byteModel getPitchFamily() {
    return this.pitchFamily;
  }

  public static class typefaceModel extends stringModel {
    public typefaceModel(String value) {
      super(value);
    }
  }

  public static class panoseModel extends stringModel {
    public panoseModel(String value) {
      super(value);
    }
  }
}
