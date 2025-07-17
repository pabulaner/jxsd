package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetLineDashValModel;
import org.docx4j.dml.STPresetLineDashVal;

public class ST_PresetLineDashValConverter {
  private ST_PresetLineDashValConverter() {
  }

  public static ST_PresetLineDashValModel fromDocx4j(STPresetLineDashVal value) {
    if (value == null) return null;
    if (value == STPresetLineDashVal.SOLID) return ST_PresetLineDashValModel.SOLID;
    if (value == STPresetLineDashVal.DOT) return ST_PresetLineDashValModel.DOT;
    if (value == STPresetLineDashVal.DASH) return ST_PresetLineDashValModel.DASH;
    if (value == STPresetLineDashVal.LG_DASH) return ST_PresetLineDashValModel.LG_DASH;
    if (value == STPresetLineDashVal.DASH_DOT) return ST_PresetLineDashValModel.DASH_DOT;
    if (value == STPresetLineDashVal.LG_DASH_DOT) return ST_PresetLineDashValModel.LG_DASH_DOT;
    if (value == STPresetLineDashVal.LG_DASH_DOT_DOT) return ST_PresetLineDashValModel.LG_DASH_DOT_DOT;
    if (value == STPresetLineDashVal.SYS_DASH) return ST_PresetLineDashValModel.SYS_DASH;
    if (value == STPresetLineDashVal.SYS_DOT) return ST_PresetLineDashValModel.SYS_DOT;
    if (value == STPresetLineDashVal.SYS_DASH_DOT) return ST_PresetLineDashValModel.SYS_DASH_DOT;
    if (value == STPresetLineDashVal.SYS_DASH_DOT_DOT) return ST_PresetLineDashValModel.SYS_DASH_DOT_DOT;
    return null;
  }

  public static STPresetLineDashVal toDocx4j(ST_PresetLineDashValModel value) {
    return null;
  }
}
