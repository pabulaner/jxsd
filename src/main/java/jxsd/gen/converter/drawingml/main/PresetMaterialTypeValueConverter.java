package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.PresetMaterialTypeValueBuilder;
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
    if (value == PresetMaterialTypeValueBuilder.LEGACY_MATTE) return PresetMaterialTypeValueModel.LEGACY_MATTE;
    if (value == PresetMaterialTypeValueBuilder.LEGACY_PLASTIC) return PresetMaterialTypeValueModel.LEGACY_PLASTIC;
    if (value == PresetMaterialTypeValueBuilder.LEGACY_METAL) return PresetMaterialTypeValueModel.LEGACY_METAL;
    if (value == PresetMaterialTypeValueBuilder.LEGACY_WIREFRAME) return PresetMaterialTypeValueModel.LEGACY_WIREFRAME;
    if (value == PresetMaterialTypeValueBuilder.MATTE) return PresetMaterialTypeValueModel.MATTE;
    if (value == PresetMaterialTypeValueBuilder.PLASTIC) return PresetMaterialTypeValueModel.PLASTIC;
    if (value == PresetMaterialTypeValueBuilder.METAL) return PresetMaterialTypeValueModel.METAL;
    if (value == PresetMaterialTypeValueBuilder.WARM_MATTE) return PresetMaterialTypeValueModel.WARM_MATTE;
    if (value == PresetMaterialTypeValueBuilder.TRANSLUCENT_POWDER) return PresetMaterialTypeValueModel.TRANSLUCENT_POWDER;
    if (value == PresetMaterialTypeValueBuilder.POWDER) return PresetMaterialTypeValueModel.POWDER;
    if (value == PresetMaterialTypeValueBuilder.DK_EDGE) return PresetMaterialTypeValueModel.DK_EDGE;
    if (value == PresetMaterialTypeValueBuilder.SOFT_EDGE) return PresetMaterialTypeValueModel.SOFT_EDGE;
    if (value == PresetMaterialTypeValueBuilder.CLEAR) return PresetMaterialTypeValueModel.CLEAR;
    if (value == PresetMaterialTypeValueBuilder.FLAT) return PresetMaterialTypeValueModel.FLAT;
    if (value == PresetMaterialTypeValueBuilder.SOFTMETAL) return PresetMaterialTypeValueModel.SOFTMETAL;
    return null;
  }

  public static STPresetMaterialType toDocx4j(PresetMaterialTypeValueModel value) {
    if (value == null) return null;
    if (value == PresetMaterialTypeValueModel.LEGACY_MATTE) return PresetMaterialTypeValueBuilder.LEGACY_MATTE;
    if (value == PresetMaterialTypeValueModel.LEGACY_PLASTIC) return PresetMaterialTypeValueBuilder.LEGACY_PLASTIC;
    if (value == PresetMaterialTypeValueModel.LEGACY_METAL) return PresetMaterialTypeValueBuilder.LEGACY_METAL;
    if (value == PresetMaterialTypeValueModel.LEGACY_WIREFRAME) return PresetMaterialTypeValueBuilder.LEGACY_WIREFRAME;
    if (value == PresetMaterialTypeValueModel.MATTE) return PresetMaterialTypeValueBuilder.MATTE;
    if (value == PresetMaterialTypeValueModel.PLASTIC) return PresetMaterialTypeValueBuilder.PLASTIC;
    if (value == PresetMaterialTypeValueModel.METAL) return PresetMaterialTypeValueBuilder.METAL;
    if (value == PresetMaterialTypeValueModel.WARM_MATTE) return PresetMaterialTypeValueBuilder.WARM_MATTE;
    if (value == PresetMaterialTypeValueModel.TRANSLUCENT_POWDER) return PresetMaterialTypeValueBuilder.TRANSLUCENT_POWDER;
    if (value == PresetMaterialTypeValueModel.POWDER) return PresetMaterialTypeValueBuilder.POWDER;
    if (value == PresetMaterialTypeValueModel.DK_EDGE) return PresetMaterialTypeValueBuilder.DK_EDGE;
    if (value == PresetMaterialTypeValueModel.SOFT_EDGE) return PresetMaterialTypeValueBuilder.SOFT_EDGE;
    if (value == PresetMaterialTypeValueModel.CLEAR) return PresetMaterialTypeValueBuilder.CLEAR;
    if (value == PresetMaterialTypeValueModel.FLAT) return PresetMaterialTypeValueBuilder.FLAT;
    if (value == PresetMaterialTypeValueModel.SOFTMETAL) return PresetMaterialTypeValueBuilder.SOFTMETAL;
    return null;
  }
}
