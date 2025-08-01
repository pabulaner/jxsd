package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetMaterialTypeValueModel;
import org.docx4j.dml.STPresetMaterialType;

public class PresetMaterialTypeValueConverter {
  private PresetMaterialTypeValueConverter() {
  }

  public static PresetMaterialTypeValueModel fromDocx4J(STPresetMaterialType value) {
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
}
