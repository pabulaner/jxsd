package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetLineDashValValueModel;
import org.docx4j.dml.STPresetLineDashVal;

/**
 * This is a generated enum class.
 */
public class PresetLineDashValValueConverter {
  private PresetLineDashValValueConverter() {
  }

  public static PresetLineDashValValueModel fromDocx4j(STPresetLineDashVal value) {
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

  public static STPresetLineDashVal toDocx4j(PresetLineDashValValueModel value) {
    if (value == null) return null;
    if (value == PresetLineDashValValueModel.SOLID) return STPresetLineDashVal.SOLID;
    if (value == PresetLineDashValValueModel.DOT) return STPresetLineDashVal.DOT;
    if (value == PresetLineDashValValueModel.DASH) return STPresetLineDashVal.DASH;
    if (value == PresetLineDashValValueModel.LG_DASH) return STPresetLineDashVal.LG_DASH;
    if (value == PresetLineDashValValueModel.DASH_DOT) return STPresetLineDashVal.DASH_DOT;
    if (value == PresetLineDashValValueModel.LG_DASH_DOT) return STPresetLineDashVal.LG_DASH_DOT;
    if (value == PresetLineDashValValueModel.LG_DASH_DOT_DOT) return STPresetLineDashVal.LG_DASH_DOT_DOT;
    if (value == PresetLineDashValValueModel.SYS_DASH) return STPresetLineDashVal.SYS_DASH;
    if (value == PresetLineDashValValueModel.SYS_DOT) return STPresetLineDashVal.SYS_DOT;
    if (value == PresetLineDashValValueModel.SYS_DASH_DOT) return STPresetLineDashVal.SYS_DASH_DOT;
    if (value == PresetLineDashValValueModel.SYS_DASH_DOT_DOT) return STPresetLineDashVal.SYS_DASH_DOT_DOT;
    return null;
  }
}
