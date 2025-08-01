package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineEndLengthValueModel;
import com.scell.model.drawingml.main.LineEndPropertiesModel;
import com.scell.model.drawingml.main.LineEndTypeValueModel;
import com.scell.model.drawingml.main.LineEndWidthValueModel;

public class LineEndPropertiesBuilder {
  private LineEndTypeValueModel type;

  private LineEndWidthValueModel w;

  private LineEndLengthValueModel len;

  public LineEndPropertiesBuilder() {
  }

  public LineEndPropertiesBuilder setType(LineEndTypeValueModel type) {
    this.type = type;
    return this;
  }

  public LineEndPropertiesBuilder setW(LineEndWidthValueModel w) {
    this.w = w;
    return this;
  }

  public LineEndPropertiesBuilder setLen(LineEndLengthValueModel len) {
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
