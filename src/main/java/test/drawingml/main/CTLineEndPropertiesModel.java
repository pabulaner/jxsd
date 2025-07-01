package test.drawingml.main;

public class CTLineEndPropertiesModel {
  private final STLineEndTypeModel type;

  private final STLineEndWidthModel w;

  private final STLineEndLengthModel len;

  public CTLineEndPropertiesModel(STLineEndTypeModel type, STLineEndWidthModel w,
      STLineEndLengthModel len) {
    this.type = type;
    this.w = w;
    this.len = len;
  }

  public STLineEndTypeModel getType() {
    return this.type;
  }

  public STLineEndWidthModel getW() {
    return this.w;
  }

  public STLineEndLengthModel getLen() {
    return this.len;
  }
}
