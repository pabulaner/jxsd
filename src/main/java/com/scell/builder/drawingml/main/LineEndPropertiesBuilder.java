package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineEndLengthModel;
import com.scell.model.drawingml.main.LineEndPropertiesModel;
import com.scell.model.drawingml.main.LineEndTypeModel;
import com.scell.model.drawingml.main.LineEndWidthModel;

public class LineEndPropertiesBuilder {
  private LineEndTypeModel type;

  private LineEndWidthModel w;

  private LineEndLengthModel len;

  public LineEndPropertiesBuilder() {
  }

  public LineEndPropertiesBuilder setType(LineEndTypeModel type) {
    this.type = type;
    return this;
  }

  public LineEndPropertiesBuilder setW(LineEndWidthModel w) {
    this.w = w;
    return this;
  }

  public LineEndPropertiesBuilder setLen(LineEndLengthModel len) {
    this.len = len;
    return this;
  }

  public LineEndPropertiesModel build() {
    return new LineEndPropertiesModel(this.type, this.w, this.len);
  }

  public LineEndPropertiesBuilder from(LineEndPropertiesModel value) {
    this.type = value.getType();
    this.w = value.getW();
    this.len = value.getLen();
    return this;
  }
}
