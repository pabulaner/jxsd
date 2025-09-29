package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PresetLineDashValValueBuilder;

/**
 * This is a generated enum class.
 */
public enum PresetLineDashValValueModel {
  SOLID,

  DOT,

  DASH,

  LG_DASH,

  DASH_DOT,

  LG_DASH_DOT,

  LG_DASH_DOT_DOT,

  SYS_DASH,

  SYS_DOT,

  SYS_DASH_DOT,

  SYS_DASH_DOT_DOT;

  public PresetLineDashValValueBuilder builder() {
    return new PresetLineDashValValueBuilder().from(this);
  }
}
