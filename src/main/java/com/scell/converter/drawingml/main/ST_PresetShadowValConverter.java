package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetShadowValModel;
import org.docx4j.dml.STPresetShadowVal;

public class ST_PresetShadowValConverter {
  private ST_PresetShadowValConverter() {
  }

  public static ST_PresetShadowValModel fromDocx4j(STPresetShadowVal value) {
    if (value == null) return null;
    if (value == STPresetShadowVal.SHDW1) return ST_PresetShadowValModel.SHDW1;
    if (value == STPresetShadowVal.SHDW2) return ST_PresetShadowValModel.SHDW2;
    if (value == STPresetShadowVal.SHDW3) return ST_PresetShadowValModel.SHDW3;
    if (value == STPresetShadowVal.SHDW4) return ST_PresetShadowValModel.SHDW4;
    if (value == STPresetShadowVal.SHDW5) return ST_PresetShadowValModel.SHDW5;
    if (value == STPresetShadowVal.SHDW6) return ST_PresetShadowValModel.SHDW6;
    if (value == STPresetShadowVal.SHDW7) return ST_PresetShadowValModel.SHDW7;
    if (value == STPresetShadowVal.SHDW8) return ST_PresetShadowValModel.SHDW8;
    if (value == STPresetShadowVal.SHDW9) return ST_PresetShadowValModel.SHDW9;
    if (value == STPresetShadowVal.SHDW10) return ST_PresetShadowValModel.SHDW10;
    if (value == STPresetShadowVal.SHDW11) return ST_PresetShadowValModel.SHDW11;
    if (value == STPresetShadowVal.SHDW12) return ST_PresetShadowValModel.SHDW12;
    if (value == STPresetShadowVal.SHDW13) return ST_PresetShadowValModel.SHDW13;
    if (value == STPresetShadowVal.SHDW14) return ST_PresetShadowValModel.SHDW14;
    if (value == STPresetShadowVal.SHDW15) return ST_PresetShadowValModel.SHDW15;
    if (value == STPresetShadowVal.SHDW16) return ST_PresetShadowValModel.SHDW16;
    if (value == STPresetShadowVal.SHDW17) return ST_PresetShadowValModel.SHDW17;
    if (value == STPresetShadowVal.SHDW18) return ST_PresetShadowValModel.SHDW18;
    if (value == STPresetShadowVal.SHDW19) return ST_PresetShadowValModel.SHDW19;
    if (value == STPresetShadowVal.SHDW20) return ST_PresetShadowValModel.SHDW20;
    return null;
  }

  public static STPresetShadowVal toDocx4j(ST_PresetShadowValModel value) {
    return null;
  }
}
