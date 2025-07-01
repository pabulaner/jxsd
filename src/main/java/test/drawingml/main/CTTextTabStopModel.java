package test.drawingml.main;

public class CTTextTabStopModel {
  private final STCoordinate32Model pos;

  private final STTextTabAlignTypeModel algn;

  public CTTextTabStopModel(STCoordinate32Model pos, STTextTabAlignTypeModel algn) {
    this.pos = pos;
    this.algn = algn;
  }

  public STCoordinate32Model getPos() {
    return this.pos;
  }

  public STTextTabAlignTypeModel getAlgn() {
    return this.algn;
  }
}
