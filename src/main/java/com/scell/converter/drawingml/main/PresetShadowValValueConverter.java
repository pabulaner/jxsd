package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetShadowValValueModel;
import org.docx4j.dml.STPresetShadowVal;

public class PresetShadowValValueConverter {
  private PresetShadowValValueConverter() {
  }

  public static PresetShadowValValueModel fromDocx4J(STPresetShadowVal value) {
    if (value == null) return null;
    if (value == STPresetShadowVal.SHDW_1) return PresetShadowValValueModel.SHDW_1;
    if (value == STPresetShadowVal.SHDW_2) return PresetShadowValValueModel.SHDW_2;
    if (value == STPresetShadowVal.SHDW_3) return PresetShadowValValueModel.SHDW_3;
    if (value == STPresetShadowVal.SHDW_4) return PresetShadowValValueModel.SHDW_4;
    if (value == STPresetShadowVal.SHDW_5) return PresetShadowValValueModel.SHDW_5;
    if (value == STPresetShadowVal.SHDW_6) return PresetShadowValValueModel.SHDW_6;
    if (value == STPresetShadowVal.SHDW_7) return PresetShadowValValueModel.SHDW_7;
    if (value == STPresetShadowVal.SHDW_8) return PresetShadowValValueModel.SHDW_8;
    if (value == STPresetShadowVal.SHDW_9) return PresetShadowValValueModel.SHDW_9;
    if (value == STPresetShadowVal.SHDW_10) return PresetShadowValValueModel.SHDW_10;
    if (value == STPresetShadowVal.SHDW_11) return PresetShadowValValueModel.SHDW_11;
    if (value == STPresetShadowVal.SHDW_12) return PresetShadowValValueModel.SHDW_12;
    if (value == STPresetShadowVal.SHDW_13) return PresetShadowValValueModel.SHDW_13;
    if (value == STPresetShadowVal.SHDW_14) return PresetShadowValValueModel.SHDW_14;
    if (value == STPresetShadowVal.SHDW_15) return PresetShadowValValueModel.SHDW_15;
    if (value == STPresetShadowVal.SHDW_16) return PresetShadowValValueModel.SHDW_16;
    if (value == STPresetShadowVal.SHDW_17) return PresetShadowValValueModel.SHDW_17;
    if (value == STPresetShadowVal.SHDW_18) return PresetShadowValValueModel.SHDW_18;
    if (value == STPresetShadowVal.SHDW_19) return PresetShadowValValueModel.SHDW_19;
    if (value == STPresetShadowVal.SHDW_20) return PresetShadowValValueModel.SHDW_20;
    return null;
  }
}
