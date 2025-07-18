package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetMaterialTypeModel;
import org.docx4j.dml.STPresetMaterialType;

public class ST_PresetMaterialTypeConverter {
  private ST_PresetMaterialTypeConverter() {
  }

  public static ST_PresetMaterialTypeModel fromDocx4J(STPresetMaterialType value) {
    if (value == null) return null;
    if (value == STPresetMaterialType.LEGACY_MATTE) return ST_PresetMaterialTypeModel.LEGACY_MATTE;
    if (value == STPresetMaterialType.LEGACY_PLASTIC) return ST_PresetMaterialTypeModel.LEGACY_PLASTIC;
    if (value == STPresetMaterialType.LEGACY_METAL) return ST_PresetMaterialTypeModel.LEGACY_METAL;
    if (value == STPresetMaterialType.LEGACY_WIREFRAME) return ST_PresetMaterialTypeModel.LEGACY_WIREFRAME;
    if (value == STPresetMaterialType.MATTE) return ST_PresetMaterialTypeModel.MATTE;
    if (value == STPresetMaterialType.PLASTIC) return ST_PresetMaterialTypeModel.PLASTIC;
    if (value == STPresetMaterialType.METAL) return ST_PresetMaterialTypeModel.METAL;
    if (value == STPresetMaterialType.WARM_MATTE) return ST_PresetMaterialTypeModel.WARM_MATTE;
    if (value == STPresetMaterialType.TRANSLUCENT_POWDER) return ST_PresetMaterialTypeModel.TRANSLUCENT_POWDER;
    if (value == STPresetMaterialType.POWDER) return ST_PresetMaterialTypeModel.POWDER;
    if (value == STPresetMaterialType.DK_EDGE) return ST_PresetMaterialTypeModel.DK_EDGE;
    if (value == STPresetMaterialType.SOFT_EDGE) return ST_PresetMaterialTypeModel.SOFT_EDGE;
    if (value == STPresetMaterialType.CLEAR) return ST_PresetMaterialTypeModel.CLEAR;
    if (value == STPresetMaterialType.FLAT) return ST_PresetMaterialTypeModel.FLAT;
    if (value == STPresetMaterialType.SOFTMETAL) return ST_PresetMaterialTypeModel.SOFTMETAL;
    return null;
  }

  public static STPresetMaterialType toDocx4J(ST_PresetMaterialTypeModel value) {
    return null;
  }
}
