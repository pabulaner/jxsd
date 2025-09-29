package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LineEndLengthValueModel;
import jxsd.gen.model.drawingml.main.LineEndPropertiesModel;
import jxsd.gen.model.drawingml.main.LineEndTypeValueModel;
import jxsd.gen.model.drawingml.main.LineEndWidthValueModel;

/**
 * This is a generated sequence class.
 */
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

  public LineEndPropertiesBuilder from(LineEndPropertiesModel value) {
    this.type = value.getType();
    this.w = value.getW();
    this.len = value.getLen();
    return this;
  }

  public LineEndPropertiesModel build() {
    return new LineEndPropertiesModel(this.type, this.w, this.len);
  }
}
