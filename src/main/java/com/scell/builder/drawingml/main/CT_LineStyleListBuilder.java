package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_LinePropertiesModel;
import com.scell.model.drawingml.main.CT_LineStyleListModel;
import java.util.List;

public class CT_LineStyleListBuilder {
  private List<CT_LinePropertiesModel> ln;

  public CT_LineStyleListBuilder() {
  }

  public CT_LineStyleListBuilder setLn(List<CT_LinePropertiesModel> ln) {
    this.ln = ln;
    return this;
  }

  public CT_LineStyleListModel build() {
    return new CT_LineStyleListModel(this.ln);
  }

  public CT_LineStyleListBuilder from(CT_LineStyleListModel value) {
    this.ln = value.getLn();
    return this;
  }
}
