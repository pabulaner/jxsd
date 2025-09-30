package jxsd.gen.converter.drawingml.main;

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
    if (value == STSchemeColorVal.BG_1) return SchemeColorValValueModel.BG_1;
    if (value == STSchemeColorVal.TX_1) return SchemeColorValValueModel.TX_1;
    if (value == STSchemeColorVal.BG_2) return SchemeColorValValueModel.BG_2;
    if (value == STSchemeColorVal.TX_2) return SchemeColorValValueModel.TX_2;
    if (value == STSchemeColorVal.ACCENT_1) return SchemeColorValValueModel.ACCENT_1;
    if (value == STSchemeColorVal.ACCENT_2) return SchemeColorValValueModel.ACCENT_2;
    if (value == STSchemeColorVal.ACCENT_3) return SchemeColorValValueModel.ACCENT_3;
    if (value == STSchemeColorVal.ACCENT_4) return SchemeColorValValueModel.ACCENT_4;
    if (value == STSchemeColorVal.ACCENT_5) return SchemeColorValValueModel.ACCENT_5;
    if (value == STSchemeColorVal.ACCENT_6) return SchemeColorValValueModel.ACCENT_6;
    if (value == STSchemeColorVal.HLINK) return SchemeColorValValueModel.HLINK;
    if (value == STSchemeColorVal.FOL_HLINK) return SchemeColorValValueModel.FOL_HLINK;
    if (value == STSchemeColorVal.PH_CLR) return SchemeColorValValueModel.PH_CLR;
    if (value == STSchemeColorVal.DK_1) return SchemeColorValValueModel.DK_1;
    if (value == STSchemeColorVal.LT_1) return SchemeColorValValueModel.LT_1;
    if (value == STSchemeColorVal.DK_2) return SchemeColorValValueModel.DK_2;
    if (value == STSchemeColorVal.LT_2) return SchemeColorValValueModel.LT_2;
    return null;
  }

  public static STSchemeColorVal toDocx4j(SchemeColorValValueModel value) {
    if (value == null) return null;
    if (value == SchemeColorValValueModel.BG_1) return STSchemeColorVal.BG_1;
    if (value == SchemeColorValValueModel.TX_1) return STSchemeColorVal.TX_1;
    if (value == SchemeColorValValueModel.BG_2) return STSchemeColorVal.BG_2;
    if (value == SchemeColorValValueModel.TX_2) return STSchemeColorVal.TX_2;
    if (value == SchemeColorValValueModel.ACCENT_1) return STSchemeColorVal.ACCENT_1;
    if (value == SchemeColorValValueModel.ACCENT_2) return STSchemeColorVal.ACCENT_2;
    if (value == SchemeColorValValueModel.ACCENT_3) return STSchemeColorVal.ACCENT_3;
    if (value == SchemeColorValValueModel.ACCENT_4) return STSchemeColorVal.ACCENT_4;
    if (value == SchemeColorValValueModel.ACCENT_5) return STSchemeColorVal.ACCENT_5;
    if (value == SchemeColorValValueModel.ACCENT_6) return STSchemeColorVal.ACCENT_6;
    if (value == SchemeColorValValueModel.HLINK) return STSchemeColorVal.HLINK;
    if (value == SchemeColorValValueModel.FOL_HLINK) return STSchemeColorVal.FOL_HLINK;
    if (value == SchemeColorValValueModel.PH_CLR) return STSchemeColorVal.PH_CLR;
    if (value == SchemeColorValValueModel.DK_1) return STSchemeColorVal.DK_1;
    if (value == SchemeColorValValueModel.LT_1) return STSchemeColorVal.LT_1;
    if (value == SchemeColorValValueModel.DK_2) return STSchemeColorVal.DK_2;
    if (value == SchemeColorValValueModel.LT_2) return STSchemeColorVal.LT_2;
    return null;
  }
}
