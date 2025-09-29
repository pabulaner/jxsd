package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PresetMaterialTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum PresetMaterialTypeValueModel {
  LEGACY_MATTE,

  LEGACY_PLASTIC,

  LEGACY_METAL,

  LEGACY_WIREFRAME,

  MATTE,

  PLASTIC,

  METAL,

  WARM_MATTE,

  TRANSLUCENT_POWDER,

  POWDER,

  DK_EDGE,

  SOFT_EDGE,

  CLEAR,

  FLAT,

  SOFTMETAL;

  public PresetMaterialTypeValueBuilder builder() {
    return new PresetMaterialTypeValueBuilder().from(this);
  }
}
