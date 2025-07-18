package com.scell.model.drawingml.main;

import java.util.List;

public class CT_LineStyleListModel {
  private final List<CT_LinePropertiesModel> ln;

  public CT_LineStyleListModel(List<CT_LinePropertiesModel> ln) {
    this.ln = ln;
  }

  public List<CT_LinePropertiesModel> getLn() {
    return this.ln;
  }
}
