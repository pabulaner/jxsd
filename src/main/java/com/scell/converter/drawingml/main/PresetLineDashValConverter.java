package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetLineDashValModel;
import org.docx4j.dml.STPresetLineDashVal;

public class PresetLineDashValConverter {
  private PresetLineDashValConverter() {
  }

  public static PresetLineDashValModel fromDocx4J(STPresetLineDashVal value) {
    if (value == null) return null;
    if (value == STPresetLineDashVal.SOLID) return PresetLineDashValModel.SOLID;
    if (value == STPresetLineDashVal.DOT) return PresetLineDashValModel.DOT;
    if (value == STPresetLineDashVal.DASH) return PresetLineDashValModel.DASH;
    if (value == STPresetLineDashVal.LG_DASH) return PresetLineDashValModel.LG_DASH;
    if (value == STPresetLineDashVal.DASH_DOT) return PresetLineDashValModel.DASH_DOT;
    if (value == STPresetLineDashVal.LG_DASH_DOT) return PresetLineDashValModel.LG_DASH_DOT;
    if (value == STPresetLineDashVal.LG_DASH_DOT_DOT) return PresetLineDashValModel.LG_DASH_DOT_DOT;
    if (value == STPresetLineDashVal.SYS_DASH) return PresetLineDashValModel.SYS_DASH;
    if (value == STPresetLineDashVal.SYS_DOT) return PresetLineDashValModel.SYS_DOT;
    if (value == STPresetLineDashVal.SYS_DASH_DOT) return PresetLineDashValModel.SYS_DASH_DOT;
    if (value == STPresetLineDashVal.SYS_DASH_DOT_DOT) return PresetLineDashValModel.SYS_DASH_DOT_DOT;
    return null;
  }
}
