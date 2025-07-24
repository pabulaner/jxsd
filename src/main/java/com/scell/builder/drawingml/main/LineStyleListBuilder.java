package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LinePropertiesModel;
import com.scell.model.drawingml.main.LineStyleListModel;
import java.util.List;

public class LineStyleListBuilder {
  private List<LinePropertiesModel> ln;

  public LineStyleListBuilder() {
  }

  public LineStyleListBuilder setLn(List<LinePropertiesModel> ln) {
    this.ln = ln;
    return this;
  }

  public LineStyleListModel build() {
    return new LineStyleListModel(this.ln);
  }

  public LineStyleListBuilder from(LineStyleListModel value) {
    this.ln = value.getLn();
    return this;
  }
}
