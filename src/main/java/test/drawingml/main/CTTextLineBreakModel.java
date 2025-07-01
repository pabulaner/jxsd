package test.drawingml.main;

public class CTTextLineBreakModel {
  private final CTTextCharacterPropertiesModel rPr;

  public CTTextLineBreakModel(CTTextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
  }

  public CTTextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }
}
