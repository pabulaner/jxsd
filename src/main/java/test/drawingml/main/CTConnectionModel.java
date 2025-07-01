package test.drawingml.main;

import test.XMLSchema.UnsignedIntModel;

public class CTConnectionModel {
  private final STDrawingElementIdModel id;

  private final UnsignedIntModel idx;

  public CTConnectionModel(STDrawingElementIdModel id, UnsignedIntModel idx) {
    this.id = id;
    this.idx = idx;
  }

  public STDrawingElementIdModel getId() {
    return this.id;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }
}
