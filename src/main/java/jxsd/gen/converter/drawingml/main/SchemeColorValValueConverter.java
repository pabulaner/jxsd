package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.SchemeColorValValueBuilder;
import jxsd.gen.model.drawingml.main.SchemeColorValValueModel;
import org.docx4j.dml.STSchemeColorVal;

/**
 * This is a generated enum class.
 */
public class SchemeColorValValueConverter {
  private SchemeColorValValueConverter() {
  }

  public static SchemeColorValValueModel fromDocx4j(STSchemeColorVal value) {
    if (value == null) return null;
    if (value == SchemeColorValValueBuilder.BG_1) return SchemeColorValValueModel.BG_1;
    if (value == SchemeColorValValueBuilder.TX_1) return SchemeColorValValueModel.TX_1;
    if (value == SchemeColorValValueBuilder.BG_2) return SchemeColorValValueModel.BG_2;
    if (value == SchemeColorValValueBuilder.TX_2) return SchemeColorValValueModel.TX_2;
    if (value == SchemeColorValValueBuilder.ACCENT_1) return SchemeColorValValueModel.ACCENT_1;
    if (value == SchemeColorValValueBuilder.ACCENT_2) return SchemeColorValValueModel.ACCENT_2;
    if (value == SchemeColorValValueBuilder.ACCENT_3) return SchemeColorValValueModel.ACCENT_3;
    if (value == SchemeColorValValueBuilder.ACCENT_4) return SchemeColorValValueModel.ACCENT_4;
    if (value == SchemeColorValValueBuilder.ACCENT_5) return SchemeColorValValueModel.ACCENT_5;
    if (value == SchemeColorValValueBuilder.ACCENT_6) return SchemeColorValValueModel.ACCENT_6;
    if (value == SchemeColorValValueBuilder.HLINK) return SchemeColorValValueModel.HLINK;
    if (value == SchemeColorValValueBuilder.FOL_HLINK) return SchemeColorValValueModel.FOL_HLINK;
    if (value == SchemeColorValValueBuilder.PH_CLR) return SchemeColorValValueModel.PH_CLR;
    if (value == SchemeColorValValueBuilder.DK_1) return SchemeColorValValueModel.DK_1;
    if (value == SchemeColorValValueBuilder.LT_1) return SchemeColorValValueModel.LT_1;
    if (value == SchemeColorValValueBuilder.DK_2) return SchemeColorValValueModel.DK_2;
    if (value == SchemeColorValValueBuilder.LT_2) return SchemeColorValValueModel.LT_2;
    return null;
  }

  public static STSchemeColorVal toDocx4j(SchemeColorValValueModel value) {
    if (value == null) return null;
    if (value == SchemeColorValValueModel.BG_1) return SchemeColorValValueBuilder.BG_1;
    if (value == SchemeColorValValueModel.TX_1) return SchemeColorValValueBuilder.TX_1;
    if (value == SchemeColorValValueModel.BG_2) return SchemeColorValValueBuilder.BG_2;
    if (value == SchemeColorValValueModel.TX_2) return SchemeColorValValueBuilder.TX_2;
    if (value == SchemeColorValValueModel.ACCENT_1) return SchemeColorValValueBuilder.ACCENT_1;
    if (value == SchemeColorValValueModel.ACCENT_2) return SchemeColorValValueBuilder.ACCENT_2;
    if (value == SchemeColorValValueModel.ACCENT_3) return SchemeColorValValueBuilder.ACCENT_3;
    if (value == SchemeColorValValueModel.ACCENT_4) return SchemeColorValValueBuilder.ACCENT_4;
    if (value == SchemeColorValValueModel.ACCENT_5) return SchemeColorValValueBuilder.ACCENT_5;
    if (value == SchemeColorValValueModel.ACCENT_6) return SchemeColorValValueBuilder.ACCENT_6;
    if (value == SchemeColorValValueModel.HLINK) return SchemeColorValValueBuilder.HLINK;
    if (value == SchemeColorValValueModel.FOL_HLINK) return SchemeColorValValueBuilder.FOL_HLINK;
    if (value == SchemeColorValValueModel.PH_CLR) return SchemeColorValValueBuilder.PH_CLR;
    if (value == SchemeColorValValueModel.DK_1) return SchemeColorValValueBuilder.DK_1;
    if (value == SchemeColorValValueModel.LT_1) return SchemeColorValValueBuilder.LT_1;
    if (value == SchemeColorValValueModel.DK_2) return SchemeColorValValueBuilder.DK_2;
    if (value == SchemeColorValValueModel.LT_2) return SchemeColorValValueBuilder.LT_2;
    return null;
  }
}
