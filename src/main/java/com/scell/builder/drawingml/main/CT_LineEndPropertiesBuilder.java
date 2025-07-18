package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_LineEndPropertiesModel;
import com.scell.model.drawingml.main.ST_LineEndLengthModel;
import com.scell.model.drawingml.main.ST_LineEndTypeModel;
import com.scell.model.drawingml.main.ST_LineEndWidthModel;

public class CT_LineEndPropertiesBuilder {
  private ST_LineEndTypeModel type;

  private ST_LineEndWidthModel w;

  private ST_LineEndLengthModel len;

  public CT_LineEndPropertiesBuilder() {
  }

  public CT_LineEndPropertiesBuilder setType(ST_LineEndTypeModel type) {
    this.type = type;
    return this;
  }

  public CT_LineEndPropertiesBuilder setW(ST_LineEndWidthModel w) {
    this.w = w;
    return this;
  }

  public CT_LineEndPropertiesBuilder setLen(ST_LineEndLengthModel len) {
    this.len = len;
    return this;
  }

  public CT_LineEndPropertiesModel build() {
    return new CT_LineEndPropertiesModel(this.type, this.w, this.len);
  }

  public CT_LineEndPropertiesBuilder from(CT_LineEndPropertiesModel value) {
    this.type = value.getType();
    this.w = value.getW();
    this.len = value.getLen();
    return this;
  }
}
