package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.LineEndLengthValueBuilder;

/**
 * This is a generated enum class.
 */
public enum LineEndLengthValueModel {
  SM,

  MED,

  LG;

  public LineEndLengthValueBuilder builder() {
    return new LineEndLengthValueBuilder().from(this);
  }
}
