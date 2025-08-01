package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetLineDashValValueModel;
import org.docx4j.dml.STPresetLineDashVal;

public class PresetLineDashValValueConverter {
  private PresetLineDashValValueConverter() {
  }

  public static PresetLineDashValValueModel fromDocx4J(STPresetLineDashVal value) {
    if (value == null) return null;
    if (value == STPresetLineDashVal.SOLID) return PresetLineDashValValueModel.SOLID;
    if (value == STPresetLineDashVal.DOT) return PresetLineDashValValueModel.DOT;
    if (value == STPresetLineDashVal.DASH) return PresetLineDashValValueModel.DASH;
    if (value == STPresetLineDashVal.LG_DASH) return PresetLineDashValValueModel.LG_DASH;
    if (value == STPresetLineDashVal.DASH_DOT) return PresetLineDashValValueModel.DASH_DOT;
    if (value == STPresetLineDashVal.LG_DASH_DOT) return PresetLineDashValValueModel.LG_DASH_DOT;
    if (value == STPresetLineDashVal.LG_DASH_DOT_DOT) return PresetLineDashValValueModel.LG_DASH_DOT_DOT;
    if (value == STPresetLineDashVal.SYS_DASH) return PresetLineDashValValueModel.SYS_DASH;
    if (value == STPresetLineDashVal.SYS_DOT) return PresetLineDashValValueModel.SYS_DOT;
    if (value == STPresetLineDashVal.SYS_DASH_DOT) return PresetLineDashValValueModel.SYS_DASH_DOT;
    if (value == STPresetLineDashVal.SYS_DASH_DOT_DOT) return PresetLineDashValValueModel.SYS_DASH_DOT_DOT;
    return null;
  }
}
