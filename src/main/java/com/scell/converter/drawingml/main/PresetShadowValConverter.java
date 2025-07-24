package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetShadowValModel;
import org.docx4j.dml.STPresetShadowVal;

public class PresetShadowValConverter {
  private PresetShadowValConverter() {
  }

  public static PresetShadowValModel fromDocx4J(STPresetShadowVal value) {
    if (value == null) return null;
    if (value == STPresetShadowVal.SHDW_1) return PresetShadowValModel.SHDW_1;
    if (value == STPresetShadowVal.SHDW_2) return PresetShadowValModel.SHDW_2;
    if (value == STPresetShadowVal.SHDW_3) return PresetShadowValModel.SHDW_3;
    if (value == STPresetShadowVal.SHDW_4) return PresetShadowValModel.SHDW_4;
    if (value == STPresetShadowVal.SHDW_5) return PresetShadowValModel.SHDW_5;
    if (value == STPresetShadowVal.SHDW_6) return PresetShadowValModel.SHDW_6;
    if (value == STPresetShadowVal.SHDW_7) return PresetShadowValModel.SHDW_7;
    if (value == STPresetShadowVal.SHDW_8) return PresetShadowValModel.SHDW_8;
    if (value == STPresetShadowVal.SHDW_9) return PresetShadowValModel.SHDW_9;
    if (value == STPresetShadowVal.SHDW_10) return PresetShadowValModel.SHDW_10;
    if (value == STPresetShadowVal.SHDW_11) return PresetShadowValModel.SHDW_11;
    if (value == STPresetShadowVal.SHDW_12) return PresetShadowValModel.SHDW_12;
    if (value == STPresetShadowVal.SHDW_13) return PresetShadowValModel.SHDW_13;
    if (value == STPresetShadowVal.SHDW_14) return PresetShadowValModel.SHDW_14;
    if (value == STPresetShadowVal.SHDW_15) return PresetShadowValModel.SHDW_15;
    if (value == STPresetShadowVal.SHDW_16) return PresetShadowValModel.SHDW_16;
    if (value == STPresetShadowVal.SHDW_17) return PresetShadowValModel.SHDW_17;
    if (value == STPresetShadowVal.SHDW_18) return PresetShadowValModel.SHDW_18;
    if (value == STPresetShadowVal.SHDW_19) return PresetShadowValModel.SHDW_19;
    if (value == STPresetShadowVal.SHDW_20) return PresetShadowValModel.SHDW_20;
    return null;
  }
}
