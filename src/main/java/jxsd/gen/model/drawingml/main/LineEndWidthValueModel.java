package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.LineEndWidthValueBuilder;

/**
 * This is a generated enum class.
 */
public enum LineEndWidthValueModel {
  SM,

  MED,

  LG;

  public LineEndWidthValueBuilder builder() {
    return new LineEndWidthValueBuilder().from(this);
  }
}
