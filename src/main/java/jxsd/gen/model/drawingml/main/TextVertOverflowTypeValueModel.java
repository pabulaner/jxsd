package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextVertOverflowTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TextVertOverflowTypeValueModel {
  OVERFLOW,

  ELLIPSIS,

  CLIP;

  public TextVertOverflowTypeValueBuilder builder() {
    return new TextVertOverflowTypeValueBuilder().from(this);
  }
}
