package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetShadowValModel;
import org.docx4j.dml.STPresetShadowVal;

public class ST_PresetShadowValConverter {
  private ST_PresetShadowValConverter() {
  }

  public static ST_PresetShadowValModel fromDocx4J(STPresetShadowVal value) {
    if (value == null) return null;
    if (value == STPresetShadowVal.SHDW_1) return ST_PresetShadowValModel.SHDW_1;
    if (value == STPresetShadowVal.SHDW_2) return ST_PresetShadowValModel.SHDW_2;
    if (value == STPresetShadowVal.SHDW_3) return ST_PresetShadowValModel.SHDW_3;
    if (value == STPresetShadowVal.SHDW_4) return ST_PresetShadowValModel.SHDW_4;
    if (value == STPresetShadowVal.SHDW_5) return ST_PresetShadowValModel.SHDW_5;
    if (value == STPresetShadowVal.SHDW_6) return ST_PresetShadowValModel.SHDW_6;
    if (value == STPresetShadowVal.SHDW_7) return ST_PresetShadowValModel.SHDW_7;
    if (value == STPresetShadowVal.SHDW_8) return ST_PresetShadowValModel.SHDW_8;
    if (value == STPresetShadowVal.SHDW_9) return ST_PresetShadowValModel.SHDW_9;
    if (value == STPresetShadowVal.SHDW_10) return ST_PresetShadowValModel.SHDW_10;
    if (value == STPresetShadowVal.SHDW_11) return ST_PresetShadowValModel.SHDW_11;
    if (value == STPresetShadowVal.SHDW_12) return ST_PresetShadowValModel.SHDW_12;
    if (value == STPresetShadowVal.SHDW_13) return ST_PresetShadowValModel.SHDW_13;
    if (value == STPresetShadowVal.SHDW_14) return ST_PresetShadowValModel.SHDW_14;
    if (value == STPresetShadowVal.SHDW_15) return ST_PresetShadowValModel.SHDW_15;
    if (value == STPresetShadowVal.SHDW_16) return ST_PresetShadowValModel.SHDW_16;
    if (value == STPresetShadowVal.SHDW_17) return ST_PresetShadowValModel.SHDW_17;
    if (value == STPresetShadowVal.SHDW_18) return ST_PresetShadowValModel.SHDW_18;
    if (value == STPresetShadowVal.SHDW_19) return ST_PresetShadowValModel.SHDW_19;
    if (value == STPresetShadowVal.SHDW_20) return ST_PresetShadowValModel.SHDW_20;
    return null;
  }

  public static STPresetShadowVal toDocx4J(ST_PresetShadowValModel value) {
    return null;
  }
}
