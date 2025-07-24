package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetMaterialTypeModel;
import org.docx4j.dml.STPresetMaterialType;

public class PresetMaterialTypeConverter {
  private PresetMaterialTypeConverter() {
  }

  public static PresetMaterialTypeModel fromDocx4J(STPresetMaterialType value) {
    if (value == null) return null;
    if (value == STPresetMaterialType.LEGACY_MATTE) return PresetMaterialTypeModel.LEGACY_MATTE;
    if (value == STPresetMaterialType.LEGACY_PLASTIC) return PresetMaterialTypeModel.LEGACY_PLASTIC;
    if (value == STPresetMaterialType.LEGACY_METAL) return PresetMaterialTypeModel.LEGACY_METAL;
    if (value == STPresetMaterialType.LEGACY_WIREFRAME) return PresetMaterialTypeModel.LEGACY_WIREFRAME;
    if (value == STPresetMaterialType.MATTE) return PresetMaterialTypeModel.MATTE;
    if (value == STPresetMaterialType.PLASTIC) return PresetMaterialTypeModel.PLASTIC;
    if (value == STPresetMaterialType.METAL) return PresetMaterialTypeModel.METAL;
    if (value == STPresetMaterialType.WARM_MATTE) return PresetMaterialTypeModel.WARM_MATTE;
    if (value == STPresetMaterialType.TRANSLUCENT_POWDER) return PresetMaterialTypeModel.TRANSLUCENT_POWDER;
    if (value == STPresetMaterialType.POWDER) return PresetMaterialTypeModel.POWDER;
    if (value == STPresetMaterialType.DK_EDGE) return PresetMaterialTypeModel.DK_EDGE;
    if (value == STPresetMaterialType.SOFT_EDGE) return PresetMaterialTypeModel.SOFT_EDGE;
    if (value == STPresetMaterialType.CLEAR) return PresetMaterialTypeModel.CLEAR;
    if (value == STPresetMaterialType.FLAT) return PresetMaterialTypeModel.FLAT;
    if (value == STPresetMaterialType.SOFTMETAL) return PresetMaterialTypeModel.SOFTMETAL;
    return null;
  }
}
