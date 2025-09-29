package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.LightRigTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum LightRigTypeValueModel {
  LEGACY_FLAT_1,

  LEGACY_FLAT_2,

  LEGACY_FLAT_3,

  LEGACY_FLAT_4,

  LEGACY_NORMAL_1,

  LEGACY_NORMAL_2,

  LEGACY_NORMAL_3,

  LEGACY_NORMAL_4,

  LEGACY_HARSH_1,

  LEGACY_HARSH_2,

  LEGACY_HARSH_3,

  LEGACY_HARSH_4,

  THREE_PT,

  BALANCED,

  SOFT,

  HARSH,

  FLOOD,

  CONTRASTING,

  MORNING,

  SUNRISE,

  SUNSET,

  CHILLY,

  FREEZING,

  FLAT,

  TWO_PT,

  GLOW,

  BRIGHT_ROOM;

  public LightRigTypeValueBuilder builder() {
    return new LightRigTypeValueBuilder().from(this);
  }
}
