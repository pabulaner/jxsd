package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.PresetLineDashValValueBuilder;
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
    if (value == PresetLineDashValValueBuilder.SOLID) return PresetLineDashValValueModel.SOLID;
    if (value == PresetLineDashValValueBuilder.DOT) return PresetLineDashValValueModel.DOT;
    if (value == PresetLineDashValValueBuilder.DASH) return PresetLineDashValValueModel.DASH;
    if (value == PresetLineDashValValueBuilder.LG_DASH) return PresetLineDashValValueModel.LG_DASH;
    if (value == PresetLineDashValValueBuilder.DASH_DOT) return PresetLineDashValValueModel.DASH_DOT;
    if (value == PresetLineDashValValueBuilder.LG_DASH_DOT) return PresetLineDashValValueModel.LG_DASH_DOT;
    if (value == PresetLineDashValValueBuilder.LG_DASH_DOT_DOT) return PresetLineDashValValueModel.LG_DASH_DOT_DOT;
    if (value == PresetLineDashValValueBuilder.SYS_DASH) return PresetLineDashValValueModel.SYS_DASH;
    if (value == PresetLineDashValValueBuilder.SYS_DOT) return PresetLineDashValValueModel.SYS_DOT;
    if (value == PresetLineDashValValueBuilder.SYS_DASH_DOT) return PresetLineDashValValueModel.SYS_DASH_DOT;
    if (value == PresetLineDashValValueBuilder.SYS_DASH_DOT_DOT) return PresetLineDashValValueModel.SYS_DASH_DOT_DOT;
    return null;
  }

  public static STPresetLineDashVal toDocx4j(PresetLineDashValValueModel value) {
    if (value == null) return null;
    if (value == PresetLineDashValValueModel.SOLID) return PresetLineDashValValueBuilder.SOLID;
    if (value == PresetLineDashValValueModel.DOT) return PresetLineDashValValueBuilder.DOT;
    if (value == PresetLineDashValValueModel.DASH) return PresetLineDashValValueBuilder.DASH;
    if (value == PresetLineDashValValueModel.LG_DASH) return PresetLineDashValValueBuilder.LG_DASH;
    if (value == PresetLineDashValValueModel.DASH_DOT) return PresetLineDashValValueBuilder.DASH_DOT;
    if (value == PresetLineDashValValueModel.LG_DASH_DOT) return PresetLineDashValValueBuilder.LG_DASH_DOT;
    if (value == PresetLineDashValValueModel.LG_DASH_DOT_DOT) return PresetLineDashValValueBuilder.LG_DASH_DOT_DOT;
    if (value == PresetLineDashValValueModel.SYS_DASH) return PresetLineDashValValueBuilder.SYS_DASH;
    if (value == PresetLineDashValValueModel.SYS_DOT) return PresetLineDashValValueBuilder.SYS_DOT;
    if (value == PresetLineDashValValueModel.SYS_DASH_DOT) return PresetLineDashValValueBuilder.SYS_DASH_DOT;
    if (value == PresetLineDashValValueModel.SYS_DASH_DOT_DOT) return PresetLineDashValValueBuilder.SYS_DASH_DOT_DOT;
    return null;
  }
}
