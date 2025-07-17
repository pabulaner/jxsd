package model.drawingml.main;

import model.XMLSchema.unsignedIntModel;

public class CT_ConnectionModel {
  private final ST_DrawingElementIdModel id;

  private final unsignedIntModel idx;

  public CT_ConnectionModel(ST_DrawingElementIdModel id, unsignedIntModel idx) {
    this.id = id;
    this.idx = idx;
  }

  public ST_DrawingElementIdModel getId() {
    return this.id;
  }

  public unsignedIntModel getIdx() {
    return this.idx;
  }
}
