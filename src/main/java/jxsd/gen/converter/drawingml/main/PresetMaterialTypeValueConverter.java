package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetMaterialTypeValueModel;
import org.docx4j.dml.STPresetMaterialType;

/**
 * This is a generated enum class.
 */
public class PresetMaterialTypeValueConverter {
  private PresetMaterialTypeValueConverter() {
  }

  public static PresetMaterialTypeValueModel fromDocx4j(STPresetMaterialType value) {
    if (value == null) return null;
    if (value == STPresetMaterialType.LEGACY_MATTE) return PresetMaterialTypeValueModel.LEGACY_MATTE;
    if (value == STPresetMaterialType.LEGACY_PLASTIC) return PresetMaterialTypeValueModel.LEGACY_PLASTIC;
    if (value == STPresetMaterialType.LEGACY_METAL) return PresetMaterialTypeValueModel.LEGACY_METAL;
    if (value == STPresetMaterialType.LEGACY_WIREFRAME) return PresetMaterialTypeValueModel.LEGACY_WIREFRAME;
    if (value == STPresetMaterialType.MATTE) return PresetMaterialTypeValueModel.MATTE;
    if (value == STPresetMaterialType.PLASTIC) return PresetMaterialTypeValueModel.PLASTIC;
    if (value == STPresetMaterialType.METAL) return PresetMaterialTypeValueModel.METAL;
    if (value == STPresetMaterialType.WARM_MATTE) return PresetMaterialTypeValueModel.WARM_MATTE;
    if (value == STPresetMaterialType.TRANSLUCENT_POWDER) return PresetMaterialTypeValueModel.TRANSLUCENT_POWDER;
    if (value == STPresetMaterialType.POWDER) return PresetMaterialTypeValueModel.POWDER;
    if (value == STPresetMaterialType.DK_EDGE) return PresetMaterialTypeValueModel.DK_EDGE;
    if (value == STPresetMaterialType.SOFT_EDGE) return PresetMaterialTypeValueModel.SOFT_EDGE;
    if (value == STPresetMaterialType.CLEAR) return PresetMaterialTypeValueModel.CLEAR;
    if (value == STPresetMaterialType.FLAT) return PresetMaterialTypeValueModel.FLAT;
    if (value == STPresetMaterialType.SOFTMETAL) return PresetMaterialTypeValueModel.SOFTMETAL;
    return null;
  }

  public static STPresetMaterialType toDocx4j(PresetMaterialTypeValueModel value) {
    if (value == null) return null;
    if (value == PresetMaterialTypeValueModel.LEGACY_MATTE) return STPresetMaterialType.LEGACY_MATTE;
    if (value == PresetMaterialTypeValueModel.LEGACY_PLASTIC) return STPresetMaterialType.LEGACY_PLASTIC;
    if (value == PresetMaterialTypeValueModel.LEGACY_METAL) return STPresetMaterialType.LEGACY_METAL;
    if (value == PresetMaterialTypeValueModel.LEGACY_WIREFRAME) return STPresetMaterialType.LEGACY_WIREFRAME;
    if (value == PresetMaterialTypeValueModel.MATTE) return STPresetMaterialType.MATTE;
    if (value == PresetMaterialTypeValueModel.PLASTIC) return STPresetMaterialType.PLASTIC;
    if (value == PresetMaterialTypeValueModel.METAL) return STPresetMaterialType.METAL;
    if (value == PresetMaterialTypeValueModel.WARM_MATTE) return STPresetMaterialType.WARM_MATTE;
    if (value == PresetMaterialTypeValueModel.TRANSLUCENT_POWDER) return STPresetMaterialType.TRANSLUCENT_POWDER;
    if (value == PresetMaterialTypeValueModel.POWDER) return STPresetMaterialType.POWDER;
    if (value == PresetMaterialTypeValueModel.DK_EDGE) return STPresetMaterialType.DK_EDGE;
    if (value == PresetMaterialTypeValueModel.SOFT_EDGE) return STPresetMaterialType.SOFT_EDGE;
    if (value == PresetMaterialTypeValueModel.CLEAR) return STPresetMaterialType.CLEAR;
    if (value == PresetMaterialTypeValueModel.FLAT) return STPresetMaterialType.FLAT;
    if (value == PresetMaterialTypeValueModel.SOFTMETAL) return STPresetMaterialType.SOFTMETAL;
    return null;
  }
}
